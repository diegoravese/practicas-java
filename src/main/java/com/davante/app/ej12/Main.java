package com.davante.app.ej12;

import java.util.Scanner;

/**
 * 12. Genera una tabla de multiplicar
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Crear objeto Scanner
        System.out.print("Introduce el número para la tabla de multiplicar: ");
        int numero = scanner.nextInt(); // Leer el número del usuario

        System.out.println("Tabla del " + numero + ":");

        // Bucle for para iterar desde 1 hasta 10 (o el límite que desees)
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i; // Calcular el resultado

            // Imprimir la línea de la tabla
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close(); // Cerrar el scanner
    }
}
