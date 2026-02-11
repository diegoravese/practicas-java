
package com.davante.app.ej21;

/**
 *
 * 21. Comprueba si un año es bisiesto
 * @author diego
 */
public class Main {
    
    public static boolean esBisiesto(int anio) {
        // El operador % obtiene el resultado de la división
        return (anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0));
    }
    
    public static void main(String[] args) {
        int anio = 2026;
        
        if (esBisiesto(anio)) {
            System.out.println(anio + " es bisiesto");
        } else {
            System.out.println(anio + " no es bisiesto");
        }
    }
}