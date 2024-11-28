/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Jugar;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Dilan
 */
public class JuegoGuardado implements Serializable{
    private static final long serialVersionUID = 3L;
    //atributos
    private Configuracion configuracion;
    private List<String> jugadasEliminadas;
    private List<String> jugadasRealizadas;
    private Juego juego;
    private Timer reloj;
    private int horas; //controla las horas que han concurrido
    private int minutos; //controla los minutos que han concurrido
    private int segundos; //controla los segundos que han concurrido
    private int tipo; //tipo de reloj que es utilizado en la ejecucion
    //constructor
    public JuegoGuardado(Configuracion configuracion, Juego juego, List<String> jugadasEliminadas, List<String> jugadasRealizadas, Timer reloj, int horas, int minutos, int segundos, int tipo){
        this.configuracion = configuracion;
        this.jugadasEliminadas = jugadasEliminadas;
        this.jugadasRealizadas = jugadasRealizadas;
        this.juego = juego;
        this.reloj = reloj;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.tipo = tipo;
    }
    
    //getters y setters
    public Configuracion getConfiguracion(){
        return configuracion;
    }
    public List<String> getJugadasEliminadas(){
        return jugadasEliminadas;
    }
    
    public List<String> getJugadasRealizadas(){
        return jugadasRealizadas;
    }
    
    public Juego getJuego(){
        return juego;
    }
    public Timer getReloj(){
        return reloj;
    }
    public int getHoras(){
        return horas;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getSegundos(){
        return segundos;
    }
    public int getTipo(){
        return tipo;
    }
    
    /**
     * Guarda el juegoGuardado en un archivo.
     *
     * @param nombreArchivo El nombre del archivo en el cual guardar el juegoGuardado.
     * @param juegoGuardado El objeto juegoGuardado con los datos a guardar
     * @throws IOException Si ocurre un error al escribir el archivo.
     */
    public static void guardarJuegoGuardado(String nombreArchivo, JuegoGuardado juegoGuardado) throws IOException {
        ObjectOutputStream oos = null; //crea el objeto ObjectOutPutStream util para cargar archivos
        try {
            oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo)); //Se abre o crea nombreArchivo, ObjectOutputStream convierte el objeto en bytes y FileOutputStream escribe bytes en el archivo. 
            oos.writeObject(juegoGuardado);
            System.out.println("El archivo se guardo correctamente");
        } 
        finally { //captura de la excepcion EOF
            if (oos != null) { //si se llega al fin del archivo:
                try {
                    oos.close(); //se cierra
                } 
                catch (IOException e) { //hubo un error
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }
    
    /**
     * Carga el JuegoGuardado desde un archivo.
     * @param nombreArchivo El nombre del archivo desde el cual cargar el JuegoGuardado.
     * @return El JuegoGuardado desde el archivo.
     */
    public static JuegoGuardado cargarJuegoGuardado(String nombreArchivo){
        ObjectInputStream ois = null; //crea el objeto ObjectInputStream util para leer archivos
        try {
            ois = new ObjectInputStream(new FileInputStream(nombreArchivo)); //se inicializa el objeto y guarda el archivo "nombreArchivo"
            Object objeto = ois.readObject(); //lee el archivo guardado en ois y devuelve un tipo "Object"
            JuegoGuardado juegoCargado = (JuegoGuardado) objeto; //se realiza un casting de objeto a JuegoGuardado
            System.out.println("El archivo se cargo correctamente");
            return juegoCargado;
                    
        } 
        catch (FileNotFoundException ex) {
            return null;
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }        finally {
            if (ois != null) { //si ois se utilizó
                try {
                    ois.close(); //lo cierra
                } 
                catch (IOException e) {
                    System.out.println("Error al cerrar ObjectInputStream: " + e.getMessage());
                }
            }
        }
        return null;
    }
}
