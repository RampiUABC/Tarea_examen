package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class NumberUtils {

    // 1. El Multiplicador
    public static void multiplicarLista(ArrayList<Integer> numeros, int factor) {
        numeros.replaceAll(n -> n * factor);
    }

    // 4. Cuadrados Únicos
    public static HashSet<Integer> obtenerCuadradosParesUnicos(ArrayList<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));
    }
}
