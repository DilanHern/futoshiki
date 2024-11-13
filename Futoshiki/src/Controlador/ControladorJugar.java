package Controlador;

//librerias importadas
import Componentes.BotonRedondo;
import Vista.Jugar;
import Vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.*;
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
import javax.swing.JPanel;

public class ControladorJugar {
    
    private Jugar vista;
    private Configuracion configuracion;
    private JPanel panelMatriz;
    private JPanel panelDigitos;
    private BotonRedondo digitoPresionado;
    private JPanel panelCuadricula;
    
    
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
        if(configuracion.getPosicionVentana() == 1){
        
            //Almacena el panel para crear los digitos necesarios
            panelDigitos = vista.pnlDigitosIzq;
            panelDigitos.setVisible(true);
            vista.pnlDigitosDer.setVisible(false);
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
     * Genera las cuadriculas en relacion al tamano indicado en la configuracion
     */
    
    private void generarCuadricula(){
    
        int tamano = configuracion.getTamañoCuadricula();
        int espacio=13; //espacio entre los cuadros
        // Establece layout una vez antes de los bucles
       vista.PanelInterno.setLayout(new GridBagLayout());
        GridBagConstraints gridLayout = new GridBagConstraints();
        //define el espacio entre los elementos en el layout
         gridLayout.insets = new Insets(espacio, espacio, espacio, espacio); 
        //Recorrer columnas
        for(int c=0; c<tamano; c++){

                //Recorrer filas
                for(int f=0; f<tamano; f++){

                    //crea el nuevo boton
                    JButton cuadro = new JButton();
                    cuadro.setPreferredSize(new Dimension(40, 40)); // Ancho X Altura
                     // Posición del botón en el layout
                    gridLayout.gridx = c +10; // Posición horizontal
                    gridLayout.gridy = f + 10; // Posición vertical (todos en la misma fila)
                    gridLayout.fill = GridBagConstraints.NONE;
                    gridLayout.anchor = GridBagConstraints.CENTER;
                    //Anade el boton al panel que fue escogido en configuracion
                     vista.PanelInterno.add(cuadro, gridLayout);
            }
            //Pinta otra vez los elementos del panel
            vista.PanelInterno.revalidate();
            vista.PanelInterno.repaint();
        
        }
    
    }
    
    /**
     * Genera la incializacion de la vista Jugar la adapta segun la configuracion necesaria
     */
    private void inicializarVista(){
    
        String dificultad = "Nivel: ";
        //Nombre del nivel de la partida
        if(configuracion.getDificultad()==1)
            dificultad+="Facil";
        else if(configuracion.getDificultad()==2)
            dificultad+="Intermedio";
        else if(configuracion.getDificultad()==3)
            dificultad+="Dificil";
        //Nivel en palabras
        this.vista.lblNivel.setText(dificultad);
        
        //Nombre del jugador
        this.vista.lblNombreJugador.setText("Jugador " + configuracion.getNombreJugador());
        generarCuadricula();
    }
    
    /**
        @param vista representa la vista que manipula el controlador
        @param configuracion representa la configuracion establecida por el usuario en la seccion de configuracion
     */
    public ControladorJugar(Jugar vista, Juego juego){
    
        this.vista = vista;
        this.configuracion = juego.getConfiguracion();
        this.panelCuadricula = this.vista.PanelCuadriculas;
        
        inicializarVista();
        
        //Anade el evento al boton TerminarJuego, genera la vista del menu  con su respectivo controlador modifica la visibilidad de las vistas
        this.vista.btnTerminarJuego.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                    
                MenuPrincipal vistaMenu = new MenuPrincipal();
                ControladorMenu controladorMenu = new ControladorMenu(vistaMenu);
                //Muestra el menu
                vistaMenu.setVisible(true);
                //Quita la visibilidad de la ventana actual
                vista.setVisible(false);
                
            }
        
        });
        
        //Al darle jugar se muestran los elementos importantes para poder comenzar el juego
        this.vista.btnJugar.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                    
                 ajustarPanelDigitos();
                 vista.btnJugar.setVisible(false);
                vista.panelBotones.setVisible(true);
            }
        
        });
    
    }
    
    
    
}
