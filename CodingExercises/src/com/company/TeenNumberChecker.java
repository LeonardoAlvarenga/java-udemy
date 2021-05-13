package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
        return ((firstValue >= 13 && firstValue <= 19) ||
                (secondValue >= 13 && secondValue <= 19) ||
                (thirdValue >= 13 && thirdValue <= 19));
    }
    public static boolean isTeen(int value) {
        return (value >= 13 && value <= 19);
    }
}
