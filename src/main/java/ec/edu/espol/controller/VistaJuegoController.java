/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import ec.edu.espol.model.Juego;
import ec.edu.espol.model.Resena;
import ec.edu.espol.proyectoestructuradedatos.App;
import ec.edu.espol.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
    @FXML

    private VBox idVboxResena;
    @FXML
    private ComboBox comboBoxOrdenar;

    @FXML
    private VBox vboxprin;


    private  ArrayList<Resena> ListaRese;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       this.ListaRese=Resena.leerResena();
       
       
       comboBoxOrdenar.getItems().add("Mejor Calificación");
       comboBoxOrdenar.getItems().add("Peor Calificación");
       
        //System.out.println(tit.getText());
       
       ArrayList<Resena> lista=Juego.ResenaxJuego(tit1.getText(), ListaRese);
       
       
       for(Resena r: lista){
           VBox vbox=new VBox(); 
           Text t=new Text();
           t.setText(r.getCompania());
           
            HBox hbox=new HBox();
            int numEstrell=r.getValoracion();
            for(int j = 0; j <=numEstrell; j++) {
                Image i = new Image("img/estrella.jpg");
                ImageView imv = new ImageView(i);
                imv.setFitWidth(20);
                imv.setFitHeight(20);
                hbox.getChildren().add(imv); 
            }
            vbox.getChildren().add(t);
            vbox.getChildren().add(hbox);
            Text t2=new Text();
            t2.setText(r.getComentario());
            vbox.getChildren().add(t2);
            idVboxResena.getChildren().add(vbox);
       }
       
       
       /*
      if(comboBoxOrdenar.getValue().equals("Mejor Calificacion")){
          
      }*/
      
        
        
        
        
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
