module ec.edu.espol.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.mavenproject1 to javafx.fxml;
    exports ec.edu.espol.mavenproject1;
}
