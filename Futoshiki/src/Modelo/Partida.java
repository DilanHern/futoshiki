package Modelo;

import java.awt.List;
import java.util.ArrayList;

public class Partida {
    
    
    //Atributos
    private int[][] cuadricula;
    private boolean haFinalizado; //true-> ya fue jugada false-> aun no fue jugada
    private String nivel;
    private int tamano;
    private ArrayList<String> desigualdades;
    private ArrayList<String> constantes;

    //Constructor
    /**
     * @param nivel the nivel to set
     * @param tamano the tamano to set
     */
    public Partida(String nivel, int tamano){
    
        this.nivel = nivel;
        this.tamano=tamano;
        
        //Define el tamano de la cuadricula
        this.cuadricula = new  int[tamano][tamano];
        
        //inicializa las listas de string para ser cargadas
        desigualdades = new ArrayList<String>();
        constantes = new ArrayList<String>();
        
        //define si la partida ya fue jugada por el jugador en la ejecucion en caso de ser una partida predeterminada
        //en caso de ser la jugada actual sera false si esta en juego
        haFinalizado = false; //No se ha utilizado
    
    }
    
    /**
     * @return the cuadricula
     */
    public int[][] getCuadricula() {
        return cuadricula;
    }

    /**
     * @param cuadricula the cuadricula to set
     */
    public void setCuadricula(int[][] cuadricula) {
        this.cuadricula = cuadricula;
    }

    /**
     * @return the haFinalizado
     */
    public boolean isHaFinalizado() {
        return haFinalizado;
    }

    /**
     * @param haFinalizado the haFinalizado to set
     */
    public void setHaFinalizado(boolean haFinalizado) {
        this.haFinalizado = haFinalizado;
    }

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the desigualdades
     */
    public ArrayList<String> getDesigualdades() {
        return desigualdades;
    }

    /**
     * @param desigualdades the desigualdades to set
     */
    public void setDesigualdades(ArrayList<String> desigualdades) {
        this.desigualdades = desigualdades;
    }

    /**
     * @return the constantes
     */
    public ArrayList<String> getConstantes() {
        return constantes;
    }

    /**
     * @param constantes the constantes to set
     */
    public void setConstantes(ArrayList<String> constantes) {
        this.constantes = constantes;
    }

    /**
     * @param desigualdad la desigualdad de tipo string para anadirla en la lista de desigualdades de la partida
     */
    public void agregarDesigualdad(String desigualdad){
    
        this.desigualdades.add(desigualdad);
        
    }
    
    /**
     * @param constante la constante de tipo string para anadirla en la lista de constantes de la partida
     */
    public void agregarConstante(String constante){
    
        this.constantes.add(constante);
        
    }
    
}
