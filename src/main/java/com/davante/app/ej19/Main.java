package com.davante.app.ej19;

/**
 *
 * 19. Calcula el interés simple
 * @author diego
 */
public class Main {

    public static void main(String[] args) {

        double capital = 1000.0;
        double tasa = 5.0;
        double tiempo = 2.0;

        double interes;

        interes = (capital * tasa * tiempo) / 100;

        System.out.println("Capital: " + capital);
        System.out.println("Tasa: " + tasa + " %");
        System.out.println("Tiempo: " + tiempo + " años");
        System.out.println("Interés simple: " + interes);
    }
}

