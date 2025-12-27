package com.davante.app.ej17;

/**
 *
 * 17. Intercambia dos variables
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int variableAuxiliar;
        
        variableAuxiliar = a;
        a = b;
        b = variableAuxiliar;
        
        System.out.println(a);
        System.out.println(b);
    }
}
