package com.davante.app.ej14;

/**
 * 14. Calcula la suma de los dígitos de un número
 */

public class Main {
    public static void main(String[] args) {
        int numero = 587;
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            suma = suma + digito;
            numero = numero / 10;
        }
        System.out.println("La suma de todos los dígitos es igual a " + suma);
    }
}
