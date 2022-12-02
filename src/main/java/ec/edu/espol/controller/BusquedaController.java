/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import ec.edu.espol.model.AnioComparator;
import ec.edu.espol.model.AnioTituloComparator;
import ec.edu.espol.model.Juego;
import ec.edu.espol.model.Resena;
import ec.edu.espol.model.TituloComparator;
import ec.edu.espol.proyectoestructuradedatos.App;
import ec.edu.espol.util.ArrayList;
import ec.edu.espol.util.List;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
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
public class BusquedaController implements Initializable {

    @FXML
    private VBox vboximg;
    @FXML
    private Text tit;
    @FXML
    private Text desc;
    @FXML
    private TextField TxtBusqueda;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        String b
        
        //System.out.println(j1.getFirst().toString());
        //Juego jA = new Juego("", bus, "", 0, resenas, "", "");
        //List<Juego> j2 = Juego.leerJuegos("juegos.ser").findAll(jA, new AnioComparator());

//        String[] busparts = bus.split(" ");
//        String part1 = busparts[0];
//
//        String part2 = busparts[1];
//
//        Juego jAT = new Juego(part1, part2, "", 0, resenas, "", "");
//        List<Juego> j3 = Juego.leerJuegos("juegos.ser").findAll(jAT, new AnioTituloComparator());
//        Alert a = new Alert(AlertType.INFORMATION, "hola");
//        a.show();
        
        
        
        
    }    

    @FXML
    private void buscando(MouseEvent event) {
        String bus = TxtBusqueda.getText();
        ArrayList<Resena> resenas = Resena.leerResena();
        
        // Juego(String titulo, String anio, String descripcion, double precio, ArrayList<Resena> resena, String genero, String compania)
        
        Juego jt = new Juego(bus, "", "", 0, resenas, "", "");
        //System.out.println(jt);
        List<Juego> j1 = Juego.leerJuegos("juegos.ser").findAll(jt, new TituloComparator());
//        List<Juego> j2 = Juego.leerJuegos("juegos.ser").findGreater(jt, new TituloComparator());
//        List<Juego> j3 = Juego.leerJuegos("juegos.ser").findLower(jt, new TituloComparator());
//        System.out.println(j1);
//        j1.concatenar(j2);
//        System.out.println(j2);
//        j1.concatenar(j3);
//        System.out.println(j3);
//        List<Juego> j4 = j1.eliminarRepetidos();
//        System.out.println(j4);
        
        for(int j = 1; j<=j1.size(); j++){
            Juego ju = j1.get(j);
            Image i = new Image("img/"+ju.getTitulo()+"/"+ju.getTitulo()+"-cap1.jpg");
            ImageView imv = new ImageView(i);
            imv.setFitWidth(400);
            imv.setFitHeight(200);
            imv.setOnMouseClicked((MouseEvent e)->{
                tit.setText(ju.getTitulo());
                desc.setText(ju.getDescripcion());
                
                
                desc.setWrappingWidth(200);
                desc.setTextAlignment(TextAlignment.JUSTIFY);
                
            
            });
            vboximg.getChildren().add(imv);
        }   
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
    

