package com.davante.app.tema1011;

/**
 *
 * @author diego
 */
public class Profesor extends Persona implements Movimiento {
    
    // Atributos
    private int sueldo;
    
    // Métodos
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

    // Métodos personalizados
    @Override
    public void saludar() {
        System.out.println("Hola soy un profesor");
    }

    @Override
    public void andar() {
        System.out.println("Estoy andando");
    }

    @Override
    public void sentarse() {
        System.out.println("Estoy sentado");
    }

    @Override
    public void saltar() {
        System.out.println("Estoy Saltando");
    }
}
