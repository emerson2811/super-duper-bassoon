package com.fad;

public class ifkeycodeblock {

    public static void main(String[] args){
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = (score+bonus*levelCompleted);

        if(finalScore < 5000 && finalScore > 1001) {
            System.out.println("Your score was " + finalScore + " which is less than 5000 BUT greater than 1000");
        } else if (finalScore < 1000) {
            System.out.println("Your score was " + finalScore + " which is a Terrible score");
        } else {
            System.out.println("Your score was " + finalScore + " which means you've won!");
        }
    }
}
