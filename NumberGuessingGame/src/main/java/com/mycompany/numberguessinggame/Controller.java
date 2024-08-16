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
    }

    @FXML
    public void processUserInput(ActionEvent event) {
        try {
            int guessedNumber = Integer.parseInt(input.getText());
            showNormalMessage(gameLogic.update(guessedNumber));
        } catch (NumberFormatException e) {
            showError("You have not entered a valid number!");
        }       
    }
    
    @FXML
    public void restart(ActionEvent event){
        gameLogic.restart();
        showNormalMessage("Enter a number, that the Other player has to guess");
    }

    public void showError(String message) {
        output.setText(message);
        output.getStyleClass().removeAll("output-default", "output-error");
        output.getStyleClass().add("output-error");
    }

    public void showNormalMessage(String message) {
        output.setText(message);
        output.getStyleClass().removeAll("output-default", "output-error");
        output.getStyleClass().add("output-default");
    }

}
