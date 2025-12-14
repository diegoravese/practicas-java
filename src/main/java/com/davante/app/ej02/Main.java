package com.davante.app.ej02;

import java.util.Scanner;

/**
 * 2. Suma dos números introducidos por el usuario.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Introduzca el primer número");
        int numero1 = sc.nextInt();
        System.out.println("El número introducido es " + numero1);
        
        System.out.println("Introduzca otro número");
        int numero2 = sc.nextInt();
        System.out.println("El número introducido es " + numero2);
        
        System.out.println( numero1 + " + " + numero2 + " es igual a " + (numero1 + numero2) );
    }
}
