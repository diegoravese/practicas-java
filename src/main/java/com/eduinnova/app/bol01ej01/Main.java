package com.eduinnova.app.bol01ej01;

import com.eduinnova.lib.Entrada;

public class Main {

    public static void main(String[] args) {
        double a, b, c;
        double x1, x2, d;

        System.out.println("Introduzca primer coeficiente (a):");
        a = Entrada.entero();

        System.out.println("Introduzca segundo coeficiente: (b):");
        b = Entrada.entero();

        System.out.println("Introduzca tercer coeficiente: (c):");
        c = Entrada.entero();

        d = ((b * b) - 4 * a * c); // ax^2+bx+c=0

        if (d < 0) {
            System.out.println("No existen soluciones reales");
            return;
        }

        if (a == 0) {
            System.out.println("División por cero");
        }

        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println("Solución: " + x1);
        System.out.println("Solución: " + x2);
    }
}
