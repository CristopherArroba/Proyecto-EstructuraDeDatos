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
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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

    private ArrayList<String> nombreUsado=new ArrayList<>();
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
    
    private ArrayList<Resena> listausada=new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       comboBoxOrdenar.getItems().add("Mejor Calificación");
       comboBoxOrdenar.getItems().add("Peor Calificación");
       comboBoxOrdenar.getItems().add("Ninguno");
       ListaRese=Resena.leerResena();
       
       for(Resena r: listausada){
           System.out.println(r);
       }
       
       
    }
    
    public void setTitulo(String titulo){
        this.tit1.setText(titulo);
    }
    
    
    

    public void cargarImagen(Juego j){
        //tit1.setText(j.getTitulo());
        
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
    
    public void getlistaUsada(ArrayList<Resena> resena){
        for(Resena r:resena){
            listausada.addLast(r);
        }
    }
    
    public void dibujar(ArrayList<Resena> lista){
        for(Resena r: lista){
            Label t1=new Label();
            t1.setText(r.getCompania());
            nombreUsado.addLast(r.getJuego());

            int numEstrell = r.getValoracion();
            HBox h=new HBox();
            for(int j=0; j<numEstrell; j++){
                Image i = new Image("img/estrella.jpg");
                ImageView imv = new ImageView(i);
                imv.setFitWidth(20);
                imv.setFitHeight(20);
                h.getChildren().add(imv);
            }
            Text t2 = new Text();
            t2.setText(r.getComentario());
            idVboxResena.getChildren().addAll(t1,h,t2);
        }
        listausada=lista;
        
        
        
    }

    public String  getValorCombo(){
        String item=(String) comboBoxOrdenar.getValue();
        return item;
    }
    
    
    
    @FXML
    private void CambiarResena(ActionEvent event) {
         ArrayList<Resena> listanueva=new ArrayList<>();
        for(String s: nombreUsado){
           listanueva=Juego.ResenaxJuego(s, ListaRese);
        }
        
        
        String item = (String) comboBoxOrdenar.getValue();
        idVboxResena.getChildren().clear();

        PriorityQueue<Resena> presena = new PriorityQueue<>((r1, r2) -> {
            return r2.getValoracion() - r1.getValoracion();
        });
        for (Resena r : listanueva) {
            presena.offer(r);
        }

        PriorityQueue<Resena> presena2 = new PriorityQueue<>((r1, r2) -> {
            return r1.getValoracion() - r2.getValoracion();
        });
        for (Resena r : listanueva) {
            presena2.offer(r);
        }
        if (item.equals("Mejor Calificación")) {
            while (!presena.isEmpty()) {
                Resena r = presena.poll();
                Label t1 = new Label();
                t1.setText(r.getCompania());

                int numEstrell = r.getValoracion();
                HBox h = new HBox();
                for (int j = 0; j < numEstrell; j++) {
                    Image i = new Image("img/estrella.jpg");
                    ImageView imv = new ImageView(i);
                    imv.setFitWidth(20);
                    imv.setFitHeight(20);
                    h.getChildren().add(imv);
                }
                Text t2 = new Text();
                t2.setText(r.getComentario());
                idVboxResena.getChildren().addAll(t1, h, t2);
            }
        } else if (item.equals("Peor Calificación")) {
            while (!presena2.isEmpty()) {
                Resena r = presena2.poll();
                Label t1 = new Label();
                t1.setText(r.getCompania());

                int numEstrell = r.getValoracion();
                HBox h = new HBox();
                for (int j = 0; j < numEstrell; j++) {
                    Image i = new Image("img/estrella.jpg");
                    ImageView imv = new ImageView(i);
                    imv.setFitWidth(20);
                    imv.setFitHeight(20);
                    h.getChildren().add(imv);
                }
                Text t2 = new Text();
                t2.setText(r.getComentario());
                idVboxResena.getChildren().addAll(t1, h, t2);
            }
        }else{
            dibujar(listanueva);
        }

    }

}
