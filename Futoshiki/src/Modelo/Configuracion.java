/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Dilan
 */
public class Configuracion {

    /**
     * @return the dificultad
     */
    public int getDificultad() {
        return dificultad;
    }

    /**
     * @param dificultad the dificultad to set
     */
    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * @return the multinivel
     */
    public boolean getMultinivel() {
        return multinivel;
    }

    /**
     * @param multinivel the multinivel to set
     */
    public void setMultinivel(boolean multinivel) {
        this.multinivel = multinivel;
    }

    /**
     * @return the Reloj
     */
    public int getReloj() {
        return Reloj;
    }

    /**
     * @param Reloj the Reloj to set
     */
    public void setReloj(int Reloj) {
        this.Reloj = Reloj;
    }

    /**
     * @return the posicionVentana
     */
    public int getPosicionVentana() {
        return posicionVentana;
    }

    /**
     * @param posicionVentana the posicionVentana to set
     */
    public void setPosicionVentana(int posicionVentana) {
        this.posicionVentana = posicionVentana;
    }

    /**
     * @return the nombreJugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * @param nombreJugador the nombreJugador to set
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * @return the instancia
     */
    public static Configuracion getInstancia() {
        return instancia;
    }

    /**
     * @param aInstancia the instancia to set
     */
    public static void setInstancia(Configuracion aInstancia) {
        instancia = aInstancia;
    }

    /**
     * @return the tamañoCuadricula
     */
    public int getTamañoCuadricula() {
        return tamañoCuadricula;
    }

    /**
     * @param tamañoCuadricula the tamañoCuadricula to set
     */
    public void setTamañoCuadricula(int tamañoCuadricula) {
        this.tamañoCuadricula = tamañoCuadricula;
    }
    
    private int tamañoCuadricula;
    private int dificultad;
    private boolean multinivel;
    private int Reloj;
    private int posicionVentana;
    private String nombreJugador;
    private static Configuracion instancia;
}
