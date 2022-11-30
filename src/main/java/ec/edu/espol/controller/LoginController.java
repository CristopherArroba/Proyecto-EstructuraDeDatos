/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import ec.edu.espol.model.Usuario;
import ec.edu.espol.util.Archivos;
import ec.edu.espol.util.ArrayList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import ec.edu.espol.proyectoestructuradedatos.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class LoginController implements Initializable {

    private ArrayList<Usuario> lista;
    
    
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtContraReg;

    /**
     * Initializes the controller class.
     */
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lista=Usuario.leerUsuarios(App.pathFile+"usuario.txt");
        
        
        
    }    
    

    @FXML
    private void IniciarSesion(ActionEvent event) {
        String usuario=txtCorreo.getText();
        String pass=txtContraReg.getText();
        try{
        for(Usuario u:lista){
            if(u.getNickname().equals(usuario) && u.getContraseña().equals(pass)){
                boolean tipoUsuario=u.getEsCritico();
                boolean tipoAdmi=u.getEsAdministrador();
                if(tipoUsuario==false){
                    FXMLLoader fxmlloader=App.loadFXMLLoader("VistaUsuarioNormal");
                    App.setRoot(fxmlloader);
                }else{
                    FXMLLoader fxmlloader=App.loadFXMLLoader("VistaUsuarioCritico");
                    App.setRoot(fxmlloader);
                    
                }if(tipoAdmi==true){
                    FXMLLoader fxmlloader=App.loadFXMLLoader("VistaAdmi");
                    App.setRoot(fxmlloader);
                }
            }
        }
        }catch(IOException e){
            System.out.println("No se encontro el root");
        }
    
    }
    
}
