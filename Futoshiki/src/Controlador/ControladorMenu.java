package Controlador;

import Vista.*;
import Modelo.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorMenu {
    
    private MenuPrincipal vista;
    
    
     /**
     * @param vista representa la vista del menu principal que el controlador va a manipular
     */
    public ControladorMenu(MenuPrincipal vista){
    
        this.vista = vista;
        
        //Agregar eventos listeners
        
        //Boton jugar, crea y muestra la vista para mostrarle la partida
        this.vista.btnJugar.addActionListener(new ActionListener() {
        
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
