package com.davante.app.tema1011;

/**
 *
 * @author diego
 */
public class Alumno extends Persona {
    
    // Atributos
    private int notas;
    
    // Métodos

    public Alumno(int notas) {
        this.notas = notas;
    }

    public Alumno(int notas, String nombre, int edad) {
        super(nombre, edad);
        this.notas = notas;
    }
    
    // Getters
    public int getNotas() {
        return notas;
    }
    
    // Setter
    public void setNotas(int notas) {
        this.notas = notas;
    }    
    
    @Override
    public void saludar(){
        System.out.println("Hola soy un alumno");
    }
}
