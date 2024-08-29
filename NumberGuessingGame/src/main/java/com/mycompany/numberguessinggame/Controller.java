/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numberguessinggame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * This is the controller class for the number guessing game.
 * 
 * @author Berk Can Ulubas
 * @version 16.08.2024
 */
public class Controller implements Initializable {

    @FXML
    private Label output;

    @FXML
    private TextField input;
    
    @FXML
    private Button restart;
    
    private GameLogic gameLogic;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gameLogic = new GameLogic();
        showNormalMessage("Enter a number, that the Other player has to guess");
        input.clear();
    }

    /**
     * This method is called when the user presses the "Enter" button.
     * It reads the user input, checks if it is a valid number and updates the game logic.
     * 
     * @param event 
     */
    @FXML
    public void processUserInput(ActionEvent event) {
        try {
            int guessedNumber = Integer.parseInt(input.getText());
            showNormalMessage(gameLogic.update(guessedNumber));
        } catch (NumberFormatException e) {
            showError("You have not entered a valid number!");
        }finally {
            input.clear();
        }
    }
    
    /**
     * This method is called when the user presses the "Restart" button.
     * It resets the game logic and shows a message to the user.
     * 
     * @param event 
     */
    @FXML
    public void restart(ActionEvent event){
        gameLogic.restart();
        showNormalMessage("Enter a number that the other player has to guess");
        input.clear();
    }

    /**
     * This method shows an error message to the user by changing the text color to red.
     * 
     * @param message the Text tht will be shown in the error message
     */
    public void showError(String message) {
        output.setText(message);
        output.getStyleClass().removeAll("output-default", "output-error");
        output.getStyleClass().add("output-error");
    }

    /**
     * This method shows a normal message to the user by changing the text color to black.
     * 
     * @param message  the Text that will be shown in the output label
     */
    public void showNormalMessage(String message) {
        output.setText(message);
        output.getStyleClass().removeAll("output-default", "output-error");
        output.getStyleClass().add("output-default");
    }

}
