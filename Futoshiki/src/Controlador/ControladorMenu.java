package Controlador;

import Vista.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorMenu {
    
    private MenuPrincipal vista;
    
    
    public ControladorMenu(MenuPrincipal vista){
    
        this.vista = vista;
        
        //Agregar eventos listeners
        this.vista.btnJugar.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e){
            
                    Jugar jugar = new Jugar();
                    ControladorJugar controladorjugar = new ControladorJugar(jugar);
                    jugar.setVisible(true);
                    vista.setVisible(false);
            }
        
        });
        
        this.vista.btnSalir.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                    vista.setVisible(false);
                    System.exit(0); //termina la ejecucion
            }
        
        });
        
    }
}
