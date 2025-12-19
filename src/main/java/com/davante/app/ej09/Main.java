package com.davante.app.ej09;

/*
* 9. Encuentra el número más grande en un array.
*/

public class Main {
    public static void main(String[] args) {

        int[] numeros = {10, 50, 20, 80, 30, 90, 40};

        // 1. Asumimos que el primer elemento es el mas grande
        int maximo = numeros[0];

        // 2. Recorremos el array desde el segundo elemento (índice 1)
        for ( int i = 1; i < numeros.length; i++ ) {
            // 3. Comparamos el elemento actual con el máximo encontrado
            if (numeros[i] > maximo) {
                // 4. Si el actual es mayor, lo actualizamos como el nuevo máximo
                maximo = numeros[i];
            }
        }

        // 5. Imprimimos el resultado
        System.out.println("El número más grande en el array es: " + maximo);
    }    
}
