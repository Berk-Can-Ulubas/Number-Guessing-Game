module com.mycompany.numberguessinggame {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.mycompany.numberguessinggame to javafx.fxml;
    exports com.mycompany.numberguessinggame;
}
