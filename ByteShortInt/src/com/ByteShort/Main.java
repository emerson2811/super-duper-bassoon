package com.ByteShort;

public class Main {

    public static void main(String[] args) {
        int myMinValue = -2_147_483_648;
        /* the smallest number an int can store
        * int has a width of 32*/

        int myMaxValue = 2_147_48368;
        // the largest number an int can store //

        int myTotal = (myMinValue/2);

        // byte has a width of 8
        byte myByteValue = -10;
        int myNewByteValue = (myByteValue/2);

        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 100L;

    }
}
