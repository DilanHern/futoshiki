/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
    private int horas; //controla las horas que han concurrido en pantalla
    private int minutos; //controla los minutos que han concurrido en pantalla
    private int segundos; //controla los segundos que han concurrido en pantalla
    private int tipo; //tipo de reloj que es utilizado en la ejecucion
    private int horasPartida; //controla las horas que han concurrido en la partida
    private int minutosPartida; //controla los minutos que han concurrido en la partida
    private int segundosPartida; //controla los segundos que han concurrido en la partida
    //constructor
    public JuegoGuardado(Configuracion configuracion, Juego juego, List<String> jugadasEliminadas, List<String> jugadasRealizadas, Timer reloj, int horas, int minutos, int segundos, int tipo, int horasPartida, int minutosPartida, int segundosPartida){
        this.configuracion = configuracion;
        this.jugadasEliminadas = jugadasEliminadas;
        this.jugadasRealizadas = jugadasRealizadas;
        this.juego = juego;
        this.reloj = reloj;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.tipo = tipo;
        this.horasPartida = horasPartida;
        this.minutosPartida = minutosPartida;
        this.segundosPartida = segundosPartida;
    }
    
    //getters y setters
    
    /**
     * Getter de la configuracion
     * @return 
     */
    public Configuracion getConfiguracion(){
        return configuracion;
    }
    
    /**
     * Getter de las jugadas eliminadas
     * @return 
     */
    public List<String> getJugadasEliminadas(){
        return jugadasEliminadas;
    }
    
    /**
     * Getter de las jugadas realizadas
     * @return 
     */
    public List<String> getJugadasRealizadas(){
        return jugadasRealizadas;
    }
    
    /**
     * Getter de el juego
     * @return 
     */
    public Juego getJuego(){
        return juego;
    }
    
    /**
     * Getter del reloj timer
     * @return 
     */
    public Timer getReloj(){
        return reloj;
    }
    
    /**
     * Getter de las horas del temporizador
     * @return 
     */
    public int getHoras(){
        return horas;
    }
    
    /**
     * Getter de los minutos del temporizador
     * @return 
     */
    public int getMinutos(){
        return minutos;
    }
    
    /**
     * Getter de los segundos del temporizador
     * @return 
     */
    public int getSegundos(){
        return segundos;
    }
    
    /**
     * Getter del tipo de reloj utilizado
     * @return 
     */
    public int getTipo(){
        return tipo;
    }
    
    /**
     * Getter de las horas de la partida
     * @return 
     */
    public int getHorasPartida(){
        return horasPartida;
    }
    
    /**
     * Getter de los minutos de la partida
     * @return 
     */
    public int getMinutosPartida(){
        return minutosPartida;
    }
    
    /**
     * Getter de los segundos de la partida
     * @return 
     */
    public int getSegundosPartida(){
        return segundosPartida;
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
