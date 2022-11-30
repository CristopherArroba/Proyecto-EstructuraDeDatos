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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
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
    
    private CircularDoubleLinkedList<Juego> juegos = Juego.leerJuegos("juegos.ser");
    private ListIterator<Juego> lit = juegos.listIterator();
    //private Node<Juego> nodo = juegos.getNode(0);
    Juego j = lit.next();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //CircularDoubleLinkedList<Juego> juegos = Juego.leerJuegos("juegos.ser");
//        for(int k = 0; k<juegos.size(); k++){
//            Juego j = juegos.get(k);
//            Image i = new Image("img."+juegos.get(k).getTitulo()+"/"+juegos.get(k).getTitulo()+"-cap1");
//            imv.setImage(i);
        Image i = new Image("img."+j.getTitulo()+"/"+j.getTitulo()+"-cap1");
        imv.setImage(i);
            
        
        
    }    

    @FXML
    private void retroceder(MouseEvent event) {
        j = lit.previous();
        Image i = new Image("img."+j.getTitulo()+"/"+j.getTitulo()+"-cap1");
        imv.setImage(i);
    }

    @FXML
    private void avanzar(MouseEvent event) {
        j = lit.next();
        Image i = new Image("img."+j.getTitulo()+"/"+j.getTitulo()+"-cap1");
        imv.setImage(i);
    }

    @FXML
    private void infoJuego(MouseEvent event) {
    }
    
}
