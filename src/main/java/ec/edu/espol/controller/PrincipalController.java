/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PrincipalController implements Initializable {

    @FXML
    private Button anterior;
    @FXML
    private Button siguiente;
    @FXML
    private ImageView imv;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void retroceder(MouseEvent event) {
    }

    @FXML
    private void avanzar(MouseEvent event) {
    }

    @FXML
    private void infoJuego(MouseEvent event) {
    }
    
}
