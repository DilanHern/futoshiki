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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dilan
 */
public class Configuracion implements Serializable{
    private static final long serialVersionUID = 1L;
    private int tamañoCuadricula; //3 = 3x3, 4 = 4x4, etc... MIN: 3, MAX: 10
    private int dificultad; //1 = facil, 2 = medio, 3 = dificil
    private boolean multinivel; //false = no, true = si
    private int reloj; //1 = cronometro, 2 = Temporizador, 3 = 0
    private int posicionVentana; //1 = derecha, 2 = izquierda
    private String nombreJugador; //String entre 0 y 30 caracteres
    private String pin; //pin de 4 caracteres
    private String correo; //correo electrónico del jugador
    private int horas; //horas del temporizador (0 por defecto)
    private int minutos; //minutos del temporizador (0 por defecto)
    private int segundos; //segundos del temporizador (0 por defecto)
    private static Configuracion instancia;
    private Map<String, ArrayList<String>> jugadoresRegistrados; //diccionario/hashmap con los jugadores registrados, 
    //en el arraylist, el indice 0 es el pin y el indice 1 es el correo
    
    /**
     * Método constructor de la clase Configuracion, asigna todos los atributos por defecto / por omision
     */
    public Configuracion(){
        tamañoCuadricula = 5;
        dificultad = 1;
        multinivel = false;
        reloj = 1;
        posicionVentana = 1;
        nombreJugador = "";
        pin = "";
        correo = "";
        horas = 0;
        minutos = 0;
        segundos = 0;
        jugadoresRegistrados = new HashMap<>();
    }
    
    /**
     * Método constructor de la clase Configuracion, asigna todos los atributos pasados por parámetro
     * @param tamañoCuadricula el tamaño de la cuadricula
     * @param dificultad la dificultad del juego
     * @param multinivel si el juego será multinivel o no
     * @param reloj el tipo de reloj que utilizara
     * @param posicionVentana la posición en la que estará la ventana
     * @param nombreJugador el nombre del jugador
     * @param pin el pin del jugador
     * @param correo el correo del jugador
     * @param horas las horas del temporizador
     * @param minutos los minutos del temporizador
     * @param segundos los segundos del temporizador
     * @param jugadoresRegistrados hashmap con todos los jugadores registrados
     */
    public Configuracion(int tamañoCuadricula, int dificultad, boolean multinivel, int reloj, 
    int posicionVentana, String nombreJugador, String pin, String correo, int horas, int minutos, int segundos, Map<String, ArrayList<String>> jugadoresRegistrados){
        this.tamañoCuadricula = tamañoCuadricula;
        this.dificultad = dificultad;
        this.multinivel = multinivel;
        this.reloj = reloj;
        this.posicionVentana = posicionVentana;
        this.nombreJugador = nombreJugador;
        this.pin = pin;
        this.correo = correo;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.jugadoresRegistrados = jugadoresRegistrados;
    }
    
    /**
     * @return el hashmap de los jugadores
     */
    public Map<String, ArrayList<String>> getJugadoresRegistrados(){
        return jugadoresRegistrados;
    }
    
    /**
     * @param jugadoresRegistrados el hashmap de todos los jugadores registrados 
     */
    public void setJugadoresRegistrados(Map<String, ArrayList<String>> jugadoresRegistrados){
        this.jugadoresRegistrados = jugadoresRegistrados;
    }
    
    /**
     * @return el correo asignado
     */
    public String getCorreo(){
        return correo;
    }
    
    /**
     * @param correo el correo a asignar
     */
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    /**
     * @return el pin asignado
     */
    public String getPin(){
        return pin;
    }
    
    /**
     * @param pin el pin a asignar
     */
    public void setPin(String pin){
        this.pin = pin;
    }
    
    /**
     * @return las horas asignadas
     */
    public int getHoras(){
        return horas;
    }
    
    /**
     * @param horas las horas a asignar
     */
    public void setHoras(int horas){
        this.horas = horas;
    }
    
    
    /**
     * @return los minutos asignados
     */
    public int getMinutos()
    {
        return minutos;
    }    
    
    /**
     * @param minutos los minutos a asignar
     */
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
    
    /**
     * @return los segundos asignados
     */
    public int getSegundos(){
        return segundos;
    }
    
    /**
     * @param segundos los segundos a asignar
     */
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }
    
    /**
     * @return la dificultad asignada
     */
    public int getDificultad() {
        return dificultad;
    }

    /**
     * @param dificultad la dificultad a asignar
     */
    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * @return el multinivel asignado
     */
    public boolean getMultinivel() {
        return multinivel;
    }

    /**
     * @param multinivel el multinivel a asignar
     */
    public void setMultinivel(boolean multinivel) {
        this.multinivel = multinivel;
    }

    /**
     * @return el Reloj asignado
     */
    public int getReloj() {
        return reloj;
    }

    /**
     * @param reloj el reloj a asignar
     */
    public void setReloj(int reloj) {
        this.reloj = reloj;
    }

    /**
     * @return la posicionVentana asignada
     */
    public int getPosicionVentana() {
        return posicionVentana;
    }

    /**
     * @param posicionVentana la posicionVentana a asignar
     */
    public void setPosicionVentana(int posicionVentana) {
        this.posicionVentana = posicionVentana;
    }

    /**
     * @return el nombreJugador asignado
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * @param nombreJugador el nombreJugador a asignar
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * @return la instancia asignada
     */
    public static Configuracion getInstancia() {
        return instancia;
    }

    /**
     * @param aInstancia la instancia a asignar
     */
    /*
    public static void setInstancia(Configuracion aInstancia) {
        instancia = aInstancia;
    }
    */
    
    /**
     * @return el tamañoCuadricula asignado
     */
    public int getTamañoCuadricula() {
        return tamañoCuadricula;
    }

    /**
     * @param tamañoCuadricula el tamañoCuadricula asignado
     */
    public void setTamañoCuadricula(int tamañoCuadricula) {
        this.tamañoCuadricula = tamañoCuadricula;
    }
    
    
    /**
     * Guarda la configuracion en un archivo.
     *
     * @param nombreArchivo El nombre del archivo en el cual guardar la configuracion.
     * @param configuracion El objeto configuracion con los datos a guardar
     * @throws IOException Si ocurre un error al escribir el archivo.
     */
    public static void guardarConfiguracion(String nombreArchivo, Configuracion configuracion) throws IOException {
        ObjectOutputStream oos = null; //crea el objeto ObjectOutPutStream util para cargar archivos
        try {
            oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo)); //Se abre o crea nombreArchivo, ObjectOutputStream convierte el objeto en bytes y FileOutputStream escribe bytes en el archivo. 
            oos.writeObject(configuracion);
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
     * Carga la configuracion desde un archivo.
     * @param nombreArchivo El nombre del archivo desde el cual cargar la configuracion.
     * @return La lista de usuarios cargada desde el archivo.
     */
    public static Configuracion cargarConfiguracion(String nombreArchivo){
        ObjectInputStream ois = null; //crea el objeto ObjectInputStream util para leer archivos
        try {
            ois = new ObjectInputStream(new FileInputStream(nombreArchivo)); //se inicializa el objeto y guarda el archivo "nombreArchivo"
            Object objeto = ois.readObject(); //lee el archivo guardado en ois y devuelve un tipo "Object"
            Configuracion configuracionCargada = (Configuracion) objeto; //se realiza un casting de objeto a ArrayList<Estudiante>
            System.out.println("El archivo se cargo correctamente");
            return configuracionCargada;
                    
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
