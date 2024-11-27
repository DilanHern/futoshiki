package futoshiki;
import Vista.MenuTop10;
import Vista.*;
import Controlador.*;
import Modelo.*;
import java.io.IOException;
import java.util.ArrayList;
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
        
        //cargar el top de los archivos
        ArrayList<ArrayList<Top10>> top10Cargado = Top10.cargarTop10("futoshiki2024top10.txt");
        //si no hay archivos, crea la configuracion por defecto y la guarda
        if (top10Cargado == null){
            //creamos todos los top10 vacios
            top10Cargado = Top10.crearTop10Vacio();
            try {
                Top10.guardarTop("futoshiki2024top10.txt", top10Cargado);
            }
            catch (IOException e){
                JOptionPane.showMessageDialog(null, "Hubo un error guardando el top en el juego!" + e.getMessage());
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
        MenuTop10 vistaTop = new MenuTop10();
        
        //creacion de controladores
        ControladorMenu menu = new ControladorMenu(vistaMenu, vistaConfig, vistaTop, configuracionCargada, juego, top10Cargado);
        ControladorConfiguracion controladorConfig = new ControladorConfiguracion(vistaMenu, vistaConfig, configuracionCargada, juego);
        ControladorTop10 controladorTop = new ControladorTop10(vistaMenu, vistaTop, top10Cargado);
        vistaMenu.setVisible(true);
    }
    
}
