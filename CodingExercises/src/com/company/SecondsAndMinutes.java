package com.company;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value.";

    public static String getDurationString(int totalMinutes, int seconds) {
        if (totalMinutes < 0 || seconds < 0 || seconds >= 60) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Transforms 0 => 00, 1 => 01, ... 9 => 09
        String hoursString = (hours < 10) ? "0" + hours : String.valueOf(hours);
        String minutesString = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);
        String secondsString = (seconds < 10) ? "0" + seconds : String.valueOf(seconds);

        System.out.println(hoursString + "h " + minutesString + "m " + secondsString + "s");
        return hoursString + "h " + minutesString + "m " + secondsString + "s";
    }

    public static String getDurationString(int totalSeconds) {
        if (totalSeconds < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        return getDurationString(minutes, seconds);
    }

}
