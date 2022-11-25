/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import java.util.ArrayList;

/**
 *
 * @author dannymateo
 */
class Compañia {
    
    private String nombre;
    private ArrayList juegos;
    private ArrayList reseñas;

    public Compañia(String nombre, ArrayList juegos, ArrayList reseñas) {
        this.nombre = nombre;
        this.juegos = juegos;
        this.reseñas = reseñas;
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
        return reseñas;
    }

    public void setReseñas(ArrayList reseñas) {
        this.reseñas = reseñas;
    }
    
    
    
}
