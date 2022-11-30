/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.util;

import ec.edu.espol.proyectoestructuradedatos.App;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class Archivos {
    public static ArrayList<String> leerGenero(){
        ArrayList<String> lista=new ArrayList<>();
        try(BufferedReader bf=new BufferedReader(new FileReader(App.pathFile+"generosTotales.txt"))){
            String linea;
            while((linea=bf.readLine())!=null){
                String[] datos=linea.split(",");
                for(String d: datos){
                   lista.addLast(d);
                }             
            }            
        } catch (FileNotFoundException ex) {
            System.out.println("Clase no encontrada");
        } catch (IOException ex) {
            System.out.println("No se pudo leer el archivo");
        }
        return lista;
    }
}
