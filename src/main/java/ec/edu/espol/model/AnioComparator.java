/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import java.util.Comparator;

/**
 *
 * @author dannymateo
 */
public class AnioComparator implements Comparator<Juego> {

    @Override
    public int compare(Juego o1, Juego o2) {
        return o1.getAnio().compareTo(o2.getAnio());
    }
    
    

}