package com.davante.app.ej13;

import java.util.Scanner;

/**
 * Comprueba si un número es primo.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");

        Scanner scanner = new Scanner(System.in);
        String numero = scanner.nextLine();

        scanner.close();

        int n = Integer.parseInt(numero);

        boolean resultado = esPrimo(n);

        if (resultado) {
            System.out.println("El número " + n + " es primo");
        } else {
            System.out.println("El número " + n + " no es primo");
        }
    }

    public static boolean esPrimo(int n) {
        // 1 no es primo:
        if (n <= 1) return false;

        // Probamos desde 2 hasta n-1:
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // algún número lo dividió exacto -> No es primo.
            }
        }
        return true; // Ninguno lo dividió -> Es primo.
    }
}
