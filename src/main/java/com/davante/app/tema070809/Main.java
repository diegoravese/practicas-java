package com.davante.app.tema070809;

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

        Persona p = new Persona(); // Llamar al constructor por defecto (Instanciar)

        Persona diego = new Persona("Diego", "Ravese", 30, 175); // Llamar al constructor por parámetros (Instanciar)

        p.setNombre("Solange");
        p.setApellido("Guevara"); // Modificamos el atributo desde fuera de la Clase

        System.out.println(p.getNombre());
        System.out.println(diego.getNombre());

        Persona p2 = new Persona(p);

        p2.setNombre("Juan");
        p2.setApellido("Torres");
        
        System.out.println(p2.getNombre() + " " + p2.getApellido());

        diego.saludar();
    }
}
