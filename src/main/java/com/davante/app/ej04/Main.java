package com.davante.app.ej04;

import java.util.Scanner;

/**
 * 4. Calcula el factorial de un número.
 */

public class Main {
            
    public static int calcularFactorial(int n) {

        int factorial = 1;

        // Si n es 0, el bucle no se ejecuta y devuelve 1 (correcto por definición).

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número para calcular el factoral");
        int n = sc.nextInt();
        
        // Llamamos al metodo
        int resultado = calcularFactorial(n);
        
        System.out.println( "El factorial de " + n + " es " + resultado );
        
        sc.close(); // Buena práctica: Cerrar el scanner.   
    }
}