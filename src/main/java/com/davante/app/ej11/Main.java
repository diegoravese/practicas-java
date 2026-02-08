package com.davante.app.ej11;

import java.util.Scanner;

/**
 * 11. Cuenta las vocales en una cadena de texto
 */

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        scanner.close();

        int contadorVocales = 0;

        // Convertir toda la cadena a minúsculas para simplificar la comparación
        String textoMin = texto.toLowerCase();

        // Iterar sobre cada carácter de la cadena
        for (int i = 0; i < textoMin.length(); i++) {
            char caracter = textoMin.charAt(i); // Obtener el carácter en la posición 'i'

            // Verificar si el carácter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++; // Incrementar el contador si es una vocal
            }
        }

        System.out.println("La cadena \"" + texto + "\" contiene " + contadorVocales + " vocales.");
    }
}
