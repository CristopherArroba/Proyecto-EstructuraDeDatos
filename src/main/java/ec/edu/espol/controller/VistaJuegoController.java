/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import ec.edu.espol.model.Juego;
import ec.edu.espol.proyectoestructuradedatos.App;
import ec.edu.espol.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author User
 */
public class VistaJuegoController implements Initializable {

    private Text tit;
    @FXML
    private HBox himage;
    @FXML
    private Button bregresar;
    @FXML
    private Text tit1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void cargarImagen(Juego j){
        tit1.setText(j.getTitulo());
//        ArrayList<String> num = new ArrayList<>();
//        num.addLast("1");
//        num.addLast("2");
//        for(int i = 0; i<2; i++){
//            Image img = new Image("img/"+j.getTitulo()+"/"+j.getTitulo()+"-cap"+i+".jpg");
//            ImageView imv = new ImageView(img);
//            imv.setFitWidth(200);
//            imv.setFitHeight(200);
//            himage.getChildren().add(imv);
//        }
        Image img1 = new Image("img/"+j.getTitulo()+"/"+j.getTitulo()+"-cap"+"1"+".jpg");
        ImageView imv1 = new ImageView(img1);
        imv1.setFitWidth(200);
        imv1.setFitHeight(200);
        himage.getChildren().add(imv1);
        
        Image img2 = new Image("img/"+j.getTitulo()+"/"+j.getTitulo()+"-cap"+"2"+".jpg");
        ImageView imv2 = new ImageView(img2);
        imv2.setFitWidth(200);
        imv2.setFitHeight(200);
        himage.getChildren().add(imv2);
        
    }

    @FXML
    private void regresar(MouseEvent event) {
        try {
                FXMLLoader fxmlloader = App.loadFXMLLoader("VistaPrincipal");
                App.setRoot(fxmlloader);
            } catch (IOException ex) {
                Alert a = new Alert(Alert.AlertType.ERROR,"No se pudo abrir el archivo del siguiente grafo de scene");
                a.show();
            }
    }
    
}
