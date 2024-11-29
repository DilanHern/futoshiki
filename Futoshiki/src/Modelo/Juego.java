package Modelo;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Juego implements Serializable{
 
    //atributos
    private static final long serialVersionUID = 4L;
    private ArrayList<Partida> partidas;
    private Configuracion configuracion;
    private Partida partidaActual;
    
    //metodos
    /**
     * El constructor del juego no recibe paramentros ya que sus atributos se definen de forma separada
     */
    public Juego(){
        //incializa la lista
        partidas = new ArrayList<Partida>();
        partidaActual = null;
    }

    /**
     * @return the partidaActual
     */
    public Partida getPartidaActual() {
        return partidaActual;
    }

    /**
     * realiza una copia de la partida para que no se modifique
     * @param partida the partidaActual to set
     */
    public void setPartidaActual(Partida partida) {
        partidaActual = new Partida("",0);
        partidaActual.setTamano(partida.getTamano());
        partidaActual.setNivel(partida.getNivelString());
        partidaActual.setHaFinalizado(false);
        partidaActual.setDesigualdades(partida.getDesigualdades());
        partidaActual.setConstantes(partida.getConstantes());
        partidaActual.setCuadricula(partida.getCuadricula());
    }
    
        /**
     * realiza una copia de la partida para que no se modifique
     * @param partida the partidaActual to set
     */
    public void restablecerPartidaActual(Partida partida) {
        partidaActual = partida;
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
    
     /**
     * @param etiqueta representa la etiqueta del xml que se busca
     * @param elemento representa el elemento en el que se buscara la etiqueta
     * @returns String retorna el valor que se encontro dentro de la etiqueta
     */
    private static String getValue(String etiqueta, Element elemento){
        
        NodeList nodos = elemento.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node nodo = (Node) nodos.item(0);
        return nodo.getNodeValue();              
    }
    
    
    /**
     * @param partida representa la partida a la que se van a cargar las desigualdades
     * @param desigualdades representa la lista de nodos del archivo xml de la cual se van a cargar
     * @returns Partida retorna la partida cargada
     */
    private Partida cargarDesigualdades(Partida partida, NodeList desigualdades){
        
        for (int k=0; k<desigualdades.getLength();k++){
                Node nodo = desigualdades.item(k);
                
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element)nodo;
                    partida.agregarDesigualdad(elemento.getFirstChild().getNodeValue());
                }                
            }
        
        return partida;
    }
    
    /**
     * @param partida representa la partida a la que se van a cargar las constantes
     * @param constantes representa la lista de nodos del archivo xml de la cual se van a cargar
     * @returns Partida retorna la partida cargada
     */
    private Partida cargarConstantes(Partida partida, NodeList constantes){
        
        for (int k=0; k<constantes.getLength();k++){
                Node nodo = constantes.item(k);
                
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element)nodo;
                    String constanteTexto = elemento.getFirstChild().getNodeValue();
                    String[] partes = constanteTexto.split(",");
                    int constante =Integer.parseInt(partes[0]);
                    int fila = Integer.parseInt(partes[1]);
                    int columna =Integer.parseInt(partes[2]);
                    
                    partida.asignarConstante(fila, columna, constante);
                    partida.agregarConstante(constanteTexto);
                }                
            }
        
        return partida;
    }
    /**
     * Realiza la carga de las partidas que estan previamente cargadas y son utilizadas durante la ejecucion
     */
    public void CargarPartidas(){

        try {
            
            File archivo = new File("futoshiki2024partidas.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document partidasxml = builder.parse(archivo);
            partidasxml.getDocumentElement().normalize(); 
            
            NodeList nodos = partidasxml.getElementsByTagName("partida");
            
            for (int k=0; k<nodos.getLength();k++){
                Node nodo = nodos.item(k);
                
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element)nodo;
                    String nivel = getValue( "nivel", elemento);
                    String tamano = getValue( "cuadricula", elemento);
                    
                    Partida partida = new Partida(nivel, Integer.parseInt(tamano));
                    
                    NodeList desigualdades = elemento.getElementsByTagName("des");
                    cargarDesigualdades(partida, desigualdades);
                    NodeList constantes = elemento.getElementsByTagName("cons");
                    cargarConstantes(partida, constantes);
                    
                    //agrega la partida a las partidas del juego en ejecucion
                    agregarPartida(partida);
                }                
            }
        } catch (Exception ex){ 
            ex.printStackTrace();
        }
        
    }
    
    /**
     * @param tamano de la cuadricula de la partida a buscar
     * @param dificultad de la cuadricula de la partida a buscar
     * @param repetir define si ya se usaron todas la partidas que fueron guardadas por lo que se deben repetir
     */
    private Partida buscarPartida(int tamano, int dificultad, boolean repetir){
        Random random = new Random();
        List<Partida> partidasEncontradas = new ArrayList<Partida>();
       //recorre y busca un partida con la que se pueda jugar
        for(Partida partida : partidas){
            if(partida.getTamano() == tamano){
                
                if(partida.getNivel() == dificultad){
                
                    //valida que no se haya jugado la partida
                    if(!partida.getHaFinalizado()){
                        partida.setHaFinalizado(true); //se asigna a la partida true para indicar que se va a utilizar y ya no se usa mas a excepcion de que se ocupe repetir
                        partidasEncontradas.add(partida);
                    }
                    else if(repetir){ //valida si se puede repetir partidas
                        if(partida!=partidaActual)
                        partidasEncontradas.add(partida);
                    }
                }
            }
        }
        
        //escoge una de forma aleatoria para evitar repetido
        if(!partidasEncontradas.isEmpty())
            return partidasEncontradas.get(random.nextInt(partidasEncontradas.size()));
        else
            return null; //no hubo partidas
    }
    
    /**
     * @param dificultad representa el nivel que se busca, esto por que si es multinivel la configuracion no podra controlar la subida de niveles
     * @return Partida retorna la partida encontrada
     */
    public Partida escogerPartida(int dificultad){
        
        int tamano = configuracion.getTamañoCuadricula();
        
        Partida partida = buscarPartida(tamano, dificultad,false);
        //en caso de recibir null indica que ya se jugaron todas las partidas y se debe buscar una que ya haya sido utilizada
        if(partida==null){
            partida = buscarPartida(tamano, dificultad,true);
        }
        return partida;
    }

    
}
