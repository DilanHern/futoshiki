package Modelo;

import java.util.ArrayList;

public class Partida {
    
    
    //Atributos
    private int[][] cuadricula;
    private boolean haFinalizado; //true-> ya fue jugada false-> aun no fue jugada
    private int nivel;
    private int tamano;
    private ArrayList<String> desigualdades;
    private ArrayList<String> constantes;

    //Constructor
    /**
     * @param nivel the nivel to set
     * @param tamano the tamano to set
     */
    public Partida(String nivel, int tamano){
    
       setNivel(nivel);
       this.tamano=tamano;
        
        //Define el tamano de la cuadricula
        this.cuadricula = new  int[tamano][tamano];
        // Inicializa todos los valores a 0
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                cuadricula[i][j] = 0;
            }
        }
        //inicializa las listas de string para ser cargadas
        desigualdades = new ArrayList<String>();
        constantes = new ArrayList<String>();
        
        //define si la partida ya fue jugada por el jugador en la ejecucion en caso de ser una partida predeterminada
        //en caso de ser la jugada actual sera false si esta en juego
        haFinalizado = false; //No se ha utilizado
    
    }

    /**
     * @param partida realiza una copia de la partida para que no sea modificada las demas partidas
     */
    public Partida(Partida partida){
    
        desigualdades = new ArrayList<String>();
        constantes = new ArrayList<String>();
        nivel= partida.nivel;
        tamano=partida.tamano;
        //actualiza la cuadricula
        this.cuadricula = new  int[tamano][tamano];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                cuadricula[i][j] = partida.getCuadricula()[i][j];
            }
        }
        //al no ser modificadas no es necesario hacer una copia
       desigualdades = new ArrayList<>(partida.getDesigualdades()); // Copia superficial
       constantes = new ArrayList<>(partida.getConstantes());      // Copia superficial
        
        haFinalizado=false;
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
    public boolean getHaFinalizado() {
        return haFinalizado;
    }

    /**
     * @param haFinalizado the haFinalizado to set
     */
    public void setHaFinalizado(boolean haFinalizado) {
        this.haFinalizado = haFinalizado;
    }

    /**
     * @return the nivel entero
     */
    public int getNivel() {
        return nivel;
    }
    
     /**
     * @return the nivel en string
     */
    public String getNivelString() {
        String dificultad = "";
        
        if(nivel==1)
            dificultad+="Facil";
        else if(nivel==2)
            dificultad+="Intermedio";
        else if(nivel==3)
            dificultad+="Dificil";
        
        return dificultad;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        
        if(nivel.equals("Facil"))
            this.nivel = 1;
        else if(nivel.equals("Intermedio"))
            this.nivel = 2;
        else if(nivel.equals("Dificil"))
            this.nivel = 3;
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
    
    /**
     * Asigna un elemento a la fila y columna indicada
     * @param fila representa la fila de la cuadricula
     * @param columna representa la columna de la cuadricula
     * @param numero representa el numero que se va asignar a la celda
     */
    public void asignarConstante(int fila, int columna, int numero){
    
        cuadricula[fila][columna] = numero;
        
    }
    
    /**
     * Busca una desigualdad entre botones
     * @param fila representa la fila de la cuadricula
     * @param columna representa la columna de la cuadricula
     * @param tipoDesigualdad representa el tipo de desigualdad de fila o de columna. 1-> fila 2->columna
     * @return desigualdad que fue encontrada con el indice y el tipo, o un vacio si no encontro
     */
    public String buscarDesigualdad(int fila, int columna, int tipoDesigualdad){
    
        String desigualdad = "";
        
        for(String cadena : desigualdades){
        
            //divide la cadena eliminando la , y la secciona en 3 partes -> desigualdad,fila,columna
            String[] partes = cadena.split(",");
            if(Integer.parseInt(partes[1]) == fila && Integer.parseInt(partes[2])==columna){
            
                //desigualdad de fila, indice de la casilla que esta a la izquierda de la desigualda
                if(tipoDesigualdad== 1){
                
                    if(partes[0].equals("maf"))
                        desigualdad=">";
                    else if(partes[0].equals("mef"))
                        desigualdad="<";
                
                }else{ //indice de la casilla superior de la desigualdad
                
                    if(partes[0].equals("mac"))
                        desigualdad=">";
                    else if(partes[0].equals("mec"))
                        desigualdad="<";
                
                }
                
            }
            
        }
        //retorna la desigualdad que fue encontrada o si no hubo retorna un string en blanco
        return desigualdad;
    }
      /**
     * @param numero representa el numero que se quiere colocar en la celda
     * @param fila representa la fila de la celda
     * @param columna representa la columna
     * @return entero que representa si la jugada es valida o tiene algun error 1->correcta 4->no cumple con la restriccion de mayor 5->no cumple con la restriccion de menor
     */
    private int validarDesigualdad(int numero, int fila, int columna){
    
        int retorno = 1;
        String signo="";
        //recorre por columna la matriz para validar la jugada 
        for(String desigualdad : desigualdades){
            //divide las partes
            String[] partes = desigualdad.split(",");
            if(Integer.parseInt(partes[1])==fila && Integer.parseInt(partes[2])==columna){
            
                //busco desigualdad de fila con la celda del lado derecho
                signo= buscarDesigualdad(fila, columna,1);
                //valida que si haya un signo a validar
                if(!"".equals(signo) && columna!= cuadricula.length-1  && cuadricula[fila][columna+1]>0){
                    if(signo.equals(">")){
                        if(numero < cuadricula[fila][columna+1]){
                            return 4;
                        }
                    }else{
                        if(numero > cuadricula[fila][columna+1]){
                            return 5;
                        }
                    }
                }
                //busco desigualdad de columna con la de abajo
                signo= buscarDesigualdad(fila, columna,2);
                if(!"".equals(signo) && fila!= cuadricula.length-1 && cuadricula[fila+1][columna]>0){
                    if(signo.equals(">")){
                        if(numero < cuadricula[fila+1][columna]){
                            return 4;
                        }
                    }else{
                        if(numero > cuadricula[fila+1][columna]){
                            return 5;
                        }
                    }
                }
            }
            
            if(Integer.parseInt(partes[1])==fila && Integer.parseInt(partes[2])==columna-1){
                //busco desigualdad de fila con la celda del lado izquierdo
                 signo= buscarDesigualdad(fila, columna-1,1);
                 System.out.println(columna-1);
                 if(!"".equals(signo)  && columna!=0 &&  cuadricula[fila][columna-1]>0){
                        if(signo.equals(">")){
                            if(numero > cuadricula[fila][columna-1]){
                                return 4;
                            }
                        }else{
                            if(numero < cuadricula[fila][columna-1]){
                                return 5;
                            }
                        }
                    }
                 }
            
            if(Integer.parseInt(partes[1])==fila-1 && Integer.parseInt(partes[2])==columna){
                //busco desigualdad de fila con la celda de arriba
                 signo= buscarDesigualdad(fila-1, columna,2);
                 System.out.println(fila-1);
                 if(!"".equals(signo) && fila!=0 &&  cuadricula[fila-1][columna]>0){
                        if(signo.equals(">")){
                            if(numero > cuadricula[fila-1][columna]){
                                return 4;
                            }
                        }else{
                            if(numero < cuadricula[fila-1][columna]){
                                return 5;
                            }
                        }
                    }
                 }
            }
        return retorno;
    }
    
    /**
     * elimina el valor de la cuadricula
     * @param fila representa la fila de la celda
     * @param columna representa la columna
     */
    public void EliminarValor(String fila, String columna){
    
        int filaInteger = Integer.parseInt(fila);
        int columnaInteger = Integer.parseInt(columna);
        
        cuadricula[filaInteger][columnaInteger] = 0;
    }
    
    /**
     * anade el valor a la cuadricula
     * @param numero representa el numero que se quiere colocar en la celda
     * @param fila representa la fila de la celda
     * @param columna representa la columna
     */
     public void AgregarValor(String numero, String fila, String columna){
    
        int filaInteger = Integer.parseInt(fila);
        int columnaInteger = Integer.parseInt(columna);
        int valor = Integer.parseInt(numero);
        
        cuadricula[filaInteger][columnaInteger] = valor;
         
    }
    
    /**
     * @param numero representa el numero que se quiere colocar en la celda
     * @param fila representa la fila de la celda
     * @param columna representa la columna
     * @return entero que representa si la jugada es valida o tiene algun error 1->correcta 2->ya esta en la columna 3->ya esta en la fila 4->no cumple con la restriccion de mayor 5->no cumple con la restriccion de menor
     */
    public int validarMovimiento(int numero, int fila, int columna){
        
        int retorno = 1;
        cuadricula[fila][columna]=0;
        //recorre por columna la matriz para validar la jugada
        for(int c=0; c< cuadricula.length;c++){
        
            if(numero == cuadricula[fila][c])
                return 3;//ya hay en la fila
            
             if(numero==cuadricula[c][columna])
                 return 2;//ya hay en la columna
        }
        //valida las desigualdades que haya alrrededor de la celda
        retorno = validarDesigualdad(numero, fila, columna);
        if(retorno==1) 
            cuadricula[fila][columna]=numero;//En caso de que no haya error agrego el numero a la cuadricula
        
        return retorno;
    }
    
    /**
     * Valida que se haya ganado la partida con todas las celdas de la cuadricula llenas
     *@return boolean true-> ha ganado false->ha perdido
     */
    public boolean validarGane(){
    
        for(int c=0; c<cuadricula.length;c++){
            for(int f=0;f<cuadricula.length;f++){
                
                if(cuadricula[f][c]<=0)
                    return false;
                
            }
        }
        
        return true;
    }
    
    /**
     * Limpia la cuadricula y los valores que fueron utilizados
     */
    public void limpiarCuadricula(){
    
        desigualdades = new ArrayList<String>();
        constantes = new ArrayList<String>();
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                cuadricula[i][j] = 0;
            }
        }
    
    }
}
