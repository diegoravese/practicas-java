package com.davante.app.tema05;

/**
 * Tema 05 - Recursividad
 */
public class Main {
    
    public static int factorial(int n) {
        
        // Caso base:
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        
        // 5! == 5*4*3*2*1
        int numero = 5;
        
        int resultado = 0;
        resultado = factorial(numero);
        System.out.println(resultado);
    }
}