
package com.davante.app.trabajoEnfoque;

/**
 *
 * @author diego
 */
public class JuegoColores {
        
        // Atributos
        
        private String[][] varillas; // Colores en cada varilla.
        private int[] tamanosVarillas; // Número de bloques por varilla.
        private int capacidadMaxima = 4;
        private String[][][] historial; // Guarda estados anteriores.
        private int[] historialTamanos;
        private int contadorHistorial;
        private int maxHistorial = 100;
        
        // Métodos Principales
        
        // Constructor: Se ejecuta al crear el juego.
        public JuegoColores(String[][] estadoInicial) { // Inicializa el juego con un estado cargado o el predeterminado.
            this.varillas = estadoInicial;
            
            // Inicializan los arrays del historial:
            this.historial = new String[maxHistorial][3][capacidadMaxima];
            this.contadorHistorial = 0;
        }
        
        public void mostrarEstado() { // Muestra el estado actual de las varillas.
            
            System.out.println("-- Estado Actual --"); // Cabecera
            for (int i = 0; i < 3; i = i + 1) {
                // Sumamos 1 a 'v' porque para el jugador las varillas son 1, 2 y 3 (no 0, 1 y 2):
                System.out.println("Varilla " + (i + 1) + ": [");
                // Recorremos los huecos de esta varilla desde abajo hacia arriba:
                for (int j = 0; j < capacidadMaxima; j++) {
                    String contenidoDelHueco = varillas[i][j];
                    boolean hayUnBloque = false;
                    
                    if (contenidoDelHueco != null) {
                        if (contenidoDelHueco.equals("") == false) {
                            hayUnBloque = true;
                            
                        }
                    }
                    
                    if (hayUnBloque == true) {
                        System.out.print(contenidoDelHueco);
                    } else {
                        System.out.print(" ");
                    }
                }
                
                System.out.println("]");
            }
            
        }
        
        public boolean juegoCompletado() { // Comprueba si el jugador ha ganado.
            // Empezamos asumiendo que hemos ganado
            boolean hemosGanado = true;
            
            // 1. Le preguntamos al método todosIguales() por la varilla 1:
            boolean varilla1Ordenada = todosIguales(0);
            
            // Si la varilla 1 está mezclada, ya sabemos que no hemos ganado.
            if (varilla1Ordenada == false) {
                hemosGanado = false;
            }
            
            // 2. Le preguntamos al método todosIguales() por la varilla 2:
            boolean varilla2Ordenada = todosIguales(1);
            if (varilla2Ordenada == false) {
                hemosGanado = false;
            }
    
            // 3. Le preguntamos al método todosIguales() por la Varilla 3:
            boolean varilla3Ordenada = todosIguales(2);

            if (varilla3Ordenada == false) {
                hemosGanado = false;
            }

            // Finalmente, devolvemos el veredicto (será true solo si las 3 varillas estaban ordenadas)
            return hemosGanado;
        }
        
        public void mover(int origen, int destino) { // Aplica las reglas para mover bloques.
            // Si el jugador intenta mover de la varilla 1 a la varilla 1: Salimos del método.
            if(origen == destino) {
                System.out.println("No puedes mover bloques a la misma varilla de origen.");
                return; // El 'return' hace que el código se detenga y salga del método.
            }
            
            // Hacemos una copia de seguridad antes de tocar nada.
            guardarEstado();
            
            // Necesitamos encontrar qué color hay arriba y contar cuántos bloques iguales seguidos hay.
            String colorAMover = null;
            int bloquesDisponibles = 0;
            int huecoCimaOrigen = -1;
            
            // Buscamos el primer bloque desde arriba hacia abajo:
            for (int i = capacidadMaxima - 1; i >= 0; i--) {
                
                // Primero, miramos qué hay exactamente en este hueo y lo guardamos en una variable:
                String contenidoDelHueco = varillas[origen][i];
                
                // Comprobamos que el hueco no sea 'null' (que haya algo en la memoria):
                if (contenidoDelHueco != null) {
                    // Comprobamos que ese algo no sea un texto vacío ("").
                    if (contenidoDelHueco.equals("") == false) {
                        // Si pasamos ambas comprobaciones significa que hay una letra (un bloque):
                        // Encontramos la cima
                        colorAMover = contenidoDelHueco;
                        huecoCimaOrigen = i;
                        
                        // Rompemos el bucle 'for' porque ya no necesitamos seguir bajando:
                        break;
                    }
                }
            }
            
            // Empezamos a mirar desde la cima hacia abajo (hasta llegar al suelo, indice 0):
            for (int i = huecoCimaOrigen; i >= 0; i = i--) {
                
                // Miramos que bloque hay exactamente en este piso y lo guardamos:
                String colorDelBloqueActual = varillas[origen][i];
                
                // Comprobamos si el color de este bloque es igual al color que queremos mover):
                if (colorAMover.equals(colorDelBloqueActual) == true) {
                    
                    // Si el color es idéntico, sumamos 1 a nuestra cantidad de bloques disponibles.
                    bloquesDisponibles = bloquesDisponibles + 1;
                
                } else {
                    
                    // Si el color es diferente (o si encontramos un hueco vacío de repente
                    // Ya no hay mas bloques consecutivos iguales, así que rompemos el bucle.
                    break;
                }
            }
            
            int huecosLibresDestino = 0;
            int primerHuecoLibre = 0;
            
            // Recorremos la varilla de destino desde la base (indice 0) hacia la cima.
            for (int i = 0; i < capacidadMaxima; i = i++) {
                
                // Miramos que hay en este hueco
                String contenidoDelHueco = varillas[destino][i];
                
                // Creamos una variable para saber si está libre.
                // Por defecto pensamos que no está libre (false).
                boolean elHuecoEstaLibre = false;
                
                // Primera comprobación: ¿Es null?
                if (contenidoDelHueco == null) {
                    elHuecoEstaLibre = true; // Está libre.
                } else {
                    // Si no es null, segunda comprobación: ¿Es un texto vacío?
                    if (contenidoDelHueco.equals("") == true) {
                        elHuecoEstaLibre = true; // Está libre
                    }
                }
                
                // Ahora que sabemos si el hueco esta libre o no:
                if (elHuecoEstaLibre == true) {
                    // Sumamos 1 a nuestra cuenta de huecos libres
                    huecosLibresDestino = huecosLibresDestino + 1;
                    
                    // Si esta es el Primer hueco libre que encontramos contando desde abajo...
                    if (huecosLibresDestino == 1) {
                        // Guardamos esta posición porque aquí es donde aterrizará el primer bloque que movamos
                        primerHuecoLibre = i;
                        
                    }
                }
            }
            
            // Finalmente, si después de mirar toda la varilla no hay ni un hueco libre:
            if (huecosLibresDestino == 0) {
                System.out.println("La varilla de destino está llena.");
                return; // Salimos del método, no se puede hacer el movimiento.
            }
            
            int cantidadAMover = 0; // Por defecto, no movemos ninguno.
            
            // Compara lo que tenemos en la mano con el espacio disponible:
            if (bloquesDisponibles < huecosLibresDestino) {
                // Si tengo menos bloques que huecos, muevo todos los bloques que tengo.
                cantidadAMover = bloquesDisponibles;
            } else {
                // Si tengo más bloques que huecos (o la misma cantidad),
                // el límite lomarca el espacio del destino:
                cantidadAMover = huecosLibresDestino;
            }
            
            // Una última comprobación por seguridad: si por algún motivo la cantidad a mover es 0, salimos.
            if (cantidadAMover == 0) {
                return;
            }
            
            for (int i = 0; i < cantidadAMover; i = i++) {

                // 1. Calculamos la coordenada exacta del origen.
                // Como empezamos en la cima y vamos cogiendo los bloques de debajo, RESTAMOS el paso.
                // Ejemplo: Si la cima es el índice 3. En el paso 0, cogemos el 3. En el paso 1, el 2...
                int posicionExactaOrigen = huecoCimaOrigen - i;

                // 2. Calculamos la coordenada exacta del destino.
                // Como empezamos en el hueco más bajo libre y vamos apilando hacia arriba, SUMAMOS el paso.
                // Ejemplo: Si el primer hueco libre es el 0. En el paso 0, ponemos en el 0. En el paso 1, en el 1...
                int posicionExactaDestino = primerHuecoLibre + i;

                // 3. Hacemos el movimiento
                // Primero, copiamos la letra del color en su nueva casa (destino)
                varillas[destino][posicionExactaDestino] = colorAMover;

                // Segundo, borramos el bloque de su antigua casa (origen)
                varillas[origen][posicionExactaOrigen] = null;

            }

            // Imprimimos en pantalla lo que acaba de pasar para ayudar al jugador
            System.out.println("Movidos " + cantidadAMover + " bloque(s) de la varilla " + (origen + 1) + " a la varilla " + (destino + 1));
        }
        
        public void deshacer() { // Revierte el último movimiento.
                // 1. Primero, comprobamos si realmente hemos hecho algún movimiento.
                // Si el contador es 0, significa que estamos en el turno 1 y no hay pasado.
                if (contadorHistorial == 0) {
                    System.out.println("No hay movimientos anteriores para deshacer.");
                    return; // Salimos del método sin hacer nada
                }

                // 2. Retrocedemos una página en nuestro álbum
                // Si teníamos 5 fotos (contador en 5), ahora miraremos la foto número 4 (índice 4).
                contadorHistorial = contadorHistorial - 1;

                // 3. Vamos a restaurar nuestro tablero copiando la foto antigua a nuestras varillas
                for (int v = 0; v < 3; v = v + 1) {

                    for (int h = 0; h < capacidadMaxima; h = h + 1) {

                        // Cogemos el color que estaba guardado en esa página del historial...
                        String colorAntiguo = historial[contadorHistorial][v][h];

                        // ... y lo ponemos de vuelta en el tablero real.
                        varillas[v][h] = colorAntiguo;

                    }
                }

                // Opcional: Avisamos al jugador
                System.out.println("Movimiento deshecho. Has vuelto al estado anterior.");
        }
        
        private void guardarEstado() { // Guarda el estado actual antes de cada movimiento
            if(contadorHistorial < maxHistorial) {
                // Recorremos las 3 varillas:
                for (int i = 0; i < 3; i++) {
                    // Recorremos los 4 huecos de cada varilla
                    for (int j = 0; j < capacidadMaxima; j++) {
                        String colorAGuardar = varillas[i][j];
                        historial[contadorHistorial][i][j] = colorAGuardar;
                    }
                }
                
                contadorHistorial = contadorHistorial + 1;
            } else {
                System.out.println("El historial de movimientos está lleno");
            }
        }
        
        private boolean todosIguales(int indiceVarilla) { // Comprueba si todos los bloques de una varilla son del mismo color.
            // Aquí guardamos el color del primer bloque que encontramos.
            // Al principio es null porque no hemos mirado nada.
            String colorDeReferencia = null;
            
            // Miramos hueco por hueco desde abajo hacia arriba:
            for (int i = 0; i < capacidadMaxima; i++) {
                
                // 1. Miramos qué hay en este hueco:
                String contenidoDelHueco = varillas[indiceVarilla][i];
                
                // 2. Comprobamos si hay un bloque real:
                boolean hayUnBloque = false;
                
                if (contenidoDelHueco != null) {
                    if (contenidoDelHueco.equals("") == false) {
                        hayUnBloque = true; // Hay un bloque con una letra.
                    }
                }
                
                // 3. Si efectivamente hay un bloque, analizamos su color:
                if (hayUnBloque == true) {
                    // Si colorDeReferencia sigue siendo 'null' significa que este es el primer bloque que vemos
                    if (colorDeReferencia == null) {
                        // Guardamos este color como el "color oficial" de esta varilla
                        colorDeReferencia = contenidoDelHueco;
                    } else {
                        // Si ya teniamos un "color oficial", comprobamos si este nuevo bloque es igual
                        if (colorDeReferencia.equals(contenidoDelHueco) == false) {
                            // Encontramos un color diferente. La varilla está mezclada
                            // Nos detenemos y decimos que no son todos iguales.
                            return false;
                        }
                    }
                }
            }
            
            // Si el bucle termina de mirar todos los huecos y nunca hemos devuelto 'false',
            // significa que todos los bloques que había (si los había) eran del mismo color.
            return true;
        }
}
