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
 * This Program is a simple number guessing game. One player enters a number and
 * the other player has to guess it.
 *
 * @author Berk Can Ulubas
 * @version 16.08.2024
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // Lade FXML-Datei aus dem Klassenpfad
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mycompany/numberguessinggame/MainView.fxml"));
            BorderPane root = loader.load();

            // Erstelle die Szene
            var scene = new Scene(root);

            // Lade die CSS-Datei aus dem Klassenpfad
            scene.getStylesheets().add(getClass().getResource("/com/mycompany/numberguessinggame/MainViewStyle.css").toExternalForm());

            // Zeige die Stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.println("Error loading FXML or CSS file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
