/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import java.util.ArrayList;
import javafx.scene.image.ImageView;

/**
 *
 * @author dannymateo
 */
public class Juego {

    private String titulo;
    private String anio;
    private String descripcion;
    private double precio;
    private ArrayList reseña;
    private String generos;
    private Compañia compania;

    public Juego(String titulo, String anio, String descripcion, double precio, ArrayList reseña, String generos, Compañia compania) {
        this.titulo = titulo;
        this.anio = anio;
        this.descripcion = descripcion;
        this.precio = precio;
        this.reseña = reseña;
        this.generos = generos;
        this.compania = compania;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public Compañia getCompania() {
        return compania;
    }

    public void setCompania(Compañia compania) {
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList getReseña() {
        return reseña;
    }

    public void setReseña(ArrayList reseña) {
        this.reseña = reseña;
    }

    @Override
    public String toString() {
        return "Juego{" + "Titulo: " + titulo + ", Anio: " + anio + ", reseña=" + reseña + ", Descripcion: " + descripcion + '}';
    }

}
