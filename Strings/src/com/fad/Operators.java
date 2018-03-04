package com.fad;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("That equals " + result);

        int previousResult = result;

        result = result - 1;

        System.out.println("Now that eaquals " + result);
        result++;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");
        else
            System.out.println("It IS an alient!");

        int topScore = 23;
        if (topScore == 100)
            System.out.println("You got the high score");
        else
            System.out.println("Keep trying!");

        int myScore = 34;
        if (myScore > topScore && myScore < 100)
            System.out.println("Ger than second top score athan 100");

        if ((topScore > 90) || (myScore <= 90))
            System.out.println("One of these tests is true");
    }
}
