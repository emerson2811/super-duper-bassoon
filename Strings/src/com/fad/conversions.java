package com.fad;

public class conversions {

    public static void main(String [] args) {
        int feetToInches = (measurement(12, 5) * 12);
        calcFeetAndInchesToCentimeters(-12, 5);

    }

    public static int measurement (int feet, int inches) {
        System.out.println(feet + " feet equals " + inches + " inches!");
        return inches;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0 ) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters );
        return centimeters;

    }
}
