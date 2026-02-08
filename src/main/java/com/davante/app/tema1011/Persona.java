
package com.davante.app.tema1011;

/**
 *
 * @author diego
 */
public class Persona {
    
    // Atributos
    private String nombre;
    private int edad;
    
    // Métodos

    // Constructor por defecto
    public Persona() {
        nombre = "Sin nombre";
        edad = 0;
    }
    
    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    // Métodos personalizados
    
    public void saludar(){
        System.out.println("Hola soy una persona");
    }
    
       
}
