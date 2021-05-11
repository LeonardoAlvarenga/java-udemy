package com.company;

public class Main {

    public static void main(String[] args) {
	// PRIMITIVE DATA TYPES
        // byte
        // short
        // INT
        // long
        // float
        // DOUBLE
        // char
        // BOOLEAN
    // CLASS - Not Primitive!
        // STRING
        String myString = "This is a String";
        System.out.println("myString is Equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is Equal to: " + myString);
        myString = myString + " \u00A9 2019.";
        System.out.println("myString is Equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
