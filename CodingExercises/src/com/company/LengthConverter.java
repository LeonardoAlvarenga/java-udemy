package com.company;

public class LengthConverter {
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        final double INCH_IN_CM = 2.54;
        final double FOOT_IN_INCH = 12;

        if (feet < 0 || inches < 0 || inches >= 12) {
            return -1;
        }

        return ((FOOT_IN_INCH * feet) + inches) * INCH_IN_CM;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        final double FOOT_IN_INCH = 12;

        if (inches < 0) {
            return -1;
        }

        int feetLeft = (int) (inches / FOOT_IN_INCH);
        int inchesLeft = (int) (inches % FOOT_IN_INCH);

        return calcFeetAndInchesToCentimeters(feetLeft, inchesLeft);
    }
}
