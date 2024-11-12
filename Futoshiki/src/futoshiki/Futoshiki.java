package futoshiki;
import Vista.*;
import Controlador.*;
public class Futoshiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MenuPrincipal vistaMenu = new MenuPrincipal();
        ControladorMenu menu = new ControladorMenu(vistaMenu);
        vistaMenu.setVisible(true);
        
    }
    
}
