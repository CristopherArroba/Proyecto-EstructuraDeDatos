module ec.edu.espol.proyectoestructuradedatos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.proyectoestructuradedatos to javafx.fxml;
    opens ec.edu.espol.controller to javafx.fxml;
    exports ec.edu.espol.proyectoestructuradedatos;
<<<<<<< HEAD
    
    opens ec.edu.espol.controller to javafx.fxml;
    exports ec.edu.espol.controller;
    
    opens ec.edu.espol.util to javafx.fxml;
    exports ec.edu.espol.util;
    
    opens ec.edu.espol.model to javafx.fxml;
    exports ec.edu.espol.model;
=======
    exports ec.edu.espol.controller;
>>>>>>> 63b6886c6cbc9d1ba1e65bb0b98c672739a260b2
}
