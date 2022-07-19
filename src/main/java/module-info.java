module com.example.calcgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calcgame to javafx.fxml;
    exports com.example.calcgame;
}