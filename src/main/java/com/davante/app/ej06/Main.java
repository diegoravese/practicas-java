package com.davante.app.ej06;

/**
 * 6. Invierte una cadena de texto.
 */

public class Main {

    // Forma Iterativa:

    public static String reverseInputString(String myString) {
        if(myString == null)
            return myString;
        String reverseString = "";
        for( int i = myString.length() - 1; i >= 0; i-- ) {
            reverseString = reverseString + myString.charAt(i);
        }
        return reverseString;
    }
    
    public static void main(String[] args) {

        String myString1 = " X Y Z ";
        System.out.println("reverse(" + myString1 + ") = " + reverseInputString(myString1));

        String myString2 = " I Love Java ";
        System.out.println("reverse(" + myString2 + ") = " + reverseInputString(myString2));
        
    }
}
