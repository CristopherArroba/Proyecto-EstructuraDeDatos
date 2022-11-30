/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espol.model;

import ec.edu.espol.util.ArrayList;
import ec.edu.espol.util.List;

/**
 *
 * @author USER
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Resena> r=Resena.leerResena();
        for(Resena re: r){
            System.out.println(re);
        }
    
     //Collections.sort(juegos, AnioComparator);
    }
    
}
