package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("Its not a Alien!!");
            System.out.println("And I am scared of Aliens!");
        }

        int topScore = 99;
        if (topScore == 100) {
            System.out.println("You got the High Score!! :)");
        } else if (topScore != 100) {
            System.out.println("You DIDN'T got the High Score. :/");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen.");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true!");
        }

        boolean oppositeCar = isCar ? false : true;
        if (oppositeCar) {
            System.out.println("oppositeCar is true!");
        }

        int age = 19;
        boolean is18orOver = (age >= 18) ? true : false;

    }
}
