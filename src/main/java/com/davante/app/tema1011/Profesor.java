package com.davante.app.tema1011;

/**
 *
 * @author diego
 */
public class Profesor extends Persona {
    
    // Atributos
    private int sueldo;
    
    // Métodos
    public Profesor(int sueldo) {
        this.sueldo = sueldo;
    }

    public Profesor(int sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }
    
    // Getters
    public int getSueldo() {
        return sueldo;
    }
    
    // Setters
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public void saludar(){
        System.out.println("Hola soy un profesor");
    }    
}
