package com.company;

public class MinutesToYearsAndDaysCalculator {

    private static final int MINUTES_IN_HOUR = 60;
    private static final int HOURS_IN_DAY = 24;
    private static final int DAYS_IN_YEAR = 365;


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hoursTotal = (int) minutes / MINUTES_IN_HOUR;
            int daysTotal = hoursTotal / HOURS_IN_DAY;

            // Total of Years and Days left out
            int years = daysTotal / DAYS_IN_YEAR;
            int days = daysTotal % DAYS_IN_YEAR;


            String message = minutes + " min = " + years + " y and " + days + " d";
            System.out.println(message);
        }
    }
}
