package com.fad;

public class ifkeycodeblock {

    public static void main(String[] args){
        boolean gameOver = true;
        int p1Score = 201;
        int p2Score = 800;
        int p1levelCompleted = 5;
        int p2levelCompleted = 8;
        int p2Bonus = 200;
        int p1Bonus = 100;
        int p1FinalScore = (p1Score + p1Bonus * p1levelCompleted);
        int p2FinalScore = (p2Score + p2Bonus * p2levelCompleted);


        if(p1FinalScore < 5000 && p1FinalScore > 1001) {
            System.out.println("Player 1's Score was " + p1FinalScore + " which is less than 5000 BUT greater than 1000");
        } else if (p1FinalScore < 1000) {
            System.out.println("Player 1's score was " + p1FinalScore + " which is a Terrible score");
        } else {
            System.out.println("Player 1's score was " + p1FinalScore + " which means you've won!");
        }

        if(p2FinalScore < 5000 && p2FinalScore > 1001) {
            System.out.println("Player 2's Score was " + p2FinalScore + " which is less than 5000 BUT greater than 1000");
        } else if (p1FinalScore < 1000) {
            System.out.println("Player 2's score was " + p2FinalScore + " which is a Terrible score");
        } else {
            System.out.println("Player 2's score was " + p2FinalScore + " which means you've won!");
        }

        if(p1FinalScore > p2FinalScore) {
            System.out.println("Player 1 Wins!");
        } else if(p1FinalScore == p2FinalScore) {
            System.out.println("Twas a draw");
        } else System.out.println("Player 2 Wins!");
    }
}
