/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;


import ec.edu.espol.proyectoestructuradedatos.App;
//import ec.edu.espol.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import ec.edu.espol.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author User
 */
public class Usuario implements Serializable{
    private String nickname;
    private String correo;
    private String contraseña;
    private Boolean esCritico;
    private Boolean esAdministrador;
    private ArrayList<Juego> juegos;
    private ArrayList<String> generos;
    //private static final long serialVersionUID = 8799656478674716638L;

    public Usuario(String nickname, String correo, String contraseña, Boolean esCritico, Boolean esAdministrador, ArrayList<String> generos) {
        this.nickname = nickname;
        this.correo = correo;
        this.contraseña = contraseña;
        this.esCritico = esCritico;
        this.esAdministrador = esAdministrador;
        this.juegos = new ArrayList<>();
        this.generos = generos;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

//    public void setContraseña(String contraseña) {
//        this.contraseña = contraseña;
//    }

    public Boolean getEsCritico() {
        return esCritico;
    }

//    public void setEsCritico(Boolean esCritico) {
//        this.esCritico = esCritico;
//    }

    public Boolean getEsAdministrador() {
        return esAdministrador;
    }

//    public void setEsAdministrador(Boolean esAdministrador) {
//        this.esAdministrador = esAdministrador;
//    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nickname=" + nickname + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", esCritico=" + esCritico + ", esAdministrador=" + esAdministrador + ", generos=" + generos + '}';
    }

    
    
    public static void guardarUsuarios(ArrayList<Usuario> usuarios, String nomfile){
        try(FileOutputStream file = new FileOutputStream(nomfile);

                ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(usuarios);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    
    public static void escribirUsuario(Usuario u)  {
        try(BufferedWriter bf=new BufferedWriter(new FileWriter(App.pathFile+"usuarios.txt",true))){
                bf.write(u.getNickname()+","+u.getCorreo()+","+u.getContraseña()+","+u.getEsCritico()+","+u.getEsAdministrador()+","+u.getGeneros());
                bf.newLine();
                bf.close();
        } catch (IOException ex) {
            System.out.println("No se pudo escribir en el archivo usuario");;
        }
    }
    
    

    public static ArrayList<Usuario> leerUsuarios(String nomfile){
        try(FileInputStream file = new FileInputStream(nomfile);
                ObjectInputStream in = new ObjectInputStream(file)){
            ArrayList<Usuario> usuarios =  (ArrayList<Usuario>)in.readObject();
            return usuarios;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }

    
    
    
    
    
}

