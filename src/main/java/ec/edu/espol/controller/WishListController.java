/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import ec.edu.espol.model.Juego;
import ec.edu.espol.model.Usuario;
import ec.edu.espol.util.ArrayList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * FXML Controller class
 *
 * @author User
 */
public class WishListController implements Initializable {

    @FXML
    private VBox vboximg;
    @FXML
    private Text tit;
    @FXML
    private Text desc;
    
    private Usuario u;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Juego> juegos = u.getJuegos();
        for(int j = 1; j<=juegos.size(); j++){
            Juego ju = juegos.get(j);
            Image i = new Image("img/"+ju.getTitulo()+"/"+ju.getTitulo()+"-cap1.jpg");
            ImageView imv = new ImageView(i);
            imv.setFitWidth(400);
            imv.setFitHeight(200);
            imv.setOnMouseClicked((MouseEvent event)->{
                tit.setText(ju.getTitulo());
                desc.setText(ju.getDescripcion());
                
                
                desc.setWrappingWidth(200);
                desc.setTextAlignment(TextAlignment.JUSTIFY);
                
            
            });
            vboximg.getChildren().add(imv);
        }    
    
    }
}
