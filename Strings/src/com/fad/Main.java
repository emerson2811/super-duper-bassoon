package com.fad;

public class Main {

    public static void main(String[] args) {
        /*types of data in java
            byte
            short
            int
            long
            float
            double
            char
            boolean
            string
         */
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("mystring is equal to " + myString);
        myString = myString + " \u00A9 2018";
        System.out.println("mystring is equal to " + myString);

        //math with strings isn't math
        String numberString = "2824.13";
        String secondNumber = "23.4";
        System.out.println("total is " + numberString + secondNumber);

        //when adding an int to a string, java turns the int into a string and adds to string
        String lastString = "10";
        int myInt = 50;
        System.out.println(lastString + myInt);
        int secondInt = 2;
        System.out.println(lastString + myInt + secondInt);
    }
}
