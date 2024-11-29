package Controlador;

import Vista.MenuTop10;
import Vista.*;
import Modelo.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class ControladorMenu {
    private MenuPrincipal vista;
    
    
     /**
     * @param vista representa la vista del menu principal que el controlador va a manipular
     * @param vistaConfig representa la vista del menu de configuracion para mostrarlo u ocultarlo
     * @param vistaTop representa la vista del menu del Top 10
     * @param configuracionCargada es la configuracion actual del juego
     * @param juego representa el juego
     * @param top10Cargado todos los top10 acutales
     * 
     */
    public ControladorMenu(MenuPrincipal vista, MenuConfiguracion vistaConfig, MenuTop10 vistaTop, Configuracion configuracionCargada, Juego juego, ArrayList<ArrayList<Top10>> top10Cargado){
        this.vista = vista;
        //Agregar eventos listeners

        //Boton jugar, crea y muestra la vista para mostrarle la partida
        this.vista.btnJugar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){

                    configuracionCargada.setConfiguracion(Configuracion.cargarConfiguracion("futoshiki2024configuracion.txt"));
                    Jugar jugar = new Jugar();
                    jugar.setVisible(true);
                    vista.setVisible(false);
                    juego.restablecerPartidaActual(null);
                    ControladorJugar controladorjugar = new ControladorJugar(jugar, juego,vistaConfig, vistaTop, top10Cargado);
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
                vistaConfig.panelOlvidePin.setVisible(false);
                vistaConfig.panelCambiarPin.setVisible(false);
                vistaConfig.setVisible(true);
                vista.setVisible(false); 
            }
        });
        
        //Añade el evento del boton Top10
        this.vista.btnTop10.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               //setTop10Cargado(Top10.cargarTop10("futoshiki2024top10.txt"));
               vistaTop.ComboDificultad.setSelectedIndex(0);
                vistaTop.comboTamano.setSelectedIndex(0);
               vistaTop.setVisible(true);
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
                AcercaDe vistaAcerca = new AcercaDe();
                vistaAcerca.setVisible(true);
                ControladorAcercaDe acercaDe = new ControladorAcercaDe(vista, configuracionCargada,juego,vistaAcerca);
            }
        });
         
        this.vista.btnAyuda.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    // Nombre del archivo PDF
                    String nombreArchivo = "Manual_de_usuario.pdf";

                    // Obtiene el directorio de trabajo actual (del proyecto Futoshiki)
                    String directorioActual = System.getProperty("user.dir");
                    System.out.println(directorioActual);

                    // Crea el objeto File con la ruta completa
                    File archivoPDF = new File(directorioActual, nombreArchivo);

                    // Verifica si Desktop es soportado en el sistema (windows si lo soporta)
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();
                        if (archivoPDF.exists()) {
                            desktop.open(archivoPDF);
                        } else {
                            System.out.println("El archivo no existe en el directorio actual.");
                        }
                    } else {
                        System.out.println("Desktop no es soportado en este sistema.");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        
        
    }
}
