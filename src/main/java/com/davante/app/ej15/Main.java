package com.davante.app.ej15;

/**
 *
 * 15. Imprime un patrón de pirámide usando bucles
 * @author diego
 */

public class Main {
    public static void main(String[] args) {
        int cantidadFilas = 5;
        for (int fila = 1; fila <= cantidadFilas; fila = fila + 1) {
            for (int columna = 1; columna <= fila; columna = columna + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}