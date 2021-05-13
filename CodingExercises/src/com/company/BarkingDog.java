package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        }

        if (hourOfDay <= 23 && hourOfDay >= 0 &&
                (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        return false;
    }
}
