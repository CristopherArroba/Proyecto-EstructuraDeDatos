module ec.edu.espol.proyectoestructuradedatos {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.proyectoestructuradedatos to javafx.fxml;
    opens ec.edu.espol.model to javafx.fxml;
    exports ec.edu.espol.proyectoestructuradedatos;
    exports ec.edu.espol.model;
}
