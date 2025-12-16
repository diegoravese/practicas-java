package com.davante.app.tema07;

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

    // Getters & Setters - Observadores y Modificadores

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
}
