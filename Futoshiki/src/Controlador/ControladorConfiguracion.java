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
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
        
        //Asignamos el minimo y maximo de los spinners del temporizador
        SpinnerModel valorHoras = new SpinnerNumberModel((int)vistaConfig.spinnerHoras.getValue(), 0, 5, 1);
        SpinnerModel valorMins = new SpinnerNumberModel((int)vistaConfig.spinnerMins.getValue(), 0, 59, 1);
        SpinnerModel valorSegs= new SpinnerNumberModel((int)vistaConfig.spinnerSegs.getValue(), 0, 59, 1);
        this.vistaConfig.spinnerHoras.setModel(valorHoras);
        this.vistaConfig.spinnerMins.setModel(valorMins);
        this.vistaConfig.spinnerSegs.setModel(valorSegs);
    }
    
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

                    //GUARDAR CONFIGURACION EN EL ARCHIVO
                    try {
                        Configuracion.guardarConfiguracion("futoshiki2024configuracion.txt", configuracionCargada);
                    }
                    catch (IOException ex){
                        JOptionPane.showMessageDialog(null, "Hubo un error guardando la configuración en el juego!" + ex.getMessage());
                        ex.printStackTrace(); // Imprime la traza de la excepción en la consola);
                    }
                    
                    vistaConfig.setVisible(false);
                    vistaPrincipal.setVisible(true); 
                }
            }
        );
    }
}
