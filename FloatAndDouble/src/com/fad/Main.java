package com.fad;

public class Main {

    public static void main(String[] args) {
        int myintValue = 5 / 2;
        //add an 'f' to show it is a float
        //a float has 8 digits of precision
        float myFloatValue = 5f / 3f;

        //add a 'd' to show it is a double
        //a double has 16 digits of precision
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myintValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double myPounds = 225.25d;
        double myKilograms = myPounds / 2.2d;
        System.out.println(myKilograms);
    }
}
