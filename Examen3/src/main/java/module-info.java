module com.example.examen3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examen3 to javafx.fxml;
    exports com.example.examen3;
}