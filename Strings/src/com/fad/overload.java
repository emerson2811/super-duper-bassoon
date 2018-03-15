package com.fad;

public class overload {

    public static void main(String args[]) {
        int newScore = calculateScore ("Hasdrabul", 1100);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore("Hannibal", 1249);
        calculateScore();
    }

    public static int calculateScore(String playersName, int score) {
        System.out.println("Player " + playersName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}

