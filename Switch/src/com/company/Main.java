package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        char value = 'B';

        switch (value) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(value + " CHAR FOUND!");
                break;
            default:
                System.out.println("CHAR NOT FOUND!");
                break;
        }

        String month = "mAY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("JAN");
                break;
            case "february":
                System.out.println("FEB");
                break;
            case "march":
                System.out.println("MAR");
                break;
            case "april":
                System.out.println("APR");
                break;
            case "may":
                System.out.println("MAY");
                break;
            case "june":
                System.out.println("JUN");
                break;
            case "july":
                System.out.println("JUL");
                break;
            case "august":
                System.out.println("AUG");
                break;
            case "september":
                System.out.println("SEP");
                break;
            case "october":
                System.out.println("OCT");
                break;
            case "november":
                System.out.println("NOV");
                break;
            case "december":
                System.out.println("DEZ");
                break;
            default:
                System.out.println("Not a month.");

        }
    }
}
