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
    
    /**
     * Este metodo se encarga de comparar el tiempo de un jugador con el tiempo dado 
     * @param jugador jugador con el que se comparara el tiempo
     * @param horas horas a comparar
     * @param minutos minutos a comparar
     * @param segundos segundos a comparar
     * @return booleano: true si el tiempo supera al del jugador, false si no lo supera
     */
    public static boolean esMejorTiempo(JugadorTop jugador, int horas, int minutos, int segundos){
        //verificar tiempo con el jugador
        if (jugador.getHoras() >  horas ){
            return true; //supero al jugador
        } 
        
        else if (jugador.getHoras() == horas){ //pasa a comparar los minutos
            if (jugador.getMinutos() > minutos){ 
               return true; //supero al jugador
            }
           
            else if (jugador.getMinutos() == minutos){ //pasa a comparar los segundos
                if (jugador.getSegundos() > segundos){
                    return true; //supero al jugador
                }
                
                else if (jugador.getSegundos() == segundos) {
                    return false; //igualo al jugador
                }
            }
        }
        return false; //no supero al jugador
    }
    
    /**
     * Este método se encarga de colocar en la posición dada al jugador dado, en el top dado
     * @param top10 top en el que se colocará al jugador
     * @param jugador jugador a colocar en el top
     * @param posicion posicion en el top a mover al jugador
     */
    public static void correrJugadores(Top10 top10, JugadorTop jugador, int posicion){
        switch(posicion){
            case 1 -> { //poner a jugador en top1
                top10.setJugador10(top10.getJugador9());
                top10.setJugador9(top10.getJugador8());
                top10.setJugador8(top10.getJugador7());
                top10.setJugador7(top10.getJugador6());
                top10.setJugador6(top10.getJugador5());
                top10.setJugador5(top10.getJugador4());
                top10.setJugador4(top10.getJugador3());
                top10.setJugador3(top10.getJugador2());
                top10.setJugador2(top10.getJugador1());
                top10.setJugador1(jugador);
            }
            case 2 -> { //ponerlo en top2
                top10.setJugador10(top10.getJugador9());
                top10.setJugador9(top10.getJugador8());
                top10.setJugador8(top10.getJugador7());
                top10.setJugador7(top10.getJugador6());
                top10.setJugador6(top10.getJugador5());
                top10.setJugador5(top10.getJugador4());
                top10.setJugador4(top10.getJugador3());
                top10.setJugador3(top10.getJugador2());
                top10.setJugador2(jugador);
            }
            case 3 -> { //top3
                top10.setJugador10(top10.getJugador9());
                top10.setJugador9(top10.getJugador8());
                top10.setJugador8(top10.getJugador7());
                top10.setJugador7(top10.getJugador6());
                top10.setJugador6(top10.getJugador5());
                top10.setJugador5(top10.getJugador4());
                top10.setJugador4(top10.getJugador3());
                top10.setJugador3(jugador);
            }
            case 4 -> { //top4
                top10.setJugador10(top10.getJugador9());
                top10.setJugador9(top10.getJugador8());
                top10.setJugador8(top10.getJugador7());
                top10.setJugador7(top10.getJugador6());
                top10.setJugador6(top10.getJugador5());
                top10.setJugador5(top10.getJugador4());
                top10.setJugador4(jugador);
            }
            case 5 -> { //top5
                top10.setJugador10(top10.getJugador9());
                top10.setJugador9(top10.getJugador8());
                top10.setJugador8(top10.getJugador7());
                top10.setJugador7(top10.getJugador6());
                top10.setJugador6(top10.getJugador5());
                top10.setJugador5(jugador);
            }
            case 6 -> { //top6
                top10.setJugador10(top10.getJugador9());
                top10.setJugador9(top10.getJugador8());
                top10.setJugador8(top10.getJugador7());
                top10.setJugador7(top10.getJugador6());
                top10.setJugador6(jugador);
            }
            case 7 -> { //top7 
                top10.setJugador10(top10.getJugador9());
                top10.setJugador9(top10.getJugador8());
                top10.setJugador8(top10.getJugador7());
                top10.setJugador7(jugador);
            }
            case 8 -> { //top8
                top10.setJugador10(top10.getJugador9());
                top10.setJugador9(top10.getJugador8());
                top10.setJugador8(jugador);
            }
            case 9 -> { //top9
                top10.setJugador10(top10.getJugador9());
                top10.setJugador9(jugador);
            }
            case 10 -> { //top10
                top10.setJugador10(jugador);
            }
            default ->{}
        }
    }
     
    /**
     * Este método se encarga de agregar al top10 al jugador que haya terminado el juego
     * @param top10 top10 a verificar
     * @param configuracion configuracion con los datos del top a verificar
     * @param horas horas hechas por el jugador
     * @param minutos minutos hechos por el jugador
     * @param segundos segundos hechos por el jugador
     * @param nombre nombre del jugador
     * @return booleano: true si el jugador fue agregado, false si no
     */
    public static boolean agregarTop10(ArrayList<ArrayList<Top10>> top10, Configuracion configuracion, int horas, int minutos, int segundos, String nombre){
        int dificultad = configuracion.getDificultad() - 1;
        int cuadricula = configuracion.getTamañoCuadricula() - 3;
        Top10 top10AUsar = top10.get(dificultad).get(cuadricula);
        
        if(!Top10.esMejorTiempo(top10AUsar.getJugador10(), horas, minutos, segundos)){ //no supero al jugador 10, mantiene el top
            return false;
        }
        //supero al jugador 10
        JugadorTop jugador = new JugadorTop(nombre, horas, minutos, segundos);
        if (!Top10.esMejorTiempo(top10AUsar.getJugador9(), horas, minutos, segundos)){ //no supero al jugador 9
            Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 10);
            return true;
        }
        
        //supero al jugador 9
        if (!Top10.esMejorTiempo(top10AUsar.getJugador8(), horas, minutos, segundos)){ //no supero al jugador 8
            Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 9);
            return true;
        }
        
        //supero al jugador 8
        if (!Top10.esMejorTiempo(top10AUsar.getJugador7(), horas, minutos, segundos)) { //no supero al jugador 7
            Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 8);
            return true;
        }
        
        //supero al jugador 7
        if (!Top10.esMejorTiempo(top10AUsar.getJugador6(), horas, minutos, segundos)) { //no supero al jugador 6
            Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 7);
            return true;
        }
        
        //supero al top 6
        if (!Top10.esMejorTiempo(top10AUsar.getJugador5(), horas, minutos, segundos)) { //no supero al jugador 5
            Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 6);
            return true;
        }

        //supero al top 5
        if (!Top10.esMejorTiempo(top10AUsar.getJugador4(), horas, minutos, segundos)) { //no supero al jugador 4
            Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 5);
            return true;
        }

        //supero al top 4
        if (!Top10.esMejorTiempo(top10AUsar.getJugador3(), horas, minutos, segundos)) { //no supero al jugador 3
            Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 4);
            return true;
        }

        //supero al top 3
        if (!Top10.esMejorTiempo(top10AUsar.getJugador2(), horas, minutos, segundos)) { //no supero al jugador 2
            Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 3);
            return true;
        }

        //supero al top 2
        if (!Top10.esMejorTiempo(top10AUsar.getJugador1(), horas, minutos, segundos)) { //no supero al jugador 1
            Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 2);
            return true;
        }

        //Supera al jugador 1
        Top10.correrJugadores(top10.get(dificultad).get(cuadricula), jugador, 1);
        return true;
    }
}
