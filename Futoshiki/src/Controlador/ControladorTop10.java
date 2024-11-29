/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.MenuTop10;
import Modelo.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.SpinnerListModel;

public class ControladorTop10 {
    private MenuTop10 vistaTop;
    
    /**
     * Esta funcion permite refrescar los valores de la tabla del top 10
     * @param top10Cargado 
     */
    public void refrescarTop(ArrayList<ArrayList<Top10>> top10Cargado){
        switch(vistaTop.ComboDificultad.getSelectedIndex()){
            case 0 -> { //facil
                switch(vistaTop.comboTamano.getSelectedIndex()){
                    case 0 -> {
                        //3x3
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(0).getJugador10().getTiempo(), 9, 1);
                    }
                    case 1 -> {
                        //4x4
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(1).getJugador10().getTiempo(), 9, 1);
                    }
                    case 2 -> {
                        //5x5
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(2).getJugador10().getTiempo(), 9, 1);
                    }
                    case 3 -> {
                        // 6x6
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(3).getJugador10().getTiempo(), 9, 1);
                    }
                    case 4 -> {
                        // 7x7
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(4).getJugador10().getTiempo(), 9, 1);
                    }
                    case 5 -> {
                        // 8x8
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(5).getJugador10().getTiempo(), 9, 1);
                    }
                    case 6 -> {
                        // 9x9
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(6).getJugador10().getTiempo(), 9, 1);
                    }
                    case 7 -> {
                        // 10x10
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(0).get(7).getJugador10().getTiempo(), 9, 1);
                    }
                    default ->{}
                }
            }

            case 1 -> { //medio
                switch(vistaTop.comboTamano.getSelectedIndex()){
                    case 0 -> {
                        //3x3
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(0).getJugador10().getTiempo(), 9, 1);
                    }
                    case 1 -> {
                        //4x4
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(1).getJugador10().getTiempo(), 9, 1);
                    }
                    case 2 -> {
                        //5x5
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(2).getJugador10().getTiempo(), 9, 1);
                    }
                    case 3 -> {
                        // 6x6
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(3).getJugador10().getTiempo(), 9, 1);
                    }
                    case 4 -> {
                        // 7x7
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(4).getJugador10().getTiempo(), 9, 1);
                    }
                    case 5 -> {
                        // 8x8
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(5).getJugador10().getTiempo(), 9, 1);
                    }
                    case 6 -> {
                        // 9x9
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(6).getJugador10().getTiempo(), 9, 1);
                    }
                    case 7 -> {
                        // 10x10
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(1).get(7).getJugador10().getTiempo(), 9, 1);
                    }
                    default ->{}
                }
            }
            case 2 -> { //dificil
                switch(vistaTop.comboTamano.getSelectedIndex()){
                    case 0 -> {
                        //3x3
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(0).getJugador10().getTiempo(), 9, 1);
                    }
                    case 1 -> {
                        //4x4
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(1).getJugador10().getTiempo(), 9, 1);
                    }
                    case 2 -> {
                        //5x5
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(2).getJugador10().getTiempo(), 9, 1);
                    }
                    case 3 -> {
                        // 6x6
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(3).getJugador10().getTiempo(), 9, 1);
                    }
                    case 4 -> {
                        // 7x7
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(4).getJugador10().getTiempo(), 9, 1);
                    }
                    case 5 -> {
                        // 8x8
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(5).getJugador10().getTiempo(), 9, 1);
                    }
                    case 6 -> {
                        // 9x9
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(6).getJugador10().getTiempo(), 9, 1);
                    }
                    case 7 -> {
                        // 10x10
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador1().getNombre(), 0, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador1().getTiempo(), 0, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador2().getNombre(), 1, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador2().getTiempo(), 1, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador3().getNombre(), 2, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador3().getTiempo(), 2, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador4().getNombre(), 3, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador4().getTiempo(), 3, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador5().getNombre(), 4, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador5().getTiempo(), 4, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador6().getNombre(), 5, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador6().getTiempo(), 5, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador7().getNombre(), 6, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador7().getTiempo(), 6, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador8().getNombre(), 7, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador8().getTiempo(), 7, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador9().getNombre(), 8, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador9().getTiempo(), 8, 1);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador10().getNombre(), 9, 0);
                        vistaTop.tablaTops.setValueAt(top10Cargado.get(2).get(7).getJugador10().getTiempo(), 9, 1);
                    }
                }
            }
        }
    }

    /**
     * Método constructor del controlador del Top 10, controla la logica del top 10
     * @param vistaPrincipal
     * @param vistaTop
     * @param top10Cargado 
     */
    public ControladorTop10(MenuPrincipal vistaPrincipal, MenuTop10 vistaTop, ArrayList<ArrayList<Top10>> top10Cargado){
        this.vistaTop = vistaTop;
        
        //cargar top
        refrescarTop(top10Cargado);
        
        this.vistaTop.btnSalir.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    vistaTop.ComboDificultad.setSelectedIndex(0);
                    vistaTop.comboTamano.setSelectedIndex(0);
                    vistaTop.setVisible(false);
                    vistaPrincipal.setVisible(true);
                }
            }
        );
        
         // Agregar ActionListener a los JComboBox
        this.vistaTop.ComboDificultad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refrescarTop(top10Cargado);
            }
        });

        this.vistaTop.comboTamano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refrescarTop(top10Cargado);
            }
        });
    }
}
