module ec.edu.espol.proyectoestructuradedatos {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.proyectoestructuradedatos to javafx.fxml;
    exports ec.edu.espol.proyectoestructuradedatos;
}
