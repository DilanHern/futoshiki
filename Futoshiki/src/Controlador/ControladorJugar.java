package Controlador;

//librerias importadas
import Componentes.BotonRedondo;
import Vista.Jugar;
import Vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.*;
import Vista.MenuConfiguracion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class ControladorJugar {
    
    private Jugar vista; //vista del juego
    private Juego juego; //contiene las partidas que se estan jugando
    private Configuracion configuracion; //contienen la configuracion establecida por el usuario
    private JPanel panelDigitos = null; //contiene el panel del lado que esta en la configuracion
    private BotonRedondo digitoPresionado; //almacena el boton digito que fue presionado
    
    //------------------TIMER------------------------
    private Timer reloj;
    private int horas=0; //controla las horas que han concurrido
    private int minutos=0; //controla los minutos que han concurrido
    private int segundos=0; //controla los segundos que han concurrido
    private int tipo; //tipo de reloj que es utilizado en la ejecucion
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
        if(segundos>0)
            segundos--;
        if(segundos == 0){
            
            if(minutos>0){
                segundos=60;
                minutos--;
            }
        }
        if(minutos==0){
            if(horas>0){
                minutos=60;
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
                segundos = configuracion.getSegundos() +1;
                tipo=1; //actualiza el tipo de reloj para que continue a cronometro
                reloj.start();
                
            } 
            else if (choice == JOptionPane.NO_OPTION) { 
                vista.btnTerminarJuego.doClick();
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
    * Genera el evento del boton cuando es presionado para asignarle un numero
    * @param boton al que se le va a asignar el evento
    * @param fila indica en cual fila se encuentra el boton
    * @param columna indica en cual columna de la martriz esta el boton
    */
    private void  eventoCelda(JButton boton, int fila, int columna){
    
        boton.addActionListener(new ActionListener() {
               @Override
               
              
               //boton presionado
               public void actionPerformed(ActionEvent e) {
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
                           if(gane)
                               JOptionPane.showMessageDialog(f,"Felicidades ha ganado la partida "); 
                       }
                   }else{
                        if(panelDigitos!=null){ //el panel se mostro y el juego comenzo
                              JOptionPane.showMessageDialog(f,"Selecciona un digito para colocar en la celda"); 
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
        tipo=configuracion.getReloj();
        String dificultad = "Nivel: ";
        int nivel = 0;
        //valida que no sea multinivel, de serlo define el nivel de la partida a jugar
        if(configuracion.getMultinivel()){
        
            if(juego.getPartidaActual() == null){
                nivel = 1;
            }
            else if(juego.getPartidaActual().getNivel() !=3){
                nivel = juego.getPartidaActual().getNivel()+1;
            }
            else{
                nivel = 3;
            }
        }else{
        
            nivel = configuracion.getDificultad();
        }
        
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
              vista.btnTerminarJuego.doClick();
        }else{
            partida = new Partida(partidaRespuesta);
            juego.setPartidaActual(partida);
        }
        //Nombre del nivel de la partida
        
        this.vista.lblNivel.setText(dificultad);
        
        //Nombre del jugador
        this.vista.lblNombreJugador.setText("Jugador " + configuracion.getNombreJugador());
        generarCuadricula();
        inicializarTimer();
         
    }
    
    /**
        @param vista representa la vista que manipula el controlador
        @param juego representa la configuracion y partidas establecida por el usuario en la seccion de configuracion
        @param vistaConf representa las vista de configuracion, es utilizada para ser enviada por parametro
     */
    public ControladorJugar(Jugar vista, Juego juego, MenuConfiguracion vistaConf){
        this.vista = vista;
        this.configuracion = juego.getConfiguracion();
        this.juego=juego;
        
        inicializarVista();
        
        //Anade el evento al boton TerminarJuego, genera la vista del menu  con su respectivo controlador modifica la visibilidad de las vistas
        this.vista.btnTerminarJuego.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                    
                MenuPrincipal vistaMenu = new MenuPrincipal();
                ControladorMenu controladorMenu = new ControladorMenu(vistaMenu,vistaConf, juego.getConfiguracion(), juego);
                //Muestra el menu
                vistaMenu.setVisible(true);
                //Quita la visibilidad de la ventana actual
                vista.setVisible(false);
                if(reloj.isRunning())
                    reloj.stop(); //para el temporizador en caso de que se este ejecutando
                juego.getPartidaActual().limpiarCuadricula();
            }
        
        });
        
        //Al darle jugar se muestran los elementos importantes para poder comenzar el juego
        this.vista.btnJugar.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                    
                ajustarPanelDigitos();
                vista.btnJugar.setVisible(false);
                vista.panelBotones.setVisible(true);
                
                if(configuracion.getReloj() == 1)
                    reloj.start();
                else if(configuracion.getReloj()==2){
                   horas= configuracion.getHoras();
                   minutos = configuracion.getMinutos();
                   segundos = configuracion.getSegundos() +1;
                   reloj.start();
                 }
            }
        });
    
    }
    
    
    
}