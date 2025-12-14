/**
 * Implementación de la clase Entrada presentada por F. M. Pérez Montes
 * en su libro "Ejercicios de Programación en Java"
 */

package com.eduinnova.lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Clase utilitaria para la lectura de datos desde la entrada estándar.
 * Proporciona métodos estáticos para leer diferentes tipos de datos
 * con validación y manejo de errores mejorado.
 *
 * @author Leo Borai
 * @version 2.0
 */
public final class Entrada {

    /** Scanner único para toda la aplicación para evitar problemas de recursos */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Constructor privado para evitar la instanciación de la clase utilitaria.
     */
    private Entrada() {
        throw new UnsupportedOperationException(
            "Esta es una clase utilitaria y no debe ser instanciada"
        );
    }

    /**
     * Lee una cadena de texto desde la entrada estándar.
     *
     * @return la cadena leída, nunca null (cadena vacía si hay error)
     */
    public static String cadena() {
        try {
            return scanner.nextLine();
        } catch (Exception e) {
            System.err.println("Error al leer entrada: " + e.getMessage());
            return "";
        }
    }

    /**
     * Lee una cadena no vacía desde la entrada estándar.
     *
     * @return la cadena no vacía leída
     */
    public static String cadenaNoVacia() {
        String valor;
        do {
            valor = cadena().trim();
            if (valor.isEmpty()) {
                System.out.print(
                    "ERROR: Se requiere una cadena no vacía. Inténtalo de nuevo: "
                );
            }
        } while (valor.isEmpty());
        return valor;
    }

    /**
     * Lee un entero desde la entrada estándar con validación.
     *
     * @return el entero leído
     */
    public static int entero() {
        return leerNumero(Integer::parseInt, "un número entero");
    }

    /**
     * Lee un entero dentro de un rango específico.
     *
     * @param min valor mínimo permitido (inclusive)
     * @param max valor máximo permitido (inclusive)
     * @return el entero leído dentro del rango
     */
    public static int entero(int min, int max) {
        int valor;
        do {
            valor = entero();
            if (valor < min || valor > max) {
                System.out.printf(
                    "ERROR: El valor debe estar entre %d y %d. Inténtalo de nuevo: ",
                    min,
                    max
                );
            }
        } while (valor < min || valor > max);
        return valor;
    }

    /**
     * Lee un entero largo (long) desde la entrada estándar con validación.
     *
     * @return el entero largo leído
     */
    public static long enteroLargo() {
        return leerNumero(Long::parseLong, "un número entero largo");
    }

    /**
     * Lee un número real (float) desde la entrada estándar con validación.
     *
     * @return el float leído
     */
    public static float real() {
        return leerNumero(Float::parseFloat, "un número real");
    }

    /**
     * Lee un número real de doble precisión (double) desde la entrada estándar con validación.
     *
     * @return el double leído
     */
    public static double realDoble() {
        return leerNumero(
            Double::parseDouble,
            "un número real de doble precisión"
        );
    }

    /**
     * Lee un carácter individual desde la entrada estándar.
     *
     * @return el carácter leído
     */
    public static char caracter() {
        String valor;
        do {
            valor = cadena().trim();
            if (valor.length() != 1) {
                System.out.print(
                    "ERROR: Se requiere exactamente un carácter. Inténtalo de nuevo: "
                );
            }
        } while (valor.length() != 1);
        return valor.charAt(0);
    }

    /**
     * Lee un valor booleano desde la entrada estándar.
     * Acepta: true/false, sí/no, s/n, y/n, 1/0
     *
     * @return el valor booleano leído
     */
    public static boolean booleano() {
        String valor;
        do {
            valor = cadena().trim().toLowerCase();
            switch (valor) {
                case "true", "sí", "si", "s", "y", "yes", "1":
                    return true;
                case "false", "no", "n", "0":
                    return false;
                default:
                    System.out.print(
                        "ERROR: Se requiere true/false, sí/no, s/n, y/n, o 1/0. Inténtalo de nuevo: "
                    );
            }
        } while (true);
    }

    /**
     * Método genérico para leer números con validación.
     *
     * @param <T> tipo del número a leer
     * @param parser función que convierte String al tipo deseado
     * @param tipoEsperado descripción del tipo esperado para mensajes de error
     * @return el número leído y validado
     */
    private static <T extends Number> T leerNumero(
        NumberParser<T> parser,
        String tipoEsperado
    ) {
        T valor;
        boolean leido = false;
        do {
            try {
                String entrada = cadena().trim();
                valor = parser.parse(entrada);
                leido = true;
            } catch (NumberFormatException e) {
                System.out.printf(
                    "ERROR: Se esperaba %s. Inténtalo de nuevo: ",
                    tipoEsperado
                );
                valor = null; // Para satisfacer el compilador
            }
        } while (!leido);
        return valor;
    }

    /**
     * Interfaz funcional para parsear números.
     *
     * @param <T> tipo del número
     */
    @FunctionalInterface
    private interface NumberParser<T> {
        T parse(String s) throws NumberFormatException;
    }

    /**
     * Cierra el scanner al finalizar la aplicación.
     * Debe llamarse al final del programa principal.
     */
    public static void cerrar() {
        if (scanner != null) {
            scanner.close();
        }
    }

    /**
     * Versión alternativa usando BufferedReader (manteniendo compatibilidad con el código original).
     * Útil si se prefiere no usar Scanner.
     */
    public static class BufferedVersion {

        private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        private BufferedVersion() {
            throw new UnsupportedOperationException(
                "Esta es una clase utilitaria y no debe ser instanciada"
            );
        }

        public static String cadena() {
            try {
                String valor = reader.readLine();
                return valor != null ? valor : "";
            } catch (IOException e) {
                System.err.println("Error de E/S: " + e.getMessage());
                return "";
            }
        }

        public static void cerrar() {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println(
                    "Error al cerrar el BufferedReader: " + e.getMessage()
                );
            }
        }
    }
}
