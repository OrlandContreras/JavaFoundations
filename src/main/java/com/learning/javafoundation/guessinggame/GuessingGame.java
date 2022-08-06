package com.learning.javafoundation.guessinggame;

public class GuessingGame {
    public String guess(int guessNumber) {
        return guessNumber ==  getRandomNumber() ? "You got it" : "You didn't get it";
    }

    public int getRandomNumber() {
        return 0;
    }
}
