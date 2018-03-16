package com.fad;

public class conversions {

    public static void main(String [] args) {
        int feetToInches = (measurement(12, 5) * 12);

    }

    public static int measurement (int feet, int inches) {
        System.out.println(feet + " feet equals " + inches + " inches!");
        return inches;
    }
}
