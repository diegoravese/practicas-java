
package com.davante.app.trabajoEnfoque;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class JuegoManager {
    
    // Atributos
    
    private Scanner sc; // Para leer comandos del usuario.
    private JuegoColores juego; // Representa el estado del juego.
    
    // Métodos Principales
    
    public JuegoManager(Scanner sc, String[][] estadoInicial) { // Inicializa el juego con un estado cargado o el predeterminado.
        this.sc = sc;
        this.juego = new JuegoColores(estadoInicial);
    }
    
    public void iniciarJuego() { // Ejecuta el bucle principal mostrando el estado y procesando los comandos.
        mostrarBienvenida();
        // Creamos una variable para saber cuándo debemos detener el bucle.
        // Al principio, el juego no ha terminado asi que es 'false'.
        boolean juegoTerminado = false;
        // Arrancamos el bucle principal.
        // Se repetirá mientras 'juegoTerminado' siga siendo 'false'.
        while (juegoTerminado == false) {
            // Mostramos como está el tablero actualmente:
            juego.mostrarEstado();
            // Pedimos al jugador que haga algo y procesamos su orden:
            boolean elJugadorQuiereSalir = procesarComando();
            if (elJugadorQuiereSalir == true) {
                juegoTerminado = true;
            } else {
                boolean victoriaConseguida = verificarVictoria();
                if (victoriaConseguida = true) {
                    juegoTerminado = true;
                }
            }
        }
    }
    
    private void mostrarBienvenida() { // Muestra instrucciones iniciales.
        System.out.println("=== JUEGO DE TORRES DE COLORES ===");
        System.out.println("Mueve los bloques de colores entre las varillas.");
        System.out.println("Comandos: número de origen y destino | D=deshacer | S=salir");
    }
    
    private boolean verificarVictoria() { // Comprueba si el juego ha sido completado.
        boolean elJugadorHaGanado = juego.juegoCompletado();
        if (elJugadorHaGanado == true) {
            System.out.println("¡Has completado el juego! Cada varilla contiene un único color");
            return true; // Devolvemos true para avisar que el juego debe terminar.
        } else {
            return false; // Si la respuesta es false, el juego continúa.
        }
    }
    
    private boolean procesarComando() { // Interpreta la acción del jugador. S, D, o Movimiento.
        // Mostramos mensaje para pedir la varilla de origen o el comando:
        System.out.println("Selecciona la Varilla de Origen (1 - 3 | D = deshacer | S = salir");
        // Leemos lo que el usuario escribe y lo guardamos en una variable:
        String entrada = sc.next();
        // Pasamos la entrada a mayúsculas para que 's' y 'S' funcionen igual:
        String entradaMayuscula = entrada.toUpperCase();
        
        // Si el usuario quiere salir:
        if (entradaMayuscula.equals("S") == true) {
            System.out.println("Saliendo del juego...");
            return true; // Devolvemos true para indicar al bucle principal que termine.
        }
        // Si el usuario quiere deshacer:
        if (entradaMayuscula.equals("D") == true) {
            juego.deshacer();
            return false; // el juego no termina.
        }
        
        // El usuario introduce un número:
        procesarMovimiento(entradaMayuscula);
        
        // Despues de un movimiento el juego continua:
        return false;
    }
    
    private void procesarMovimiento(String comandoOrigen) { // Llama a JuegoColores.mover() tras leer el destino.
        // 1. Intentamos convertir el texto del origen a un número entero
        // Usamos un bloque try-catch para evitar que el programa explote si escriben "hola"
        try {
            int origenUsuario = Integer.parseInt(comandoOrigen);

            // 2. Pedimos la varilla de destino
            System.out.print("Selecciona la Varilla de destino (1-3): ");
            int destinoUsuario = sc.nextInt();

            // 3. Ajuste de índices: El usuario usa 1, 2, 3 pero Java usa 0, 1, 2
            int origenReal = origenUsuario - 1;
            int destinoReal = destinoUsuario - 1;

            // 4. Validación de rango: Comprobamos que los números estén entre 0 y 2
            boolean origenValido = false;
            if (origenReal >= 0) {
                if (origenReal <= 2) {
                    origenValido = true;
                }
            }

            boolean destinoValido = false;
            if (destinoReal >= 0) {
                if (destinoReal <= 2) {
                    destinoValido = true;
                }
            }

            // 5. Si todo es correcto, le damos la orden al cerebro
            if (origenValido == true) {
                if (destinoValido == true) {
                    juego.mover(origenReal, destinoReal);
                } else {
                    System.out.println("Error: La varilla de destino debe ser 1, 2 o 3.");
                }
            } else {
                System.out.println("Error: La varilla de origen debe ser 1, 2 o 3.");
            }

        } catch (Exception e) {
            // Si Integer.parseInt falla porque no era un número, avisamos al usuario
            System.out.println("Comando no reconocido. Introduce 1-3, D o S.");
        }
    }
}
