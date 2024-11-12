package Controlador;

//librerias importadas
import Vista.Jugar;
import Vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorJugar {
    
    private Jugar vista;
    
    /*
      
     
    
     */
    public ControladorJugar(Jugar vista){
    
        this.vista = vista;
        
        this.vista.btnTerminarJuego.addActionListener(new ActionListener(){
        
         @Override
            public void actionPerformed(ActionEvent e){
                    
                MenuPrincipal vistaMenu = new MenuPrincipal();
                ControladorMenu controladorMenu = new ControladorMenu(vistaMenu);
                vistaMenu.setVisible(true);
                vista.setVisible(false);
                
            }
        
        });
    
    }
    
}
