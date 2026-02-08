
package com.davante.app.ej03;

import java.util.Scanner;

/**
 * 3. Comprueba si un número es par o impar.
 */

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número para saber si es par o impar");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }
    }
}