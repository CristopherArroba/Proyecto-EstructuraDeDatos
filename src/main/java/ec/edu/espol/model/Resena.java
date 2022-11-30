/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import ec.edu.espol.model.Compania;
import ec.edu.espol.model.Juego;

/**
 *
 * @author dannymateo
 */
public class Resena {
    
    private String compania;
    private String juego;
    private int valoracion;
    private String comentario;

    public Resena(String autor, String juego, int valoracion, String comentario) {
        this.compania = autor;
        this.juego = juego;
        this.valoracion = valoracion;
        this.comentario = comentario;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    
    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
