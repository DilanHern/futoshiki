
package Controlador;

import Modelo.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAcercaDe {
   private AcercaDe vista;
   
    /**
     * Controlador entre la vista y la logica de Acerca de
     * @param menu
     * @param configuracionCargada
     * @param juego
     * @param vista 
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
