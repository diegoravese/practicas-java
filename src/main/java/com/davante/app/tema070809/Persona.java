package com.davante.app.tema070809;

/**
 * @author Diego
 * @version 1.0
 */

public class Persona {

    // Atributos - Variables

    private String nombre;
    private int edad;
    private String apellido;
    private int altura;

    // Funcionalidades - Métodos

    // Constructores
    // Constructor por defecto:
    public Persona() {
        nombre = "Sin nombre";
        apellido = "Sin apellido";
        edad = 0;
        altura = 0;
    }

    // Constructor por parámetros:
    public Persona(String nombre, String apellido, int edad, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }

    // Constructor por copia
    public Persona(Persona miPersona){
        this.nombre = miPersona.getNombre();
        this.apellido = miPersona.getApellido();
        this.edad = miPersona.getEdad();
        this.altura = miPersona.getAltura();
    }

    // Getters - Observadores

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }


    // Setters - Modificadores
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    // Métodos personalizados
    public void saludar() {
        System.out.println("Hola soy una persona");
    }
}