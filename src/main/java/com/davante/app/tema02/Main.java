package com.davante.app.tema02;

import java.util.Scanner;

/**
 * Tema 02
 */

public class Main {
    
    public static void main(String[] args) {
    
        // Operaciones:

        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;

        // resultado = numero1 + numero2;
        // resultado = numero1 - numero2;
        // resultado = numero1 * numero2;
        // resultado = numero1 / numero2;
        // resultado = numero1 % numero2; // resto de la division

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(resultado);

        int contador = 0;
        // contador = contador + 1
        contador ++;

        /* Declaramos una variable especial que nos permite 
        introducir datos desde el teclado: */
        
        Scanner sn_teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero = sn_teclado.nextInt();
        System.out.println("Hola, el numero que escribiste es: " + numero);
        // Concatenar String + Variable

        // Podemos comunicarnos con el usuario
        // System.out.println("Hola");

        // El usuario se comunica con nosotros
        // Leer información / datos desde teclado

        // Variables:

        // Declarar Variables
        // Palabra reservada - nombre - inicializar
        
        // Números:
            // Enteros: byte, short, int, long
            // Reales: float, double
        // Caracteres: char, string
        // Booleanos: boolean -> true, false
 
    }
}