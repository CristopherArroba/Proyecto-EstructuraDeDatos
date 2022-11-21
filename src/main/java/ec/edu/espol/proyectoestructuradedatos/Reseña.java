/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.Main;

/**
 *
 * @author dannymateo
 */
public class Reseña {
    
    private Compañia autor;
    private Juego juego;
    private int valoracion;
    private String comentario;

    public Reseña(Compañia autor, Juego juego, int valoracion, String comentario) {
        this.autor = autor;
        this.juego = juego;
        this.valoracion = valoracion;
        this.comentario = comentario;
    }

    public Compañia getAutor() {
        return autor;
    }

    public void setAutor(Compañia autor) {
        this.autor = autor;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
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
