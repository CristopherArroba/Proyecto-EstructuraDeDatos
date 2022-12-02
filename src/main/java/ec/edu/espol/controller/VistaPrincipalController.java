/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controller;

import ec.edu.espol.model.AnioComparator;
import ec.edu.espol.model.AnioTituloComparator;
import ec.edu.espol.model.Juego;
import static ec.edu.espol.model.Juego.leerJuegos;
import ec.edu.espol.model.Resena;
import ec.edu.espol.model.TituloComparator;
import ec.edu.espol.proyectoestructuradedatos.App;
import ec.edu.espol.util.ArrayList;
import ec.edu.espol.util.CircularDoubleLinkedList;
import ec.edu.espol.util.List;
import java.io.IOException;
import java.net.URL;
import java.util.ListIterator;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
    
    @FXML
    private Button btnBuscar;

    @FXML
    private TextField buscador;

    @FXML
    private void buscar(MouseEvent event) {
        String bus = buscador.getText().toString();
        ArrayList<Resena> resenas = Resena.leerResena();
        
        // Juego(String titulo, String anio, String descripcion, double precio, ArrayList<Resena> resena, String genero, String compania)
        
        Juego jt = new Juego(bus, "", "", 0, resenas, "", "");
        
        List<Juego> j1 = leerJuegos("juegos.txt").findAll(jt, new TituloComparator());

        Juego jA = new Juego("", bus, "", 0, resenas, "", "");
        List<Juego> j2 = leerJuegos("juegos.txt").findAll(jA, new AnioComparator());

        String[] busparts = bus.split(" ");
        String part1 = busparts[0];

        String part2 = busparts[1];

        Juego jAT = new Juego(part1, part2, "", 0, resenas, "", "");
        List<Juego> j3 = leerJuegos("juegos.txt").findAll(jAT, new AnioTituloComparator());
        
    }
    
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
        try {
                FXMLLoader fxmlloader = App.loadFXMLLoader("VistaJuego");
                App.setRoot(fxmlloader);
                VistaJuegoController vjc = fxmlloader.getController();             
                vjc.cargarImagen(j);
            } catch (IOException ex) {
                Alert a = new Alert(AlertType.ERROR,"No se pudo abrir el archivo del siguiente grafo de scene");
                a.show();
            }
    }
    
}
