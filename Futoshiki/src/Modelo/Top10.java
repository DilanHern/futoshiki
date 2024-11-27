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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * NOTA: EL ORDEN DEL ArrayList<ArrayList<Top10>> es:
 * 
 * @author Dilan
 */
public class Top10 implements Serializable {
    private static final long serialVersionUID = 2L;
    //atributos
    private JugadorTop jugador1;
    private JugadorTop jugador2;
    private JugadorTop jugador3;
    private JugadorTop jugador4;
    private JugadorTop jugador5;
    private JugadorTop jugador6;
    private JugadorTop jugador7;
    private JugadorTop jugador8;
    private JugadorTop jugador9;
    private JugadorTop jugador10;
    
    
    //constructor
    /**
     * Metodo constructor de la clase Top10
     * @param jugador1
     * @param jugador2
     * @param jugador3
     * @param jugador4
     * @param jugador5
     * @param jugador6
     * @param jugador7
     * @param jugador8
     * @param jugador9
     * @param jugador10 
     */
    public Top10(JugadorTop jugador1, JugadorTop jugador2, JugadorTop jugador3, JugadorTop jugador4, JugadorTop jugador5,
    JugadorTop jugador6, JugadorTop jugador7, JugadorTop jugador8, JugadorTop jugador9, JugadorTop jugador10) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
        this.jugador4 = jugador4;
        this.jugador5 = jugador5;
        this.jugador6 = jugador6;
        this.jugador7 = jugador7;
        this.jugador8 = jugador8;
        this.jugador9 = jugador9;
        this.jugador10 = jugador10;
    }
    
    /**
     * Constructor del top10 sin parámetros
     */
    public Top10(){
        jugador1 = new JugadorTop();
        jugador2 = new JugadorTop();
        jugador3 = new JugadorTop();
        jugador4 = new JugadorTop();
        jugador5 = new JugadorTop();
        jugador6 = new JugadorTop();
        jugador7 = new JugadorTop();
        jugador8 = new JugadorTop();
        jugador9 = new JugadorTop();
        jugador10 = new JugadorTop();
    }
    
    /**
     * Obtiene el jugador en la posición 1.
     * @return el jugador en la posición 1.
     */
    public JugadorTop getJugador1() {
        return jugador1;
    }

    /**
     * Establece el jugador en la posición 1.
     * @param jugador1 el jugador a establecer en la posición 1.
     */
    public void setJugador1(JugadorTop jugador1) {
        this.jugador1 = jugador1;
    }

    /**
     * Obtiene el jugador en la posición 2.
     * @return el jugador en la posición 2.
     */
    public JugadorTop getJugador2() {
        return jugador2;
    }

    /**
     * Establece el jugador en la posición 2.
     * @param jugador2 el jugador a establecer en la posición 2.
     */
    public void setJugador2(JugadorTop jugador2) {
        this.jugador2 = jugador2;
    }

    /**
     * Obtiene el jugador en la posición 3.
     * @return el jugador en la posición 3.
     */
    public JugadorTop getJugador3() {
        return jugador3;
    }

    /**
     * Establece el jugador en la posición 3.
     * @param jugador3 el jugador a establecer en la posición 3.
     */
    public void setJugador3(JugadorTop jugador3) {
        this.jugador3 = jugador3;
    }

    /**
     * Obtiene el jugador en la posición 4.
     * @return el jugador en la posición 4.
     */
    public JugadorTop getJugador4() {
        return jugador4;
    }

    /**
     * Establece el jugador en la posición 4.
     * @param jugador4 el jugador a establecer en la posición 4.
     */
    public void setJugador4(JugadorTop jugador4) {
        this.jugador4 = jugador4;
    }

    /**
     * Obtiene el jugador en la posición 5.
     * @return el jugador en la posición 5.
     */
    public JugadorTop getJugador5() {
        return jugador5;
    }

    /**
     * Establece el jugador en la posición 5.
     * @param jugador5 el jugador a establecer en la posición 5.
     */
    public void setJugador5(JugadorTop jugador5) {
        this.jugador5 = jugador5;
    }

    /**
     * Obtiene el jugador en la posición 6.
     * @return el jugador en la posición 6.
     */
    public JugadorTop getJugador6() {
        return jugador6;
    }

    /**
     * Establece el jugador en la posición 6.
     * @param jugador6 el jugador a establecer en la posición 6.
     */
    public void setJugador6(JugadorTop jugador6) {
        this.jugador6 = jugador6;
    }

    /**
     * Obtiene el jugador en la posición 7.
     * @return el jugador en la posición 7.
     */
    public JugadorTop getJugador7() {
        return jugador7;
    }

    /**
     * Establece el jugador en la posición 7.
     * @param jugador7 el jugador a establecer en la posición 7.
     */
    public void setJugador7(JugadorTop jugador7) {
        this.jugador7 = jugador7;
    }

    /**
     * Obtiene el jugador en la posición 8.
     * @return el jugador en la posición 8.
     */
    public JugadorTop getJugador8() {
        return jugador8;
    }

    /**
     * Establece el jugador en la posición 8.
     * @param jugador8 el jugador a establecer en la posición 8.
     */
    public void setJugador8(JugadorTop jugador8) {
        this.jugador8 = jugador8;
    }

    /**
     * Obtiene el jugador en la posición 9.
     * @return el jugador en la posición 9.
     */
    public JugadorTop getJugador9() {
        return jugador9;
    }

    /**
     * Establece el jugador en la posición 9.
     * @param jugador9 el jugador a establecer en la posición 9.
     */
    public void setJugador9(JugadorTop jugador9) {
        this.jugador9 = jugador9;
    }

    /**
     * Obtiene el jugador en la posición 10.
     * @return el jugador en la posición 10.
     */
    public JugadorTop getJugador10() {
        return jugador10;
    }

    /**
     * Establece el jugador en la posición 10.
     * @param jugador10 el jugador a establecer en la posición 10.
     */
    public void setJugador10(JugadorTop jugador10) {
        this.jugador10 = jugador10;
    }
    
    /**
     * Guarda el top 10 en un archivo
     * @param nombreArchivo
     * @param top10
     * @throws IOException 
     */
    public static void guardarTop(String nombreArchivo, ArrayList<ArrayList<Top10>> top10) throws IOException {
        ObjectOutputStream oos = null; //crea el objeto ObjectOutPutStream util para cargar archivos
        try {
            oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo)); //Se abre o crea nombreArchivo, ObjectOutputStream convierte el objeto en bytes y FileOutputStream escribe bytes en el archivo. 
            oos.writeObject(top10);
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
     * Carga el top 10 desde un archivo.
     * @param nombreArchivo El nombre del archivo desde el cual cargar la configuracion.
     * @return La lista de top10 cargada desde el archivo.
     */
    public static ArrayList<ArrayList<Top10>> cargarTop10(String nombreArchivo){
        ObjectInputStream ois = null; //crea el objeto ObjectInputStream util para leer archivos
        try {
            ois = new ObjectInputStream(new FileInputStream(nombreArchivo)); //se inicializa el objeto y guarda el archivo "nombreArchivo"
            Object objeto = ois.readObject(); //lee el archivo guardado en ois y devuelve un tipo "Object"
            ArrayList<ArrayList<Top10>> top10Cargado = (ArrayList<ArrayList<Top10>>) objeto; //se realiza un casting de objeto a ArrayList<Estudiante>
            System.out.println("El archivo se cargo correctamente");
            return top10Cargado;
                    
        } 
        catch (FileNotFoundException ex) {
            return null;
        } 
        catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }        
        //este catch significa que no hay objeto en el archivo
        catch (ClassCastException e) {
             System.out.println("No hay objeto en el archivo top");   
        }
        
        finally {
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
    
    /**
     * Crea una lista del top10 de jugadores vacia
     * @return una lista de top 10 vacia
     */
    public static ArrayList<ArrayList<Top10>> crearTop10Vacio(){
        ArrayList<ArrayList<Top10>> resultado = new ArrayList<>();
        
        for (int i = 0; i < 3; i++){ //agregamos 3 filas (dificultad) indice 0 = facil, 1 = intermedio, 2 = dificil     
            ArrayList<Top10> topDificultad = new ArrayList<>();
            for (int j = 0; j < 7; j++){ //agregamos cada cuadricula: indice 0 = 3x3, 1 = 4x4, 2 = 5x5,...
                topDificultad.add(new Top10());
            }
            resultado.add(topDificultad);
        }
        
        return resultado;
    }
    
}
