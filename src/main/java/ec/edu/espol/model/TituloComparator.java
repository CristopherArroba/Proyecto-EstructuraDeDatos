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
public class TituloComparator implements Comparator<Juego> {

    @Override
    public int compare(Juego o1, Juego o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
    
}
