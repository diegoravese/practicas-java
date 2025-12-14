package com.davante.app.ej05;

import java.util.Scanner;

/**
 * 5. Imprime la secuencia de Fibonacci hasta n términos.
 */

public class Main {
    
    // Método static: void poruqe imprime directamente, no necesita devolver un valor único
    public static void imprimirFibonacci(int n) {
        
        // Usamos long para evitar desbordamiento si n es grande
        long a = 0;
        long b = 1;
        
        System.out.println("La secuencia es: ");
        
        for (int i = 0; i < n; i++) {
            System.out.println(a + " "); // Imprimimos el número actual
            
            // Lógica de intercambio
            long suma = a + b; // Calculamos el siguiente
            a = b;             // El actual pasa a ser el viejo 'siguiente'
            b = suma;          // El siguiente pasa a ser la suma
        }
        System.out.println();  // Salto de línea final
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántos términos de Fibonacci quieres ver?");
        int n = sc.nextInt();
        
        // Validamos que el usuario no ponga negativos
        if (n <= 0) {
            System.out.println("Por favor ingresa un número mayor a 0");
        } else {
            imprimirFibonacci(n);
        }
        sc.close();
    }
}
