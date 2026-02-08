package com.davante.app.tema06;

import java.util.Scanner;

/**
 * Tema 06 - Arrays
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = 5;
        
        // ARRAYS - VECTORES - LISTAS - ARREGLOS
        
        // Declarar un Array:
        int[] numeros = new int [4];
        numeros [0] = 10;
        
        // Manipulación del Array
        System.out.println("Introduce los valores del array");
        for(int i = 0; i < 4; i++) {
            numeros[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.println("Tu array ahora es ");
        for (int i = 0; i <= 3; i++) {
            System.out.println(numeros[i]);
        }
        
        // Operaciones con Arrays:
        a = ( (numeros[1] + numeros[2]) / (numeros[3] * a) );
        System.out.println(a);
    }
}
