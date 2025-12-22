package com.davante.app.ej10;

/**
 * 10. Suma todos los elementos de un array
 */

public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 50, 20, 80, 30, 90, 40};
        int suma = 0; // Variable para acumular la suma

        for (int i = 0; i < numeros.length; i++) { // Recorre desde el índice 0 hasta el final
            suma = suma + numeros[i]; // Suma el elemento actual al total
        }

        System.out.println("La suma es: " + suma);
    }   
}
