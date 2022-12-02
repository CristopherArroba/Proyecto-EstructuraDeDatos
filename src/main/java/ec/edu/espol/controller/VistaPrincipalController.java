/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import ec.edu.espol.model.Juego;
import ec.edu.espol.util.CircularDoubleLinkedList;
import java.net.URL;
import java.util.ListIterator;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class VistaPrincipalController implements Initializable {

    @FXML
    private AnchorPane idAnchor;
    @FXML
    private ComboBox<?> idComboBox;
    @FXML
    private TextField TxtBusqueda;
    @FXML
    private Button anterior;
    @FXML
    private Button siguiente;
    @FXML
    private ImageView imv;
    
    private CircularDoubleLinkedList<Juego> juegos = Juego.leerJuegos("juegos.ser");
    private ListIterator<Juego> lit = juegos.listIterator();
    Juego j = lit.next();
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image i = new Image("img/"+j.getTitulo()+"/"+j.getTitulo()+"-cap1.jpg");
        imv.setImage(i);
    }    

    @FXML
    private void retroceder(MouseEvent event) {
        j = lit.previous();
        Image i = new Image("img/"+j.getTitulo()+"/"+j.getTitulo()+"-cap1.jpg");
        imv.setImage(i);
    }

    @FXML
    private void avanzar(MouseEvent event) {
        j = lit.next();
        Image i = new Image("img/"+j.getTitulo()+"/"+j.getTitulo()+"-cap1.jpg");
        imv.setImage(i);
    }

    @FXML
    private void infoJuego(MouseEvent event) {
    }
    
}
