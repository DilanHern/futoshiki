/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dilan
 */
public class ControladorConfiguracion {
    private MenuPrincipal vistaPrincipal;
    private MenuConfiguracion vistaConfig;
    private Configuracion configuracionCargada;
    
    public void refrescarConfiguracion(MenuConfiguracion vistaConfig, Configuracion configuracionCargada){
        //mostrar configuraciones actuales en la vista:
        
        //Tamaño de la cuadricula
        switch (configuracionCargada.getTamañoCuadricula()) {
            case 3 -> this.vistaConfig.btn3x3.setSelected(true);
            case 4 -> this.vistaConfig.btn4x4.setSelected(true);
            case 5 -> this.vistaConfig.btn5x5.setSelected(true);
            case 6 -> this.vistaConfig.btn6x6.setSelected(true);
            case 7 -> this.vistaConfig.btn7x7.setSelected(true);
            case 8 -> this.vistaConfig.btn8x8.setSelected(true);
            case 9 -> this.vistaConfig.btn9x9.setSelected(true);
            case 10 -> this.vistaConfig.btn10x10.setSelected(true);
            default -> {}
        }
        
        //nivel de dificultad
        switch (configuracionCargada.getDificultad()){
            case 1 -> this.vistaConfig.btnFacil.setSelected(true);
            case 2 -> this.vistaConfig.btnIntermedio.setSelected(true);
            case 3 -> this.vistaConfig.btnDificil.setSelected(true);
            default -> {}
        }
        
        //multinivel
        if(configuracionCargada.getMultinivel()){
           this.vistaConfig.btnSiMultinivel.setSelected(true);
        }
        else
            this.vistaConfig.btnNoMultinivel.setSelected(true);
        
        //Uso del reloj
        switch (configuracionCargada.getReloj()){
            case 1 -> this.vistaConfig.btnCronometro.setSelected(true);
            case 2 -> this.vistaConfig.btnTemporizador.setSelected(true);
            case 3 -> this.vistaConfig.btnNoReloj.setSelected(true);
            default -> {}
        }
        
        //Verifica si cuando se inicia el menuConfig, el temporizador está seleccionado o no
        if (this.vistaConfig.btnTemporizador.isSelected()){
            this.vistaConfig.lblHoras.setVisible(true);
            this.vistaConfig.spinnerHoras.setVisible(true);
            this.vistaConfig.lblMins.setVisible(true);
            this.vistaConfig.spinnerMins.setVisible(true);
            this.vistaConfig.lblSegs.setVisible(true);
            this.vistaConfig.spinnerSegs.setVisible(true);
            
            //valores actuales del temporizador
            this.vistaConfig.spinnerHoras.setValue(configuracionCargada.getHoras());
            this.vistaConfig.spinnerMins.setValue(configuracionCargada.getMinutos());
            this.vistaConfig.spinnerSegs.setValue(configuracionCargada.getSegundos());
        }
        else{
            this.vistaConfig.lblHoras.setVisible(false);
            this.vistaConfig.spinnerHoras.setVisible(false);
            this.vistaConfig.lblMins.setVisible(false);
            this.vistaConfig.spinnerMins.setVisible(false);
            this.vistaConfig.lblSegs.setVisible(false);
            this.vistaConfig.spinnerSegs.setVisible(false);
        }
        
        //posicion de la ventana
        switch (configuracionCargada.getPosicionVentana()){
            case 1 -> this.vistaConfig.btnDerecha.setSelected(true);
            case 2 -> this.vistaConfig.btnIzquierda.setSelected(true);
        }
        
        //nombre del jugador
        this.vistaConfig.txtNombre.setText(configuracionCargada.getNombreJugador());
        //pin
        this.vistaConfig.txtPIN.setText(configuracionCargada.getPin());
        //correo
        
        
        //Asignamos el minimo y maximo de los spinners del temporizador
        SpinnerModel valorHoras = new SpinnerNumberModel((int)vistaConfig.spinnerHoras.getValue(), 0, 5, 1);
        SpinnerModel valorMins = new SpinnerNumberModel((int)vistaConfig.spinnerMins.getValue(), 0, 59, 1);
        SpinnerModel valorSegs= new SpinnerNumberModel((int)vistaConfig.spinnerSegs.getValue(), 0, 59, 1);
        this.vistaConfig.spinnerHoras.setModel(valorHoras);
        this.vistaConfig.spinnerMins.setModel(valorMins);
        this.vistaConfig.spinnerSegs.setModel(valorSegs);
    }
    
    /**
     * Esta funcion permite guardar toda la configuracion en el archivo
     * @param vistaConfig Interfaz gráfica de la configuracion
     * @param vistaPrincipal Interfaz gráfica del menú principal
     * @param configuracionCargada La configuración actual del juego
     */
    public void guardarDatos(MenuConfiguracion vistaConfig, MenuPrincipal vistaPrincipal, Configuracion configuracionCargada){
        //guardar las opciones y datos ingresados en configuracionCargada y en el archivo
        //Cuadricula
        if (vistaConfig.btn3x3.isSelected())
            configuracionCargada.setTamañoCuadricula(3);
        else if (vistaConfig.btn4x4.isSelected())
            configuracionCargada.setTamañoCuadricula(4);
        else if (vistaConfig.btn5x5.isSelected())
            configuracionCargada.setTamañoCuadricula(5);
        else if (vistaConfig.btn6x6.isSelected())
            configuracionCargada.setTamañoCuadricula(6);
        else if (vistaConfig.btn7x7.isSelected())
            configuracionCargada.setTamañoCuadricula(7);
        else if (vistaConfig.btn8x8.isSelected())
            configuracionCargada.setTamañoCuadricula(8);
        else if (vistaConfig.btn9x9.isSelected())
            configuracionCargada.setTamañoCuadricula(9);
        else if (vistaConfig.btn10x10.isSelected())
            configuracionCargada.setTamañoCuadricula(10);

        //nivel de dificultad
        if (vistaConfig.btnFacil.isSelected())
            configuracionCargada.setDificultad(1);
        else if (vistaConfig.btnIntermedio.isSelected())
            configuracionCargada.setDificultad(2);
        else if (vistaConfig.btnDificil.isSelected())
            configuracionCargada.setDificultad(3);

        //multinivel
        if (vistaConfig.btnSiMultinivel.isSelected())
            configuracionCargada.setMultinivel(true);
        else if (vistaConfig.btnNoMultinivel.isSelected())
            configuracionCargada.setMultinivel(false);

        //reloj
        if (vistaConfig.btnCronometro.isSelected())
            configuracionCargada.setReloj(1);
        else if (vistaConfig.btnTemporizador.isSelected()){
            configuracionCargada.setReloj(2);
            configuracionCargada.setHoras((int)vistaConfig.spinnerHoras.getValue()); //se le hace un cast int al spinner ya que retorna un tipo object
            configuracionCargada.setMinutos((int)vistaConfig.spinnerMins.getValue());
            configuracionCargada.setSegundos((int)vistaConfig.spinnerSegs.getValue());
        }
        else if (vistaConfig.btnNoReloj.isSelected())
            configuracionCargada.setReloj(3);

        //posicion de la ventana
        if (vistaConfig.btnDerecha.isSelected())
            configuracionCargada.setPosicionVentana(1);
        else if (vistaConfig.btnIzquierda.isSelected())
            configuracionCargada.setPosicionVentana(2);

        //nombre del jugador
        configuracionCargada.setNombreJugador(vistaConfig.txtNombre.getText());
        //pin
        configuracionCargada.setPin(new String(vistaConfig.txtPIN.getPassword()) );
        //correo

        //GUARDAR CONFIGURACION EN EL ARCHIVO
        try {
            Configuracion.guardarConfiguracion("futoshiki2024configuracion.txt", configuracionCargada);
            JOptionPane.showMessageDialog(null, "Bienvenido " + configuracionCargada.getNombreJugador() + ". Su configuracion fue guardada.");
        }
        catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Hubo un error guardando la configuración en el juego!" + ex.getMessage());
            ex.printStackTrace(); // Imprime la traza de la excepción en la consola);
        }

        vistaConfig.setVisible(false);
        vistaPrincipal.setVisible(true); 
    }
    
    /*
    public boolean verificarCorreo(MenuConfiguracion vistaConfig, Configuracion configuracionCargada){
        Set<String> nombres =  configuracionCargada.getJugadoresRegistrados().keySet();
        for (String cadaNombre : nombres){
            ArrayList datos = (ArrayList) configuracionCargada.getJugadoresRegistrados().get(cadaNombre);
            System.out.println(datos.get(1));
            if (datos.get(1).equals(vistaConfig.txtCorreo.getText())){
                JOptionPane.showMessageDialog(null, "El correo ingresado ya esta siendo usado!");
                return false;
            }
        }
        return true;
    }
    */
    
    /**
     * Muestra en el menu la configuracion actual del juego, además de controlar los eventos listeners
     * @param vistaPrincipal representa la vista del menu de inicio para mostrarlo u ocultarlo
     * @param vistaConfig representa la vista del menu de configuracion que el controlador va a manipular
     * @param configuracionCargada es la configuracion con la que cargó el juego al iniciar
     */
    public ControladorConfiguracion(MenuPrincipal vistaPrincipal, MenuConfiguracion vistaConfig, Configuracion configuracionCargada){
        this.vistaPrincipal = vistaPrincipal;
        this.vistaConfig = vistaConfig;
        
        refrescarConfiguracion(vistaConfig, configuracionCargada);
        
        //eventos listeners
        
        //muestra las horas, minutos y segundos si está la opcion temporizador seleccionada
        this.vistaConfig.btnTemporizador.addItemListener(
          new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED){
                        vistaConfig.lblHoras.setVisible(true);
                        vistaConfig.spinnerHoras.setVisible(true);
                        vistaConfig.lblMins.setVisible(true);
                        vistaConfig.spinnerMins.setVisible(true);
                        vistaConfig.lblSegs.setVisible(true);
                        vistaConfig.spinnerSegs.setVisible(true);
                    }
                    else{
                        vistaConfig.lblHoras.setVisible(false);
                        vistaConfig.spinnerHoras.setVisible(false);
                        vistaConfig.lblMins.setVisible(false);
                        vistaConfig.spinnerMins.setVisible(false);
                        vistaConfig.lblSegs.setVisible(false);
                        vistaConfig.spinnerSegs.setVisible(false);
                    }
                }
            }
        );
        
        //envia el pin al correo
        this.vistaConfig.btnOlvidePin.addItemListener(
          new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    //verificar existencia de correo:
                    
                    //enviar correo a: vistaConfig.txtCorreo()
                }
          }
        );
        
        //no permite escribir mas de 30 caracteres en el nombre del jugador
        this.vistaConfig.txtNombre.addKeyListener(
            new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) { 
                    if (vistaConfig.txtNombre.getText().length() >= 30 ) // se limita a la escritura de 30 caracteres
                        e.consume(); 
                }  
            }
        );
        
        
        //no permite escribir mas de 4 caracteres en el PIN y que no sean enteros
        this.vistaConfig.txtPIN.addKeyListener(
            new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) { 
                    if (vistaConfig.txtPIN.getText().length() >= 4 || !Character.isDigit(e.getKeyChar()) ) // se limita a la escritura de 4 caracteres y deben de ser numeros
                        e.consume(); 
                }  
            }
        );
        
        //no permite escribir mas de 30 caracteres en el nombre del jugador EN REGISTRARSE
        this.vistaConfig.txtNombreRegistrarse.addKeyListener(
            new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) { 
                    if (vistaConfig.txtNombreRegistrarse.getText().length() >= 30 ) // se limita a la escritura de 30 caracteres
                        e.consume(); 
                }  
            }
        );
        
        
        //no permite escribir mas de 4 caracteres en el PIN EN REGISTRARSE y que no sean enteros
        this.vistaConfig.txtPinRegistrarse.addKeyListener(
            new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) { 
                    if (vistaConfig.txtPinRegistrarse.getText().length() >= 4 || !Character.isDigit(e.getKeyChar()) ) // se limita a la escritura de 4 caracteres y deben de ser numeros
                        e.consume(); 
                }  
            }
        );
        
        //Anade el evento del boton cancelar
        this.vistaConfig.btnCancelar.addActionListener(
            new ActionListener(){ 
                @Override
                public void actionPerformed(ActionEvent e){
                    refrescarConfiguracion(vistaConfig, configuracionCargada);
                    vistaConfig.setVisible(false);
                    vistaPrincipal.setVisible(true); 
                }
            }
        );
        
        //Anade el evento del boton guardar cambios
        this.vistaConfig.btnGuardar.addActionListener(
            new ActionListener(){ 
                @Override
                public void actionPerformed(ActionEvent e){
                    //verificar que el pin ingresado sea correcto
                    if (vistaConfig.txtPIN.getText().length() < 4){
                        JOptionPane.showMessageDialog(null, "El pin ingresado debe de contener 4 carácteres!");
                        return;
                    }
                    
                    //verificar que el nombre y pin ingresados existan, de no ser así: notificar que se creará un registro del jugador con esos datos
                    if (!configuracionCargada.getJugadoresRegistrados().containsKey(vistaConfig.txtNombre.getText())){ //verificar si el nombre no está registrado
                        JOptionPane.showMessageDialog(null, "Este nombre no se encuentra registrado!");
                    }
                    else{ //el nombre está registrado      
                        ArrayList datos = (ArrayList) configuracionCargada.getJugadoresRegistrados().get(vistaConfig.txtNombre.getText()); //datos del jugador
                        if (!datos.get(0).equals(new String(vistaConfig.txtPIN.getPassword()))) //el pin ingresado no es el correcto
                            JOptionPane.showMessageDialog(null, "El PIN ingresado no es correcto!");
                        else
                            guardarDatos(vistaConfig, vistaPrincipal, configuracionCargada);
                    }
                }
            }
        );
        
        //añade el boton de registrarse
        this.vistaConfig.btnRegistrarse.addActionListener(
            new ActionListener(){ 
                @Override
                public void actionPerformed(ActionEvent e){
                    vistaConfig.panelConfiguracion.setVisible(false);
                    vistaConfig.panelRegistrarse.setVisible(true);
                }
            }
        );
        
                
        //PANEL DEL REGISTRO
        //al darle cancelar se devuelve al menu de configuracion
        this.vistaConfig.btnCancelarRegistrarse.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    vistaConfig.panelConfiguracion.setVisible(true);
                    vistaConfig.panelRegistrarse.setVisible(false);
                } 
            }
        );
        
        //al darle registrar hace la logica para registrar un usuario
        this.vistaConfig.btnRegistrarseRegistrarse.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    //el nombre no puede estar vacio
                    if (vistaConfig.txtNombreRegistrarse.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio!");
                        return;
                    }
                    //verificar que el pin ingresado sea correcto
                    if (vistaConfig.txtPinRegistrarse.getText().length() < 4){
                        JOptionPane.showMessageDialog(null, "El pin ingresado debe de contener 4 carácteres!");
                        return;
                    }
                    //verificar que el correo no sea vacio
                    if (vistaConfig.txtCorreoRegistrarse.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "El correo no puede estar vacio!");
                        return;
                    }
                    
                    //verificar que el nombre no exista
                    Map<String, ArrayList<String>> datos = configuracionCargada.getJugadoresRegistrados();
                    if (datos.containsKey(vistaConfig.txtNombreRegistrarse.getText())){ //verificar si el nombre  está registrado
                        JOptionPane.showMessageDialog(null, "Este nombre ya se encuentra registrado!");
                        return;
                    }
                    //verificar que el correo no exista
                    for( String nombre : datos.keySet() ){ //revisa cada jugador
                        if (datos.get(nombre).get(1).equals(vistaConfig.txtCorreoRegistrarse.getText())){ //Si el jugador tiene el mismo correo
                            JOptionPane.showMessageDialog(null, "Este correo ya está en uso!");
                            return;
                        }
                    }
                    
                    //registrar al jugador
                    ArrayList<String> pinCorreo = new ArrayList<>();
                    pinCorreo.add(new String(vistaConfig.txtPinRegistrarse.getPassword()));
                    pinCorreo.add(vistaConfig.txtCorreoRegistrarse.getText());
                    configuracionCargada.getJugadoresRegistrados().put(vistaConfig.txtNombreRegistrarse.getText(), pinCorreo);
                    //guardar datos
                    try {
                        Configuracion.guardarConfiguracion("futoshiki2024configuracion.txt", configuracionCargada);
                        JOptionPane.showMessageDialog(null, vistaConfig.txtNombreRegistrarse.getText() + ", te haz registrado correctamente!");
                        vistaConfig.txtNombreRegistrarse.setText("");
                        vistaConfig.txtPinRegistrarse.setText("");
                        vistaConfig.txtCorreoRegistrarse.setText("");
                        vistaConfig.panelConfiguracion.setVisible(true);
                        vistaConfig.panelRegistrarse.setVisible(false);
                    }
                    catch (IOException ex){
                        JOptionPane.showMessageDialog(null, "Hubo un error guardando la configuración en el juego!" + ex.getMessage());
                        ex.printStackTrace(); // Imprime la traza de la excepción en la consola);
                    }
                } 
            }
        );
    }
}
