/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Dilan
 */
public class JugadorTop implements Serializable {
    private static final long serialVersionUID = 3L;
    private String nombre;
    private int horas;
    private int minutos;
    private int segundos;
    
    /**
     * Constructor del objeto JugadorTop
     * @param nombre
     * @param horas
     * @param minutos
     * @param segundos 
     */
    public JugadorTop(String nombre, int horas, int minutos, int segundos){
        this.nombre = nombre;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    /**
     * Construcotr de JugadorTop sin parametros
     */
    public JugadorTop(){
        nombre = "";
        horas = 100;
        minutos = 0;
        segundos = 0;
    }
    
    //setters y getters
    /**
     * Actualiza el nombre
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Asigna el tiempo al jugador
     * @param horas
     * @param minutos
     * @param segundos 
     */
    public void setTiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public String getTiempo(){
        Integer horasI = horas;
        Integer minutosI = minutos;
        Integer segundosI = segundos;
        return horasI.toString() + ":" + minutosI.toString() + ":" + segundosI.toString();
    }
    /**
     * retorna el nombre del jugador
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * retorna las horas del jugador
     * @return horas
     */
    public int getHoras(){
        return horas;
    }
    
    /**
     * retorna los minutos del jugador
     * @return minutos
     */
    public int getMinutos(){
        return minutos;
    }
    
    /**
     * retorna los segundos del jugador
     * @return segundos
     */
    public int getSegundos(){
        return segundos;
    }
}
