/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import ec.edu.espol.util.ArrayList;



/**
 *
 * @author dannymateo
 */
public class Compania {
    
    private String nombre;
    private ArrayList<Juego> juegos;
    private ArrayList<Resena> resenas;

    public Compania(String nombre, ArrayList juegos, ArrayList resenas) {
        this.nombre = nombre;
        this.juegos = juegos;
        this.resenas = resenas;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList juegos) {
        this.juegos = juegos;
    }

    public ArrayList getReseñas() {
        return resenas;
    }

    public void setReseñas(ArrayList reseñas) {
        this.resenas = reseñas;
    }
    
    
    
}
