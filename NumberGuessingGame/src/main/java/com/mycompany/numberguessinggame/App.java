package com.mycompany.numberguessinggame;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * This Program is a simple number guessing game. One player enters a number and the other player has to guess it.
 * 
 * @author Berk Can Ulubas
 * @version 16.08.2024
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // load FXML-file over URL
            URL fxml = new File("src\\main\\java\\com\\mycompany\\numberguessinggame\\MainView.fxml").toURI().toURL();
            BorderPane root = (BorderPane) FXMLLoader.load(fxml);

            // create scene
            var scene = new Scene(new StackPane(root));

            // load CSS-file over URL
            URL cssURL = new File("src\\main\\java\\com\\mycompany\\numberguessinggame\\MainViewStyle.css").toURI().toURL();
            scene.getStylesheets().add(cssURL.toExternalForm());

            // show stage
            stage.setScene(scene);
            stage.show();   
        } catch (IOException e) { 
            System.err.println("" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }

}