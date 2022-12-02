/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import ec.edu.espol.model.Juego;
import java.util.Comparator;

/**
 *
 * @author dannymateo
 */
public class PrecioComparator implements Comparator<Juego> {

    @Override
    public int compare(Juego o1, Juego o2) {
        return Double.toString(o1.getPrecio()).compareTo(Double.toString(o2.getPrecio()));
    }
    
}
