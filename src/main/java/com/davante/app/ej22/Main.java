package com.davante.app.ej22;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * 22. Elimina duplicados de una lista
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        List<String> listaOriginal = Arrays.asList("A", "B", "A", "C", "B");
        List<String> listaSinDuplicados = new ArrayList<>();

        // 1. Recorremos la lista original elemento por elemento
        for (String elemento : listaOriginal) {
            
            // 2. Preguntamos: ¿Mi nueva lista YA tiene este elemento?
            if (!listaSinDuplicados.contains(elemento)) {
                
                // 3. Si NO lo tiene, lo agrego. Si ya lo tiene, no hago nada.
                listaSinDuplicados.add(elemento);
            }
        }

        System.out.println("Lista limpia: " + listaSinDuplicados);
    }
}