/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;


import ec.edu.espol.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    private ArrayList<Resena> reseña;
    private String generos;
    private String compania;

    public Juego(String titulo, String anio, String descripcion, double precio, ArrayList reseña, String generos, String compania) {
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

    public ArrayList<Resena> getReseña() {
        return reseña;
    }

    public void setReseña(ArrayList<Resena> reseña) {
        this.reseña = reseña;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
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

    

    @Override
    public String toString() {
        return "Juego{" + "Titulo: " + titulo + ", Anio: " + anio + ", reseña=" + reseña + ", Descripcion: " + descripcion + '}';
    }
    
    public static ArrayList<Juego> leerJuegos(String nomfile){
        try(FileInputStream file = new FileInputStream(nomfile);
                ObjectInputStream in = new ObjectInputStream(file)){
            ArrayList<Juego> juegosA =  (ArrayList<Juego>)in.readObject();
            return juegosA;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }
    
    public static void guardarJuegos(ArrayList<Juego> juegos, String nomfile){
        try(FileOutputStream file = new FileOutputStream(nomfile);

                ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(juegos);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
}
