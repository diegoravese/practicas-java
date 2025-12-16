package com.davante.app.tema07;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        /** PROGRAMACION ORIENTADA A OJETOS
         * 
         * Principios de la POO:
         * 
         * Abstracción
         * Encapsulamiento
         * Herencia
         * Polimorfismo
         * 
        **/

        Persona p = new Persona(); // Llamar al constructor por defecto

        Persona diego = new Persona("Diego", "Ravese", 30, 175); // Llamar al constructor por parámetros

        p.setNombre("Solange");

        System.out.println(p.getNombre());
        System.out.println(diego.getNombre());
    }
}
