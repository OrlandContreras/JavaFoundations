package com.learning.javafoundation.guessinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        int randomNum = this.game.getRandomNumber();
        String message = this.game.guess(randomNum);
        assertEquals("You got it", message);
    }

    @Test
    public void testOneWrongNegGuessSituation() {
        String message = this.game.guess(-5);
        assertEquals("You didn't get it", message);
    }

    @Test
    public void testOneWrongPosGuessSituation() {
        int randomNum = this.game.getRandomNumber();
        String message = this.game.guess(randomNum + 1);
        assertEquals("You didn't get it", message);
    }


    //@RepeatedTest(10)
    @Test
    public void testRandomNumberGeneration() {
        int[] rndNumCount = new int[11];
        for (int counter = 0; counter < 50; counter++) {
            GuessingGame game = new GuessingGame();
            int randomNum = game.getRandomNumber();
            rndNumCount[randomNum] = 1;
        }

        int sum = 0;
        for (int counter = 0; counter < 11; counter++) {
            sum += rndNumCount[counter];
        }
        System.out.println(sum);

        assertEquals(10, sum);
    }
}
