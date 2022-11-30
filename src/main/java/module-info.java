module ec.edu.espol.proyectoestructuradedatos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.proyectoestructuradedatos to javafx.fxml;
    opens ec.edu.espol.controller to javafx.fxml;
    exports ec.edu.espol.proyectoestructuradedatos;
    exports ec.edu.espol.controller;
}
