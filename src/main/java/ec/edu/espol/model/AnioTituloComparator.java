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
public class AnioTituloComparator implements Comparator<Juego> {

    @Override
    public int compare(Juego o1, Juego o2) {
        if (o1.getAnio().compareTo(o2.getAnio()) == o1.getTitulo().compareTo(o2.getTitulo())) {
            return 1;
        }
        return 0;
    }

}
