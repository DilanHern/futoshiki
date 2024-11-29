package Controlador;

//librerias importadas
import Componentes.BotonRedondo;
import Vista.Jugar;
import Vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.*;
import Vista.MenuConfiguracion;
import Vista.MenuTop10;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;


public class ControladorJugar implements Serializable {
    private static final long serialVersionUID = 3L;
    private MenuTop10 vistaTop;
    private MenuConfiguracion vistaConf;
    private Jugar vista; //vista del juego
    private Juego juego; //contiene las partidas que se estan jugando
    private Configuracion configuracion; //contienen la configuracion establecida por el usuario
    private ArrayList<ArrayList<Top10>> top10;
    private JPanel panelDigitos = null; //contiene el panel del lado que esta en la configuracion
    private BotonRedondo digitoPresionado; //almacena el boton digito que fue presionado
    private List<String> jugadasEliminadas = new ArrayList<String>(); //Almancena las jugadas en caso de que se quiera rehacer y estas fueron borradas
    private List<String> jugadasRealizadas = new ArrayList<String>(); //Almancena las jugadas realizadas estas funcionan por si se borra algua
    private boolean borrador = false; //Sera true en caso de ser presionado, y este funciona para poder borrar una celda, por lo que se valida si esta en true
    private int dificultad; //1 facil, 2 normal, 3 dificil
    //------------------TIMER------------------------
    private Timer reloj;
    private int horas=0; //controla las horas que han concurrido
    private int minutos=0; //controla los minutos que han concurrido
    private int segundos=0; //controla los segundos que han concurrido
    private int tipo; //tipo de reloj que es utilizado en la ejecucion
    //----------------TIMER PARA LAS PARTIDAS INDIVIDUIALES----------
    private int horasPartida=0; //controla las horas que han concurrido en la partida unitaria
    private int minutosPartida=0; //controla los minutos que han concurrido en la partida unitaria
    private int segundosPartida=0; //controla los segundos que han concurrido en la partida unitaria
    private Timer temporizadorPartida = new Timer(1000, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        //aumenta las variables que mideen el tiempo en la partida
       segundosPartida++;
        if(segundosPartida == 59){
            segundosPartida=0;
            minutosPartida++;
        }
        if(minutosPartida==59){
            minutosPartida=0;
            horasPartida++;
        }
        }
    });
    
    /**
     * Reinicia los valores de la partida cada vez que esta es terminada este temporizador se encarga de tomar el tiempo de la partida sin importar si es un solo nivel o multinivel
     */
    private void reiniciarRelojPartida(){
    
          horasPartida=0; //controla las horas que han concurrido
          minutosPartida=0; //controla los minutos que han concurrido
          segundosPartida=0; //controla los segundos que han concurrido
          temporizadorPartida.stop();
          temporizadorPartida.restart();
    
    }
    
    
    /**
     * Ajusta el timer en la vista en relacion a la configuracion, este puede ser ocultado o mostrado asignando su valor correspondiente al tipo de timer
     */
    private void inicializarTimer(){
        if(tipo==3){
            vista.panelTiempo.setVisible(false);
        }if(tipo == 2 || tipo==1){
            reloj = new Timer(1000, (ActionEvent e) -> {
                    if(tipo==1){//cronometro
                        iniciarCronometro();
                    }
                    else{//temporizador
                        validarTemporizador();//valida que no haya  terminado el temporizador
                        iniciarTemporizador();//actualiza los valores del temporizador
                    }
            });
        }
    }
    
    
     /**
     * Inicializar el temporizador inciando en donde se ha configurado
     */
    private void iniciarTemporizador(){
        ActualizarTemporizador();
        ActualizarTexto();
    }
    
     /**
     * Actualiza el tiempo disminuyendolo como temporizador
     * En caso de cumplir el tiempo reinicia el valor y disminuye el siguiente
     */
    private void ActualizarTemporizador(){
        if(segundos>=0)
            segundos--;
        if(segundos < 0){
            
            if(minutos>0){
                segundos=59;
                minutos--;
            }
        }
        if(minutos==0){
            if(horas>0){
                minutos=59;
                segundos = 59;
                horas--;
            }
        }
    }
    
     /**
     * Valida si el temporizador ha llegado al fin que indico el jugador en la configuracion
     */
    private void validarTemporizador(){
        if(horas==0 && minutos == 0 && segundos==0){
            
            reloj.stop();
            Object[] options = { "Jugar", "Terminar Juego" }; 
            int choice = JOptionPane.showOptionDialog( 
            null, // Parent component (null means center on screen) 
            "El tiempo a terminado, quiere seguir jugando?", // Message to display 
            "Tiempo terminado", // Dialog title 
            JOptionPane.YES_NO_CANCEL_OPTION, // Option type (Yes, No, Cancel) 
            JOptionPane.QUESTION_MESSAGE, // Message type (question icon) 
            null, // Custom icon (null means no custom icon) 
            options, // Custom options array 
            options[0] // Initial selection (default is "Cancel") 
             ); 
            
            if (choice == JOptionPane.YES_NO_OPTION) {  //terminar juego
                //actualiza las horas para que continue el tiempo que fue llevado
                horas= configuracion.getHoras();
                minutos = configuracion.getMinutos();
                segundos = configuracion.getSegundos();
                tipo=1; //actualiza el tipo de reloj para que continue a cronometro
                reloj.start();
                
            } 
            else if (choice == JOptionPane.NO_OPTION) { 
                salirPartida();
            } 
        }
    }
    
    /**
     * Inicializar el cronometro empezando en 0
     */
    private void iniciarCronometro(){
        ActualizarCronometro();
        ActualizarTexto();
    }
    
     /**
     * Actualiza el tiempo aumentandolo como cronometro
     * En caso de cumplir el tiempo reinicia el valor y aumenta el siguiente
     */
    private void ActualizarCronometro(){
        segundos++;
        if(segundos == 60){
            segundos=0;
            minutos++;
        }
        if(minutos==60){
            minutos=0;
            horas++;
        }
    }
     /**
     * Actualiza el texto que muestra el tiempo en la pantalla
     */
    private void ActualizarTexto(){
        vista.txtHoras.setText(String.valueOf(horas));
        vista.txtMinutos.setText(String.valueOf(minutos));
        vista.txtSegundos.setText(String.valueOf(segundos));
    }
    
    /**
     */
    private void salirPartida(){
    
        MenuPrincipal vistaMenu = new MenuPrincipal();
        ControladorMenu controladorMenu = new ControladorMenu(vistaMenu,vistaConf, vistaTop, juego.getConfiguracion(), juego, top10);
        juego.getPartidaActual().setHaFinalizado(false);
         //Muestra el menu
        vistaMenu.setVisible(true);
        //Quita la visibilidad de la ventana actual
        vista.setVisible(false);
        if(reloj!=null && reloj.isRunning()){
                    reloj.stop(); //para el temporizador en caso de que se este ejecutando
                    juego.getPartidaActual().limpiarCuadricula();
         }
    }
    
    /**
     * Genera la cantidad de digitos en el panel de digitos indicado en relacion al tamano de la configuracion
     * asigna los eventos respectivos a cada digito
     */
    private void generarDigitos(){
      
        //Tamano de la cuadricula  
       int tamano = configuracion.getTamañoCuadricula();
       //Genera un layout para pintar los digitos en el panel
       panelDigitos.setLayout(new GridBagLayout());
       //Va a permitir indicar la posicion Y y X de los botones
       GridBagConstraints gridLayout = new GridBagConstraints();
       //Genera un relleno de ambos lados horizontal y vertical
       gridLayout.fill = GridBagConstraints.BOTH; 

       //genera los n botones necesarios
       for (int i = 0; i < tamano; i++) {

           //Crea el boton redondo numero i
           BotonRedondo digito = new Componentes.BotonRedondo();

           //Genera el evento del boton creado cuando es presionado
           digito.addActionListener(new ActionListener() {
               @Override
               
              
               //boton presionado
               public void actionPerformed(ActionEvent e) {
                   if(digitoPresionado!= null){
                        digitoPresionado.setColor1(new Color(255, 255, 255));
                        digitoPresionado.setColor2(new Color(255, 255, 255));
                        digitoPresionado.setColor3(new Color(255, 255, 255));
                        digitoPresionado.setForeground(Color.black);
                   }
                   
                   //valida que el digito presionado no sea el mismo
                   if(digitoPresionado!=digito){
                        //Asigno a la variable digitoPresionado el digito que fue presionado por el usuario para ser utilizado despue
                        digitoPresionado=digito;

                         //Cambio los colores del digito presionado
                        digito.setColor1(new Color(255,153,0));
                        digito.setColor2(new Color(255,153,0));
                        digito.setColor3(new Color(255,153,0));
                        digito.setForeground(Color.white);
                   }
                   else
                        digitoPresionado=null;
               }

           });
         
         //EFECTO HOVER cuando el mouse entra en el boton cambia el digito
         digito.addMouseListener(new java.awt.event.MouseAdapter() {
            // Mouse entra
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(digito.getForeground() == Color.BLACK){
                    //Color verde claro
                        digito.setColor1(new Color(153, 255, 153));
                        digito.setColor2(new Color(153, 255, 153));
                        digito.setColor3(new Color(153, 255, 153));
                  }
            }
            // Mouse sale
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                 if(digito.getForeground() == Color.BLACK){
                     //Color original
                       digito.setColor1(new Color(255, 255, 255));
                       digito.setColor2(new Color(255, 255, 255));
                       digito.setColor3(new Color(255, 255, 255));
                  }
            }
        });
         //Estilizando el boton creado
         digito.setText(String.valueOf(i + 1));
         digito.setName("btnDigito");
         //color del boton
         digito.setColor1(new Color(255, 255, 255));
         digito.setColor2(new Color(255, 255, 255));
         digito.setColor3(new Color(255, 255, 255));
         digito.setForeground(Color.black); //color de fuente
         digito.setVisible(true);
         // Cambia el tamaño del botón con preferredSize para que se ve circular
         digito.setPreferredSize(new Dimension(50, 50)); // Ancho X Altura
         // Posición del botón en el layout
         gridLayout.gridx = 0; // Posición horizontal
         gridLayout.gridy = 30*i; // Posición vertical (todos en la misma fila)

         //Anade el boton al panel que fue escogido en configuracion
         panelDigitos.add(digito, gridLayout);
     }
     //Pinta otra vez los elementos del panel
     panelDigitos.revalidate();
     panelDigitos.repaint();
    }
    
    /**
     * Muestra el panel de los digitos del lado que la configuracion indica
     */
    
    private void ajustarPanelDigitos(){
    
        //El panel debe estar ajustado hacia la izquiera
        if(configuracion.getPosicionVentana() == 2){
        
            //Almacena el panel para crear los digitos necesarios
            panelDigitos = vista.pnlDigitosIzq;
            panelDigitos.setVisible(true);
            vista.pnlDigitosDer.setVisible(true);
        }
        else{ //El panel debe estar ajustado hacia la derecha
             //Almacena el panel para crear los digitos necesarios
            panelDigitos = vista.pnlDigitosDer;
            panelDigitos.setVisible(true);
            vista.pnlDigitosIzq.setVisible(true);
        }
        
        generarDigitos();
    }
    
    /**
     * @param boton que va a ser modificado por la constante
     * @param fila de la cuadricula que se encuentra en el boton
     * @param columna de la cuadricula que se encuentra en el boton
     */
    private void colocarConstante(JButton boton, int fila, int columna){
    
        int numero = juego.getPartidaActual().getCuadricula()[fila][columna];
        if(numero>0){
            boton.setText(String.valueOf(numero));
            boton.setBackground(Color.orange);
            boton.setForeground(Color.white);
            boton.setEnabled(false);
        }
        
    }
      /**
    *Elimina la jugada de la pila de jugadas realizadas como es con el borrador la jugada no es en orden y no se podra hacer pop
    * @param columna indica en cual columna de la martriz esta el boton a eliminar de la jugada realizada
    * @param fila indica en cual fila se encuentra el boton
    */
    private void removerJugadaRealizada(int fila, int columna){
    
        String filaS= String.valueOf(fila);
        String columnaS= String.valueOf(columna);
        int indexJugada=0;//almacena el index de la jugada encontrada para eliminarla
        //recorre las ultimas jugadas para encontrar la que se quiere borrar
        for(String ultimaJugada : jugadasRealizadas){
            
            String[] partesJugada = ultimaJugada.split(",");//divide la fila, columna, valor de la ultima jugada para acceder a ellas
            if(partesJugada[0].equals(filaS) && partesJugada[1].equals(columnaS)){
                System.out.println(ultimaJugada);
                break;
            }
            indexJugada++;
        }
        jugadasRealizadas.remove(indexJugada);
    }
    
     /**
    *Elimina el valor de la celda pero guarda la jugada en la pila
    * @param boton al que se le va a asignar el evento
    * @param fila indica en cual fila se encuentra el boton
    * @param columna indica en cual columna de la martriz esta el boton
    */
    private void borradorPresionado(int fila, int columna, JButton boton){
    
         //al seleccionar una celda el borrador se desactiva
         borrador=false;
                       
         //Se guarda el valor en la pila de jugadas por si se quiere rehacer
         String filaS= String.valueOf(fila);
         String columnaS= String.valueOf(columna);
         String valor = boton.getText();
         
        //anade la jugada a la pila pero valida que la celda tenga un numero, es decir que se le haya hecho una jugada      
        if(!valor.equals("")){
             jugadasEliminadas.add(filaS + "," + columnaS+"," + valor);
             juego.getPartidaActual().EliminarValor(filaS,columnaS); //Elimina el valor de la cuadricula a nivel logico
             //reinicia el valor de la celda
             boton.setText("");
             removerJugadaRealizada(fila,columna);
        }
    }
    
    /**
     * Obtiene la ultima jugada eliminada que fue guardada en la pila de jugadas eliminadas, y la restaura en la celda
     */
    private void rehacerJugada(){
        
        String ultimaJugada = jugadasEliminadas.removeLast();
        String[] partesJugada = ultimaJugada.split(",");//divide la fila, columna, valor de la ultima jugada para acceder a ellas
        jugadasRealizadas.add(ultimaJugada);
        //obtiene todos los botones que estan contenidos en el panel, es decir las celdas en un arreglo
        Component[] componentes = vista.PanelInterno.getComponents();
        
        for(int i =0; i<componentes.length; i++){
        
            if (componentes[i] instanceof JButton) {
                JButton boton = (JButton) componentes[i]; // Cast a JButton
                String[] nombreBoton = boton.getName().split(","); //el nombre del boton posee su fila y columna por lo se se separa en dos partes
                
                if(partesJugada[0].equals(nombreBoton[0]) && partesJugada[1].equals(nombreBoton[1])){
                    
                    boton.setText(partesJugada[2]); //asigno el valor a la celda en la vista
                    juego.getPartidaActual().AgregarValor(partesJugada[2], partesJugada[0], partesJugada[1]);
                    
                }
                
             }
        }
    }
    /**
     * Borra todas las jugadas hechas en el juego
     */
    private void borrarJuego(){
        //mientras hayan jugadas en la lista
        while (!jugadasRealizadas.isEmpty()){
            borrarJugada();
        }
    }
    
        /**
     * Obtiene la ultima jugada y la elimina anadiendola a las jugadas borradas para que sea restaurada si se desea
     */
    private void borrarJugada(){
        
        String ultimaJugada = jugadasRealizadas.removeLast();
        String[] partesJugada = ultimaJugada.split(",");//divide la fila, columna, valor de la ultima jugada para acceder a ellas
        
        //obtiene todos los botones que estan contenidos en el panel, es decir las celdas en un arreglo
        Component[] componentes = vista.PanelInterno.getComponents();
        
        for(int i =0; i<componentes.length; i++){
        
            if (componentes[i] instanceof JButton) {
                JButton boton = (JButton) componentes[i]; // Cast a JButton
                String[] nombreBoton = boton.getName().split(","); //el nombre del boton posee su fila y columna por lo se se separa en dos partes
               
                if(partesJugada[0].equals(nombreBoton[0]) && partesJugada[1].equals(nombreBoton[1])){
                    boton.setText("");
                    jugadasEliminadas.add(ultimaJugada);
                    juego.getPartidaActual().EliminarValor(partesJugada[0], partesJugada[1]);
                }
                
             }
        }
    }
    
   /**
    * Genera el evento del boton cuando es presionado para asignarle un numero
    * El evento pueder ser generado por que se selecciono con el borrador
    * @param boton al que se le va a asignar el evento
    * @param fila indica en cual fila se encuentra el boton
    * @param columna indica en cual columna de la martriz esta el boton
    */
    private void  eventoCelda(JButton boton, int fila, int columna){
    
        boton.addActionListener(new ActionListener() {
               @Override
               
              
               //boton presionado
               public void actionPerformed(ActionEvent e) {
                   if(borrador){ //el borrador se habia seleccionado
                       
                        borradorPresionado(fila,columna,boton);
                        vista.labelBorrador.setBorder(null);
                        
                   }else{                   
                        JFrame f=new JFrame();  

                        //se debe validar que haya un digito presionado del panel de digitos
                        if(digitoPresionado!=null){
                             //numero que posee el boton
                            String numero=digitoPresionado.getText();
                            boton.setText(numero);
                            int respuesta = juego.getPartidaActual().validarMovimiento(Integer.parseInt(numero),fila, columna);

                            //valido si hay algo malo en la jugada y la muestro
                            if(respuesta!=1){

                               if(respuesta==2){ 
                                   boton.setBackground(Color.red);
                                   JOptionPane.showMessageDialog(f,"JUGADA NO ES VÁLIDA PORQUE EL ELEMENTO YA ESTÁ EN LA COLUMNA "); 
                                   boton.setBackground(Color.white);
                               }
                               else if(respuesta==3){
                                     boton.setBackground(Color.red);
                                   JOptionPane.showMessageDialog(f,"JUGADA NO ES VÁLIDA PORQUE EL ELEMENTO YA ESTÁ EN LA FILA "); 
                                   boton.setBackground(Color.white);
                               }
                               else if(respuesta==4){
                                     boton.setBackground(Color.red);
                                   JOptionPane.showMessageDialog(f, """
                                                                    JUGADA NO ES VALIDA PORQUE NO CUMPLE CON LA RESTRICCION
                                                                    DE MAYOR """); 
                                   boton.setBackground(Color.white);
                               }
                               else if(respuesta==5){
                                     boton.setBackground(Color.red);
                                   JOptionPane.showMessageDialog(f, """
                                                                    JUGADA NO ES VALIDA PORQUE NO CUMPLE CON LA RESTRICCION
                                                                    DE MENOR"""); 
                                   boton.setBackground(Color.white);
                               }
                              //reinicio el valor del boton
                               boton.setText("");
                            }else{
                                boolean gane = juego.getPartidaActual().validarGane();
                                if(gane){
                                    if (!configuracion.getNombreJugador().equals("")){ //si el jugador no es anonimo
                                        if (Top10.agregarTop10(top10, configuracion, horasPartida,minutosPartida,segundosPartida, configuracion.getNombreJugador(), dificultad)){ //verifica si se puede agregar al top10
                                            try{
                                                Top10.guardarTop("futoshiki2024top10.txt", top10);
                                            }
                                            catch(IOException ex){
                                                JOptionPane.showMessageDialog(f,"Hubo un error guardando el top10 ");
                                            }
                                        } 
                                    }
                                    JOptionPane.showMessageDialog(f,"Felicidades ha ganado la partida "); 
                                    //actualiza la partida actual para ponerla en true e indicar que ya finalizado
                                    juego.getPartidaActual().setHaFinalizado(true);
                                    System.out.println(horasPartida + " "+minutosPartida + " "+segundosPartida+"jj");
                                    reiniciarRelojPartida();
                                    System.out.println(horasPartida + " "+minutosPartida + " "+segundosPartida+"jj");
                                    //En caso de ser multinivel, debe continuar al siguiente nivel por lo que actualiza
                                    if(configuracion.getMultinivel()){
                                        vista.PanelInterno.removeAll();
                                        jugadasRealizadas = new ArrayList<String>();
                                        jugadasEliminadas = new ArrayList<String>();
                                        temporizadorPartida.start();
                                        inicializarVista();
                                    }
                                    else{
                                        jugadasRealizadas = new ArrayList<String>();
                                        jugadasEliminadas = new ArrayList<String>();
                                        temporizadorPartida.stop();
                                        //al ser un solo jugador sale de la ventana y vuele al menu
                                        salirPartida();
                                    }
                                }else{//almacena la jugada que fue realizada en la pila de las jugadas realizadas
                                    String filaS= String.valueOf(fila);
                                    String columnaS= String.valueOf(columna);
                                    String valor = boton.getText();
                                    jugadasRealizadas.add(filaS + "," + columnaS+"," + valor);
                                    System.out.println(jugadasRealizadas.getLast());
                                }
                                
                            }
                        }else{
                             if(panelDigitos!=null){ //el panel se mostro y el juego comenzo
                                   JOptionPane.showMessageDialog(f,"Selecciona un digito para colocar en la celda"); 
                             }
                        }
                    }
               }
           });
        
    }
    
    /**
     * Genera las cuadriculas en relacion al tamano indicado en la configuracion
     */
    
    private void generarCuadricula(){
    
        int tamano = configuracion.getTamañoCuadricula();
        String desigualdad="";//es utilizada para almacenar las desigualdades
        // Establece layout una vez antes de los bucles
       vista.PanelInterno.setLayout(new GridBagLayout());
        GridBagConstraints gridLayout = new GridBagConstraints();
        //Recorrer columnas
        for(int c=0; c<tamano; c++){

                //Para poner botones en esa columna
                //Recorrer filas
                for(int f=0; f<tamano; f++){

                    //crea el nuevo boton
                    JButton cuadro = new JButton();
                    cuadro.setBackground(Color.white);
                    //Crea el texto para la desigualdad inferior al boton, va debajo
                    JLabel desigualdadColumna = new JLabel();
                    desigualdad=juego.getPartidaActual().buscarDesigualdad(f, c, 2); //busca una desigualdad, envia parametro 2 por que es de columna
                    desigualdadColumna.setText(desigualdad);
                    desigualdadColumna.setHorizontalAlignment(SwingConstants.CENTER); // Centra horizontalmente el texto
                    desigualdadColumna.setVerticalAlignment(SwingConstants.CENTER);   // Centra verticalmente el texto
                    desigualdadColumna.setPreferredSize(new Dimension(50, 7)); // Ancho X Altura
                    
                     //Crea el texto para la desigualdad a la derecha al boton, va al lado izq
                    JLabel desigualdadFila = new JLabel();
                    desigualdad=juego.getPartidaActual().buscarDesigualdad(f, c, 1); //busca una desigualdad, envia parametro 2 por que es de columna
                    desigualdadFila.setText(desigualdad);
                    desigualdadFila.setHorizontalAlignment(SwingConstants.CENTER); // Centra horizontalmente el texto
                    desigualdadFila.setVerticalAlignment(SwingConstants.CENTER);   // Centra verticalmente el texto
                    desigualdadFila.setPreferredSize(new Dimension(30, 7)); // Ancho X Altura
                    
                    //configuracion del boton
                    colocarConstante(cuadro,f,c);
                    cuadro.setPreferredSize(new Dimension(50, 40)); // Ancho X Altura
                     // Posición del botón en el layout
                    gridLayout.gridx = c*2; // Posición horizontal
                    gridLayout.gridy = f*3; // Posición vertical (todos en la misma fila)
                    gridLayout.fill = GridBagConstraints.NONE;
                    gridLayout.anchor = GridBagConstraints.CENTER;
                    gridLayout.insets = new Insets(8, 0, 8, 0);
                    vista.PanelInterno.add(cuadro, gridLayout);
                    
                    //anade la disgualdad de la izquierda
                    if(c!=tamano-1){
                        gridLayout.gridx = c*2+1; // Posición horizontal
                        gridLayout.insets = new Insets(8, 0, 8, 0); //deistancia entre los elementos
                        vista.PanelInterno.add(desigualdadFila, gridLayout); // anade el label al panel
                    }
                    
                    //anade la desigualdad de la derecha
                     if(f!=tamano-1){
                         // Configuración de posición en el layout para la desigualdad vertical
                         gridLayout.gridx = c*2; // Posición horizontal
                         gridLayout.gridy = f*3+1; // Posición vertical
                         gridLayout.insets = new Insets(3,0, 3, 0); // margenes más pequeños entre botón y texto
                         vista.PanelInterno.add(desigualdadColumna, gridLayout); // anade el texto al panel
                    }
                   
                    //Asigno nombre a la celda para que sea mas sencillo saber a que fila y columna pertenece
                    cuadro.setName(String.valueOf(f) +","+String.valueOf(c));
                    eventoCelda(cuadro,f,c);
            }
                
        }
        //Pinta otra vez los elementos del panel
            vista.PanelInterno.revalidate();
            vista.PanelInterno.repaint();
        
    }
    
    /**
     * Genera la incializacion de la vista Jugar la adapta segun la configuracion necesaria
     */
    private void inicializarVista(){
        
        String dificultad = "Nivel: ";
        int nivel = 0;
        //valida que no sea multinivel, de serlo define el nivel de la partida a jugar
        if(configuracion.getMultinivel()){
            if(juego.getPartidaActual() == null){
                nivel = 1;
            }
            else if(juego.getPartidaActual().getNivel() !=3 && juego.getPartidaActual().getHaFinalizado()){ //valida que la partida termino, si no seguira en el mismo nivel
                nivel = juego.getPartidaActual().getNivel()+1;
            }
            else{
                if(!juego.getPartidaActual().getHaFinalizado())
                    nivel = juego.getPartidaActual().getNivel();
                else
                    nivel = 3;
            }
        }else{ // en caso de no ser multinivel obtiene el nivel de la configuracion
            nivel = configuracion.getDificultad();
        }
        
        //la globalizo
        this.dificultad=nivel;
        //Nivel en palabras
        switch (nivel) {
            case 1 -> dificultad+="Facil";
            case 2 -> dificultad+="Intermedio";
            case 3 -> dificultad+="Dificil";
            default -> {
            }
        }
        //busca la partida
        Partida partidaRespuesta = juego.escogerPartida(nivel);
        Partida partida;
        if(partidaRespuesta==null){
              JFrame f=new JFrame();  
              JOptionPane.showMessageDialog(f,"NO HAY PARTIDAS DISPONIBLES PARA " + dificultad); 
              salirPartida();
        }else{
            partida = new Partida(partidaRespuesta);
            juego.setPartidaActual(partida);
             //Nombre del nivel de la partida
            this.vista.lblNivel.setText(dificultad);
            
            //Nombre del jugador
            if(!configuracion.getNombreJugador().equals(""))
                this.vista.lblNombreJugador.setText("Jugador " + configuracion.getNombreJugador());
            else
                this.vista.lblNombreJugador.setText("Jugador Ingcognito");
            generarCuadricula();
            
            
        }
       
         
    }
    
    /**
     * Setter de controladorJugar
     * @param juego juego actual
     * @param configuracion configuracion actual
     * @param jugadasEliminadas pila de jugadas eliminadas
     * @param jugadasRealizadas pila de jugadas realizadas
     * @param reloj timer del tiempo actual
     * @param horas horas del temporizador
     * @param minutos minutos del temporizador
     * @param segundos segundos del temporizador
     * @param tipo tipo de reloj usado
     * @param horasPartida horas de la partida
     * @param minutosPartida minutos de la partida
     * @param segundosPartida segundos de la partida
     */
    public void setControladorJugar(Juego juego, Configuracion configuracion, List<String> jugadasEliminadas, List<String> jugadasRealizadas, Timer reloj, int horas, int minutos, int segundos, int tipo, int horasPartida, int minutosPartida, int segundosPartida){
        this.juego = juego;
        this.configuracion = configuracion;
        this.jugadasRealizadas = jugadasRealizadas;
        this.jugadasEliminadas = jugadasEliminadas;
        this.reloj = reloj;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.tipo = tipo;
        this.horasPartida = horasPartida;
        this.minutosPartida = minutosPartida;
        this.segundosPartida = segundosPartida;
    }
    
    /**
        @param vista representa la vista que manipula el controlador
        @param juego representa la configuracion y partidas establecida por el usuario en la seccion de configuracion
        @param vistaConf representa las vista de configuracion, es utilizada para ser enviada por parametro
     * @param vistaTop representa la vista del top
     * @param top10 es la lista de los top10
     */
    public ControladorJugar(Jugar vista, Juego juego, MenuConfiguracion vistaConf, MenuTop10 vistaTop, ArrayList<ArrayList<Top10>> top10){
        this.top10 = top10;
        this.vista = vista;
        this.configuracion = juego.getConfiguracion();
        this.juego=juego;
        this.vistaTop= vistaTop;
        this.vistaConf=vistaConf;
        
        //Anade el evento al boton TerminarJuego, genera la vista del menu  con su respectivo controlador modifica la visibilidad de las vistas
        this.vista.btnTerminarJuego.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                    
                   Object[] options = { "Terminar Juego", "Seguir jugando" }; 
                    int choice = JOptionPane.showOptionDialog( 
                    null, // Parent component (null means center on screen) 
                    "Esta seguro que quiere terminar el juego?", // Message to display 
                    "Terminar Juego", // Dialog title 
                    JOptionPane.YES_NO_CANCEL_OPTION, // Option type (Yes, No, Cancel) 
                    JOptionPane.QUESTION_MESSAGE, // Message type (question icon) 
                    null, // Custom icon (null means no custom icon) 
                    options, // Custom options array 
                    options[0] // Initial selection (default is "Cancel") 
                     ); 

                    if (choice == JOptionPane.YES_NO_OPTION) {  //terminar juego
                        
                            if(configuracion.getMultinivel()){
                                    vista.PanelInterno.removeAll();
                                    inicializarVista();
                                    reiniciarRelojPartida();
                                    temporizadorPartida.start();
                           }
                            else{
                                vista.PanelInterno.removeAll();
                                inicializarVista();
                                if(tipo==1){
                                    segundos=0;
                                    minutos=0;
                                    horas=0;
                                }
                                if (tipo==2){
                                    horas = configuracion.getHoras();
                                    minutos = configuracion.getMinutos();
                                    segundos = configuracion.getSegundos();
                                }
                                reiniciarRelojPartida();
                                temporizadorPartida.restart();
                                temporizadorPartida.start();
                            }
                    } 
            }
        
        });
        
        //Al darle jugar se muestran los elementos importantes para poder comenzar el juego
        this.vista.btnJugar.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                tipo=configuracion.getReloj();
                inicializarTimer();
                temporizadorPartida.start();
                 if(configuracion.getReloj() == 1)
                    reloj.start();
                else if(configuracion.getReloj()==2){
                   horas= configuracion.getHoras();
                   minutos = configuracion.getMinutos();
                   segundos = configuracion.getSegundos() +1;
                   reloj.start();
                 }
                 //en caso de no tener tiempo el reloj no comienza
                ajustarPanelDigitos();
                vista.btnJugar.setVisible(false);
                vista.btnCargarJuego.setVisible(false);
                vista.panelBotones.setVisible(true);
            }
        });
        
        this.vista.btnCargarJuego.addActionListener(new ActionListener(){
         @Override
            public void actionPerformed(ActionEvent e){
                JuegoGuardado juegoCargado = JuegoGuardado.cargarJuegoGuardado("futoshiki2024juegoactual.txt");
                if (juegoCargado == null){
                    JOptionPane.showMessageDialog(null, "No hay partidas guardadas!");
                    return;
                }
                setControladorJugar(juegoCargado.getJuego(), juegoCargado.getConfiguracion(), juegoCargado.getJugadasEliminadas(), juegoCargado.getJugadasRealizadas(), juegoCargado.getReloj(), juegoCargado.getHoras(),
                        juegoCargado.getMinutos(), juegoCargado.getSegundos(), juegoCargado.getTipo(), juegoCargado.getHorasPartida(), juegoCargado.getMinutosPartida(), juegoCargado.getSegundosPartida());
                
                if(configuracion.getMultinivel()){
                        vista.PanelInterno.removeAll();
                        inicializarVista();
               }
                else{
                    vista.PanelInterno.removeAll();
                    inicializarVista();
                    segundos=0;
                    minutos=0;
                    horas=0;
                }
                vista.btnJugar.doClick();
                int cuantas = 0;
                while(!jugadasRealizadas.isEmpty()){
                    vista.btnBorrarJugada.doClick();
                    cuantas += 1;
                }
                for (int i = 0; i < cuantas; i++){
                    vista.btnRehacerJugada.doClick();
                }
                
            }
        });
        
        this.vista.btnGuardarJuego.addActionListener(new ActionListener(){
         @Override
            public void actionPerformed(ActionEvent e){
                JuegoGuardado juegoAGuardar = new JuegoGuardado(configuracion, juego, jugadasEliminadas, jugadasRealizadas, reloj, horas, minutos, segundos, tipo, horasPartida, minutosPartida, segundosPartida); //tambien guardar reloj/timer
                try {
                    JuegoGuardado.guardarJuegoGuardado("futoshiki2024juegoactual.txt", juegoAGuardar);
                    JOptionPane.showMessageDialog(null, "La partida se guardo correctamente!");
                }
                catch (IOException ex){
                    JOptionPane.showMessageDialog(null, "Hubo un error guardando la partida!" + ex.getMessage());
                    ex.printStackTrace(); // Imprime la traza de la excepción en la consola);
                }
            }
        });
        
        this.vista.btnBorrarJuego.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //valida que haya jugadas hechas que pueda borrar, de no ser asi le va a indicar
               if(jugadasRealizadas.isEmpty()){
               
                   JFrame f=new JFrame();  
                   JOptionPane.showMessageDialog(f,"REALICE UNA JUGADA"); 
               }
               else{
                   int response = JOptionPane.showConfirmDialog(null, "¿Desea borrar el juego?", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        borrarJuego(); //permite borrar la ultima jugada que se hizo
                    }
               }
            }
        });
        
        this.vista.btnRehacerJugada.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                //valida que haya jugadas borradas que pueda rehacer, de no ser asi le va a indicar
               if(jugadasEliminadas.isEmpty()){
               
                   JFrame f=new JFrame();  
                   JOptionPane.showMessageDialog(f,"NO SE HA BORRADO JUGADAS"); 
               }
               else{
                   rehacerJugada(); //permite rehacer la utlima jugada eliminada
               }
            }
        });
        
         this.vista.btnBorrarJugada.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                //valida que haya jugadas hechas que pueda borrar, de no ser asi le va a indicar
               if(jugadasRealizadas.isEmpty()){
               
                   JFrame f=new JFrame();  
                   JOptionPane.showMessageDialog(f,"REALICE UNA JUGADA"); 
               }
               else{
                   borrarJugada(); //permite borrar la ultima jugada que se hizo
               }
            }
        });
        
         this.vista.labelBorrador.addMouseListener(new MouseAdapter(){
        
         @Override
            public void mouseClicked(MouseEvent e){
                if(!vista.btnJugar.isVisible()){
                if(borrador){
                    vista.labelBorrador.setBorder(null);
                    borrador=false;
                }
                else{
                    Border border = BorderFactory.createLineBorder(java.awt.Color.BLACK, 2); // Borde negro de grosor 2
                    vista.labelBorrador.setBorder(border);
                    borrador=true;
                }

              }
         }
        });
        this.vista.btnVolverMenu.addMouseListener(new MouseAdapter(){
        
         @Override
            public void mouseClicked(MouseEvent e){
              
                    Object[] options = { "Volver al menu principal", "Seguir jugando" }; 
                    int choice = JOptionPane.showOptionDialog( 
                    null, // Parent component (null means center on screen) 
                    "Esta seguro que desea volver al menu principal?", // Message to display 
                    "Volver al menu", // Dialog title 
                     JOptionPane.YES_NO_CANCEL_OPTION, // Option type (Yes, No, Cancel) 
                     JOptionPane.QUESTION_MESSAGE, // Message type (question icon) 
                      null, // Custom icon (null means no custom icon) 
                     options, // Custom options array 
                      options[0] // Initial selection (default is "Cancel") 
                     ); 
                      if (choice == JOptionPane.YES_NO_OPTION) {  //terminar juego
                           salirPartida();
                      } 
            }
        });
        inicializarVista();
    }
    
    
    
}
