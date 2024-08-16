/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numberguessinggame;

/**
 * This class is the game logic for the number guessing game. It stores the number to guess and checks if the user input is correct.
 * 
 * @author Berk Can Ulubas
 * @version 16.08.2024
 */
public class GameLogic {
    
    private Integer numberToGuess;

    public GameLogic() {
        numberToGuess = null;
    }
    
    /**
     * This method resets the number to guess.
     */
    public void restart(){
        numberToGuess = null;
    }
    
    /**
     * This method checks if the user input is correct and updates the game logic.
     * 
     * @param currentGuess The user input
     * @return A message for the user
     */
    public String update(int currentGuess){
        if(numberToGuess == null){          // if the number to guess is not set  (the game just started)
            numberToGuess = currentGuess;
            return "Guess the number the other player entered";
        }else if(currentGuess == numberToGuess) {   // if the user input is correct
            numberToGuess = null;
            return "Congratulations, you guessed the right number " + currentGuess;
        }else{                          // if the user input is incorrect
            return "Unfortunately " + currentGuess + " was not the number we were looking for";
        }
    }
    
}
