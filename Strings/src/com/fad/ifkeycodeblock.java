package com.fad;

public class ifkeycodeblock {

    public static void main(String[] args){
        boolean gameOver = true;
        int p1Score = 500;
        int p2Score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int p1FinalScore = (p1Score+bonus*levelCompleted);
        int p2FinalScore = (p2Score + bonus * levelCompleted);


        if(p1FinalScore < 5000 && p1FinalScore > 1001) {
            System.out.println("Player 1's Score was " + p1FinalScore + " which is less than 5000 BUT greater than 1000");
        } else if (p1FinalScore < 1000) {
            System.out.println("Player 1's score was " + p1FinalScore + " which is a Terrible score");
        } else {
            System.out.println("Player 1's score was " + p1FinalScore + " which means you've won!");
        }

        if(p2FinalScore < 5000 && p2FinalScore > 1001) {
            System.out.println("Player 2's Score was " + p1FinalScore + " which is less than 5000 BUT greater than 1000");
        } else if (p1FinalScore < 1000) {
            System.out.println("Player 2's score was " + p1FinalScore + " which is a Terrible score");
        } else {
            System.out.println("Player 2's score was " + p1FinalScore + " which means you've won!");
        }

        if(p1FinalScore > p2FinalScore) {
            System.out.println("Player 1 Wins!");
        } else if(p1FinalScore == p2FinalScore) {
            System.out.println("Twas a draw");
        } else System.out.println("Player 2 Wins!");
    }
}
