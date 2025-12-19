package com.davante.app.ej08;

import java.util.Scanner;

/*
* 8. Convierte Celsius a Fahrenheit
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los grados Celsius");
        double celsius = sc.nextInt();

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + "º Celsius equivalen a " + fahrenheit + "º fahrenheit");
        sc.close();
    }
}
