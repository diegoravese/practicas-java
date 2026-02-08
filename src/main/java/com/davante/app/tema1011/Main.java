package com.davante.app.tema1011;

/**
 *
 * Tema 10 - 11 - Herencia y Mecanismos de Abstracción basados en Herencia
 * @author diego
 */
public class Main {
    
    public static void main(String[] args) {
        
        Persona p = new Persona("Manolo", 40);
        Profesor miProfesor = new Profesor(5000, "Javi", 30);
        Alumno miAlumno = new Alumno(8, "Diego", 20);
        
        System.out.println(p.getNombre());
        p.saludar();
        
        System.out.println(miProfesor.getNombre());
        System.out.println(miProfesor.getSueldo());
        miProfesor.saludar();
        
        System.out.println(miAlumno.getNombre());
        System.out.println(miAlumno.getNotas());
        miAlumno.saludar();
        
    }
}
