/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numberguessinggame;

/**
 *
 * @author berk-
 */
public class GameLogic {
    
    private Integer numberToGuess;

    public GameLogic() {
        numberToGuess = null;
    }
    
    public void restart(){
        numberToGuess = null;
    }
    
    public String update(int currentGuess){
        if(numberToGuess == null){
            numberToGuess = currentGuess;
            return "Guess the number the other player entered";
        }else if(currentGuess == numberToGuess) {
            numberToGuess = null;
            return "Congratulations, you guessed the right number " + currentGuess;
        }else{
            return "Unfortunately " + currentGuess + " was not the number we were looking for";
        }
    }
    
}
