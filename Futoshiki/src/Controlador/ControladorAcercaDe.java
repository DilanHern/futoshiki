
package Controlador;

import Modelo.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAcercaDe {
    
   private AcercaDe vista;
   
    /**
     * @param vista representa la vista del menu principal que el controlador va a manipular
     * @param vistaConfig representa la vista del menu de configuracion para mostrarlo u ocultarlo
     * @param configuracionCargada es la configuracion actual del juego
     * 
     */
    public ControladorAcercaDe(MenuPrincipal menu, Configuracion configuracionCargada, Juego juego, AcercaDe vista){
    
        this.vista = vista;
         
        this.vista.btnVolver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vista.setVisible(false);
                menu.setVisible(true);
            }
        });
        
        
        
    }
    
}
