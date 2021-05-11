package com.company;

public class Main {

    public static void main(String[] args) {
        // CHAR
        // Single character storage
        // Occupies 2 bytes of memory - 16 bits - Thus, has a width of 16
        // The reason to CHAR isn`t a single byte character is that it allows UNICODE
        // In many languages, there are MORE than 26 letter, digits and or symbols assigned to a single representation
        // Two bytes CHAR can represent up to 65535 different types of UNICODE
	    char myChar = 'D';

	    // unicode-table.com
        // The UNICODE for the "D" CHAR is 0044
        // To use the UNICODE, we need to use inverted bar and u at the beginning of the code declaration
        // Followed by 4 digits/letters varying from 1 to F (16)
        // 0000 -> 0044 -> 0A0F -> FFFF
        // 2^4 * 2^4 * 2^4 * 2^4 = 2^16 = 65536
        char myUnicode = '\u0044';

        char myUnicodeCopyright = '\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myUnicodeCopyright);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean _isCustomerOver21 = true;

        

    }
}
