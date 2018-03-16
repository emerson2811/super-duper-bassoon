package com.fad;

public class conversions {

    public static void main(String [] args) {
        int feetToInches = (measurement(12, 5) * 12);
        calcFeetAndInchesToCentimeters(0, 5);

    }


    public static int measurement (int feet, int inches) {
        System.out.println(feet + " feet equals " + inches + " inches!");
        return inches;

        //calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        // 2 pipes is 'or', 2 ampersands means 'and'
        if ((feet < 0) || ((inches < 0 ) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters );
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        // the percent sign "%" means 'divide by this number and return the remainder'
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
