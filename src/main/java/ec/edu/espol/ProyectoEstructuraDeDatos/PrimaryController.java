package ec.edu.espol.proyectoestructuradedatos;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button boton2;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
