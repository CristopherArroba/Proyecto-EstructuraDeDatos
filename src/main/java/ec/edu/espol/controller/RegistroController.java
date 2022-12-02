/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import ec.edu.espol.model.RegistroException;
import ec.edu.espol.model.Usuario;
import static ec.edu.espol.model.Validaciones.*;
import ec.edu.espol.proyectoestructuradedatos.App;
import ec.edu.espol.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import ec.edu.espol.util.Archivos;

import static ec.edu.espol.util.Archivos.leerGenero;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
/**
 * FXML Controller class
 *
 * @author USER
 */
public class RegistroController implements Initializable {
    private ArrayList<TextField> listaFields = new ArrayList<>();
    private ArrayList<String> genero;
    private String string = "";
    private ArrayList<CheckBox> listaCheck=new ArrayList<>();
    
    @FXML
    private TextField txtNickName;
    @FXML
    private TextField txtCorreo;
    
    @FXML
    private TextField txtContraReg;
    @FXML
    private RadioButton rbtnUsuario;
    @FXML
    private RadioButton rbtnUsuarioCritico;
    
    @FXML
    private Button idButtonRegresar;
    @FXML
    private FlowPane idFlowPane;

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.genero=Archivos.leerGenero();
      
        listaFields.addLast(txtNickName);
        listaFields.addLast(txtCorreo);
        listaFields.addLast(txtContraReg);
     
        
        
        ToggleGroup tg = new ToggleGroup();
        this.rbtnUsuario.setToggleGroup(tg);
        this.rbtnUsuarioCritico.setToggleGroup(tg);
        for(String s: genero){
            CheckBox ch=new CheckBox(s);
            idFlowPane.getChildren().add(ch);
        }
        
    }    
      
    
   
    
    public boolean camposVacios() throws RegistroException{
      
      for(TextField e : listaFields){
          if(e.getText().equals("")){
              return true;
          }
          if(rbtnUsuario.isSelected()){
              string= rbtnUsuario.getText();
          }else if(rbtnUsuarioCritico.isSelected()){
              string= rbtnUsuarioCritico.getText();
          }else{
              return true;
          }
      }return false;
  
    }
    
    public boolean EsCritico(String s){
        if(s.equals("Usuario Critico")){
            return true;
        }return false;        
    }

    
    @FXML
    private void Regresar(ActionEvent event) {
        try {
            FXMLLoader fxml=App.loadFXMLLoader("VistaPrincipal");
            App.setRoot(fxml);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

    @FXML
    private void RegistroCuenta(ActionEvent event) {
       try {
        if(camposVacios()){
            
                throw new RegistroException("Los campos no deben estar vacios");
            
            
        }else{
            Usuario u = new Usuario(
            validNameUser(txtNickName),
            validarEmail(txtCorreo),
            validPassword(txtContraReg),
            EsCritico(string),EsCritico(string),
            genero);
            Usuario.escribirUsuario(u);
            Alert a =new Alert(Alert.AlertType.CONFIRMATION,"Datos guardados exitosamente");
            a.show();
            FXMLLoader fxml=App.loadFXMLLoader("VistaPrincipal");
            App.setRoot(fxml);
            
        
        }
        } catch (RegistroException ex) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setHeaderText(null);
                alerta.setContentText(ex.getMessage());
                alerta.showAndWait();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
    
    


