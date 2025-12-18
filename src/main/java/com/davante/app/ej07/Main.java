package com.davante.app.ej07;

import java.util.Scanner;

/*
* 6. Comprueba si una cadena de texto es un palíndromo.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String entrada = sc.nextLine();
        System.out.println( "El texto que ingresaste es: " + entrada );

        // Preparar la cadena (eliminar espacios y convertir a minúsculas)
        String cadenaLimpia = entrada.replaceAll("\\s+", "").toLowerCase();
        System.out.println( "La cadena preparada es: " + cadenaLimpia);

        // Invertir la cadena
        String cadenaInvertida = new StringBuilder(cadenaLimpia).reverse().toString();
        System.out.println("La cadena invertida es: " + cadenaInvertida);

        // Comparar
        if ( cadenaLimpia.equals(cadenaInvertida) ) {
            System.out.println("'" + entrada + "' es un palíndromo. ");
        } else {
            System.out.println("'" + entrada + "' no es un palíndromo. ");
        }
        sc.close();
    }
}
