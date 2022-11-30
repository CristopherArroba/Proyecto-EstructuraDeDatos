package ec.edu.espol.proyectoestructuradedatos;

        
import ec.edu.espol.model.Compania;
import ec.edu.espol.util.Archivos;


import ec.edu.espol.model.Juego;
import ec.edu.espol.model.Resena;


import ec.edu.espol.util.ArrayList;
import ec.edu.espol.util.CircularDoubleLinkedList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static String pathFile="src/main/resources/files/";

    
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("principal"));
        stage.setScene(scene);        
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        
    }
    
    public static void setRoot(FXMLLoader fxmlloader) throws IOException{
        scene.setRoot(fxmlloader.load());
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static FXMLLoader loadFXMLLoader(String fxml) throws IOException{
        FXMLLoader fxmloader=new FXMLLoader(App.class.getResource(fxml+ ".fxml"));
        return fxmloader;
    
    }
       
    public static void main(String[] args) {
        
//        ArrayList<Juego> juegos1 = new ArrayList<>();
//        ArrayList<Juego> juegos2 = new ArrayList<>();
//        ArrayList<Juego> juegos3 = new ArrayList<>();
//        ArrayList<Juego> juegos4 = new ArrayList<>();
//        
//        ArrayList<Resena> resenas =Resena.leerResena();
            
//        for(Resena r: resenas){
//            System.out.println(r);
//        }
        
//        
//       
//        Compania comp1 = new Compania("Sega", juegos1, resenas);
//        Compania comp2 = new Compania("Capcom", juegos2, resenas);
//        Compania comp3 = new Compania("Nintendo", juegos3, resenas);
//        Compania comp4 = new Compania("Ubisoft", juegos4, resenas);
        
//        Juego juego1 = new Juego("NBA Jam", "2010", "hagamos un 2 contra 2, a híper velocidad, con las mejores parejas de cada equipo. No estaba Michael Jordan, OK. Pero sí estaban Reggie Miller, Isiah Thomas, Pippen, Ewing, Larry Johnson, Charles Barkley, Kemp, Mutombo, Olajuwon, Divac y la dupla Stockton-Malone.", 10, resenas, "deporte", "Sega");
//        Juego juego2 = new Juego("Mortal Kombat II", "2011", "Más violencia, más sangre (bastante más sangre), más personajes, más escenarios. Nuevos modos de fatalities (la Babality o la Friendship, por ejemplo). Baraka, Mileena, Kitana, Kung Lao, entre otros, se suman al repertorio de luchadores.", 0, resenas, "pelea", "Sega");
//        Juego juego3 = new Juego("Dragon ball z", "2012", "modo historia o al modo vs y elegir entre los once guerreros: Goku, Vegeta, Trunks, Gohan, Piccoro, Nro 18, Freezer, Cell, el Capitán Ginyu y Reecome y Krillin.", 20, resenas, "pelea", "Sega");
//        Juego juego4 = new Juego("Outrun", "2013", "El camino se dividía en dos y dependiendo de la elección se modificaba la ruta, el nivel de dificultad de las carreras y la secuencia del final.", 30, resenas, "carrera", "Sega");
//        Juego juego5 = new Juego("VirtualBart", "2000", "Seis minijuegos. El esquizoide Dino-Bart. El Baby-Bart saltando entre ramas. El Chancho-Bart en el matadero de Krusty. El tobogán acuático. La carrera en pleno holocausto nuclear. Y el más divertido de todos: Tomato Doom. ", 5, resenas, "accion", "Sega");
//        Juego juego6 = new Juego("Monster Hunter", "2018", "Monster Hunter por fin evolucionaba, pulía su jugabilidad, las criaturas resultaban tan impactantes como deberían y no perdía la exigencia o profundidad característica de las sagas anteriores", 25, resenas, "aventura", "Capcom");
//        Juego juego7 = new Juego("Resident evil", "2019", "es solo un civil con pocas habilidades especiales de lucha, y sin ningún entrenamiento de combate policial o militar, aun así es capaz de usar un considerable repertorio de armas", 35, resenas, "terror", "Capcom");
//        Juego juego8 = new Juego("Dragon's Dogma", "2012", "nos permite explorar un mundo abierto, resolver misiones y derrotar bestias fantásticas acompañados de Peones, unos personajes que se pueden compartir con las funciones online.", 15, resenas, "accion", "Capcom");
//        Juego juego9 = new Juego("Street Fighter", "2009", "¡Un nuevo rival ha subido al ring! Controla a los mejores 32 guerreros del planeta y pon a prueba tu coraje enfrentándote a jugadores de todo el mundo.", 28, resenas, "pelea", "Capcom");
//        Juego juego10 = new Juego("Zack y Wiki", "2008", "un juego inspirado en las aventuras gráficas clásicas que utilizó los sensores de movimiento para la resolución de puzles.", 19, resenas, "aventura", "Capcom");        
//        Juego juego11 = new Juego("", "", "", 0, resenas, "", "Nintendo");
//        Juego juego12 = new Juego("", "", "", 0, resenas, "", "Nintendo");
//        Juego juego13 = new Juego("", "", "", 0, resenas, "", "Nintendo");
//        Juego juego14 = new Juego("", "", "", 0, resenas, "", "Nintendo");
//        Juego juego15 = new Juego("", "", "", 0, resenas, "", "Nintendo");
//        Juego juego16 = new Juego("", "", "", 0, resenas, "", "Ubisoft");
//        Juego juego17 = new Juego("", "", "", 0, resenas, "", "Ubisoft");
//        Juego juego18 = new Juego("", "", "", 0, resenas, "", "Ubisoft");
//        Juego juego19 = new Juego("", "", "", 0, resenas, "", "Ubisoft");
//        Juego juego20 = new Juego("", "", "", 0, resenas, "", "Ubisoft");
//        

//        juegos1.addLast(juego1);
//        juegos1.addLast(juego2);
//        juegos1.addLast(juego3);
//        juegos1.addLast(juego4);
//        juegos1.addLast(juego5);
//
//        juegos2.addLast(juego6);
//        juegos2.addLast(juego7);
//        juegos2.addLast(juego8);
//        juegos2.addLast(juego9);
//        juegos2.addLast(juego10);
        
        //Añadir al archivo serializado los juegos
        
        //CircularDoubleLinkedList<Juego> juegosP = Juego.leerJuegos("juegos.ser");
//        
//        juegosP.addLast(juego1);
//        juegosP.addLast(juego2);
//        juegosP.addLast(juego3);
//        juegosP.addLast(juego4);
//        juegosP.addLast(juego5);
//
//        juegosP.addLast(juego6);
//        juegosP.addLast(juego7);
//        juegosP.addLast(juego8);
//        juegosP.addLast(juego9);
//        juegosP.addLast(juego10);



//        
        //Juego.guardarJuegos(juegosP,"juegos.ser");
        launch();
    }
//Prueba finalizada
}