/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import java.util.Comparator;

/**
 *
 * @author USER
 */
public class ValoracionComparator implements Comparator<Resena>{

    @Override
    public int compare(Resena o1, Resena o2) {
        return o1.getValoracion()-o2.getValoracion();
    }

    
}
