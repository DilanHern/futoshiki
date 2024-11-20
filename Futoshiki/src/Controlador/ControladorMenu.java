package Controlador;

import Vista.*;
import Modelo.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorMenu {
    
    private MenuPrincipal vista;
    private MenuConfiguracion vistaConfig;
    
     /**
     * @param vista representa la vista del menu principal que el controlador va a manipular
     * @param vistaConfig representa la vista del menu de configuracion para mostrarlo u ocultarlo
     * @param configuracionCargada es la configuracion actual del juego
     * 
     */
    public ControladorMenu(MenuPrincipal vista, MenuConfiguracion vistaConfig){
    
        this.vista = vista;
        
        
        
        //Agregar eventos listeners

        //Boton jugar, crea y muestra la vista para mostrarle la partida
        this.vista.btnJugar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){

                    Juego juego = new Juego();

                    //PRUEBA DATOS QUEMADOS CONFIGURACION
                    Configuracion configuracion = new Configuracion();
                    configuracion.setTamañoCuadricula(5);
                    configuracion.setDificultad(1);
                    configuracion.setMultinivel(false);
                    configuracion.setReloj(1);
                    configuracion.setPosicionVentana(1);
                    configuracion.setNombreJugador("Camila");
                    juego.setConfiguracion(configuracion);

                    //Crea la vista con su respectivo controlador
                    Jugar jugar = new Jugar();
                    ControladorJugar controladorjugar = new ControladorJugar(jugar, juego);
                    jugar.setVisible(true);
                    vista.setVisible(false);
                }
            }
        );
        
        //Anade el evento del boton configuracion
        this.vista.btnConfiguracion.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){
                vistaConfig.tabConfig.setSelectedIndex(0); //cada vez que abre, abre en el tab 0 (tamaño cuadricula)
                vistaConfig.panelConfiguracion.setVisible(true);
                vistaConfig.panelRegistrarse.setVisible(false);
                vistaConfig.setVisible(true);
                vista.setVisible(false); 
            }
        });
        
        //Anade el evento del boton salir, quita la ventana y termina el programa
        this.vista.btnSalir.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){
                vista.setVisible(false);
                System.exit(0); //termina la ejecucion
            }
        });

        this.vista.btnAcercaDe.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vista.setVisible(false);
                System.exit(0); //termina la ejecucion
            }
        });
         
        this.vista.btnAyuda.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vista.setVisible(false);
                System.exit(0); //termina la ejecucion
            }
        });
        
        
        
    }
}
