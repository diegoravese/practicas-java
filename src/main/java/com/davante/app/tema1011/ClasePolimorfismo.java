package com.davante.app.tema1011;

/**
 *
 * @author diego
 *
public class ClasePolimorfismo {
   public static void main(String[] args) {
       
       // Creamos un array de tipo Persona
       Persona[] arrayPersonas = new Persona[3]; // [Persona0][Persona1][Persona2]
       
       Profesor javi = new Profesor; // [Profesor] estático
       
       Persona a = new Alumno; // [Persona] - Polimorfismo dinámico
       
       // Creamos Profesores y Alumnos
       arrayPersonas[0] = new Profesor(7000, "Javi", 40);
       arrayPersonas[1] = new Alumno(10, "Alumno1", 30);
       arrayPersonas[2] = new Alumno(8, "Alumno2", 25);
       
       // Accedemos a los distintos elementos del array
       for (Persona persona : arrayPersonas) { // Foreach
           
           if (persona instanceof Profesor) {
               
               Profesor profesorTemp = (Profesor) persona; // Casting -> Transformamos la Persona en un Profesor.
               System.out.println("Profesor: " + profesorTemp.getNombre() + ", Sueldo: " + profesorTemp.getSueldo());
           
           } else if (persona instanceof Alumno) {
               
               Alumno alumnoTemp = (Alumno) persona; // Casting -> Transformamos la Persona en un Alumno.
               System.out.println("Alumno: " + alumnoTemp.getNombre() + ", Notas: " + alumnoTemp.getNotas());
           
           }
       }
       
   }
}
* 
* */
