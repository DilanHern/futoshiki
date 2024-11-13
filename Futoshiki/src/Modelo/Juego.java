package Modelo;

import java.util.ArrayList;

/**
 *
 */
public class Juego {
 
    //atributos
    private ArrayList<Partida> partidas;
    private Configuracion configuracion;
    
    //constructor
    /**
     * El constructor del juego no recibe paramentros ya que sus atributos se definen de forma separada
     */
    public Juego(){
        //incializa la lista
        partidas = new ArrayList<Partida>();
    }

    /**
     * @return the partidas
     */
    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    /**
     * @param partidas the partidas to set
     */
    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    /**
     * @return the configuracion
     */
    public Configuracion getConfiguracion() {
        return configuracion;
    }

    /**
     * @param configuracion the configuracion to set
     */
    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }
    
     /**
     * @param partida la cual se anade a la lista de partidas por primera vez
     */
    public void agregarPartida(Partida partida){
    
        this.partidas.add(partida);
        
    }
    
     /**
     * @param partida la cual se anade a la lista de partidas ya  modfificada
     * @param cuadricula representa la cuadricula que jugo el jugador con la partida
     */
    public void actualizarPartida(Partida partida, int[][] cuadricula){
    
        //busca en la lista la partida a actualizar y retorna el indice a buscar
        int indiceEncontrado = partidas.indexOf(partida);
        
        if(indiceEncontrado>=0){
        
            //modifica los valores nuevos
            partida.setCuadricula(cuadricula);
            partida.setHaFinalizado(true);
            
            //Actualiza la partida con el indice encontrado
            this.partidas.set(indiceEncontrado, partida);
            
        }
    }
}
