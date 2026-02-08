package com.davante.app.ej18;

/**
 *
 * 18. Convierte decimal a binario
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        int numeroDecimal = 13;
        int numeroOriginal = numeroDecimal;
        String binario = "";
        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 2;
            binario = resto + binario;
            numeroDecimal = numeroDecimal / 2;
        }
        System.out.println("Decimal: " + numeroOriginal);
        System.out.println("Binario: " + binario);
    }
}
