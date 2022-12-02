/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;


import ec.edu.espol.proyectoestructuradedatos.App;
import ec.edu.espol.util.ArrayList;
import ec.edu.espol.util.CircularDoubleLinkedList;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javafx.scene.image.ImageView;

/**
 *
 * @author dannymateo
 */
public class Juego implements Serializable{

    private String titulo;
    private String anio;
    private String descripcion;
    private double precio;
    private ArrayList<Resena> resena;
    private String genero;
    private String compania;
    //private static final long serialVersionUID = 8799656478674716638L;


    
    //private static final long serialVersionUID = 8799656478674716638L;



    public Juego(String titulo, String anio, String descripcion, double precio, ArrayList<Resena> resena, String genero, String compania) {
        this.titulo = titulo;
        this.anio = anio;
        this.descripcion = descripcion;
        this.precio = precio;
        this.resena = new ArrayList<>();
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Resena> getResena() {
        return resena;
    }

    public void setResena(ArrayList<Resena> resena) {
        this.resena = resena;
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
        return "Juego{" + "titulo=" + titulo + ", anio=" + anio + ", descripcion=" + descripcion + ", precio=" + precio + ", resena=" + resena + ", genero=" + genero + '}';
    }

    
    public static CircularDoubleLinkedList<Juego> leerJuegos(String nomfile){
        try(FileInputStream file = new FileInputStream(nomfile);
                ObjectInputStream in = new ObjectInputStream(file)){
            CircularDoubleLinkedList<Juego> juegosA =  (CircularDoubleLinkedList<Juego>)in.readObject();
            return juegosA;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return new CircularDoubleLinkedList<>();
    }
    
    public static void guardarJuegos(CircularDoubleLinkedList<Juego> juegos, String nomfile){
        try(FileOutputStream file = new FileOutputStream(nomfile);

                ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(juegos);
            out.flush();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void escribirJuego(Juego j)  {
        try(BufferedWriter bf=new BufferedWriter(new FileWriter(App.pathFile+"Juego.txt",true))){
                bf.write(j.toString());
                bf.newLine();
                bf.close();
            
        } catch (IOException ex) {
            System.out.println("No se pudo guardar en el archivo");
        }
    }
    
    public static ArrayList<String> NombreJuego(ArrayList<Resena> lista){
        ArrayList<String> listJuego=new ArrayList<>();
        for(Resena r:lista){
            listJuego.addLast(r.getJuego());
        }
        return listJuego;
               
    }
    
    
    public static ArrayList<Resena> ResenaxJuego(String nameJuego, ArrayList<Resena> ListaRese){
        ArrayList<Resena> resulList=new ArrayList<>();
        System.out.println(ListaRese);
        for(Resena r: ListaRese){
            if(r.getJuego().equals(nameJuego)){
                resulList.addLast(r);
            }
        }
        return resulList;
    }
    

    
    
    
    
}
