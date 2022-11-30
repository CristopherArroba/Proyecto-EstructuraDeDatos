module ec.edu.espol.proyectoestructuradedatos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.proyectoestructuradedatos to javafx.fxml;
    exports ec.edu.espol.proyectoestructuradedatos;
    
    opens ec.edu.espol.controller to javafx.fxml;
    exports ec.edu.espol.controller;
    
    opens ec.edu.espol.util to javafx.fxml;
    exports ec.edu.espol.util;
    
    opens ec.edu.espol.model to javafx.fxml;
    exports ec.edu.espol.model;
    
}
