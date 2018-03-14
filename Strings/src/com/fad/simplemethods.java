package com.fad;

public class simplemethods {

    public static void main(String [] args) {

        calculateScore(false, 800, 5, 175);

        calculateScore(true, 800, 4, 100);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was" + finalScore);
            return finalScore;
        }

        else {
            return -1;
        }
    }

}
