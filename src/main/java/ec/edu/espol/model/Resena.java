/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import ec.edu.espol.model.Compania;
import ec.edu.espol.model.Juego;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import ec.edu.espol.util.ArrayList;
import ec.edu.espol.proyectoestructuradedatos.App;
import java.io.Serializable;
import javafx.scene.control.Alert;


/**
 *
 * @author dannymateo
 */
public class Resena implements Serializable{
    
    private String compania;
    private String juego;
    private int valoracion;
    private String comentario;
    //private static final long serialVersionUID = 8799656478674716638L;


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

    @Override
    public String toString() {
        return compania + "|" + juego + "|"+ valoracion + "|" + comentario ;
    }

    public static ArrayList<Resena> leerResena(){
        ArrayList<Resena> ListRese=new ArrayList<>();
        try(BufferedReader bf=new BufferedReader(new FileReader(App.pathFile+"Resena.txt"))){
            String linea;
            while((linea=bf.readLine())!=null){
                String[] dato=linea.split("\\|");
                Resena r=new Resena(dato[0],dato[1],Integer.parseInt(dato[2]),dato[3]);
                ListRese.addLast(r);
                        
                                
            }            
        }catch (IOException ex) {
            Alert a = new Alert(Alert.AlertType.ERROR, "No es posible obtener los usuarios");
            a.show();
        }
        return ListRese;
    }
    
    
}
