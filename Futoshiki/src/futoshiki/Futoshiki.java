package futoshiki;
import Vista.*;
import Controlador.*;
import Modelo.*;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Futoshiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cargar la configuracion de los archivos
        Configuracion configuracionCargada = Configuracion.cargarConfiguracion("futoshiki2024configuracion.txt");
        //si no hay archivos, crea la configuracion por defecto y la guarda
        if (configuracionCargada == null){
            configuracionCargada = new Configuracion();
            try {
                Configuracion.guardarConfiguracion("futoshiki2024configuracion.txt", configuracionCargada);
            }
            catch (IOException e){
                JOptionPane.showMessageDialog(null, "Hubo un error guardando la configuración en el juego!" + e.getMessage());
                e.printStackTrace(); // Imprime la traza de la excepción en la consola);
            }
        }
        
        //Creacion y carga del objeto juego que contiene las partidas durante la ejecucion 
        Juego juego = new Juego();
        juego.CargarPartidas();
        juego.setConfiguracion(configuracionCargada);
        
        //creacion de menus
        MenuConfiguracion vistaConfig = new MenuConfiguracion();
        MenuPrincipal vistaMenu = new MenuPrincipal();
        
        //creacion de controladores
        ControladorMenu menu = new ControladorMenu(vistaMenu, vistaConfig,configuracionCargada, juego);
        ControladorConfiguracion controladorConfig = new ControladorConfiguracion(vistaMenu, vistaConfig, configuracionCargada,juego);
        
        vistaMenu.setVisible(true);
    }
    
}
