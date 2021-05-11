package com.company;

public class Main {

    public static void main(String[] args) {

        double num1 = 20.00;
        double num2 = 80.00;

        double result = ((num1 + num2) * 100.00) % 40.00;

        boolean boolResult = (result == 0) ? true : false;

        if (!boolResult) {
            System.out.println("Got some remainder!");
        } else {
            System.out.println("There was NO remainder!");
        }

    }
}
