package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StringUtils {

    // 2. El Filtro Selectivo
    public static boolean filtroSelectivo(ArrayList<String> lista, String letra, int minLength) {
        boolean tieneTaco = lista.stream().anyMatch(s -> s.contains("taco"));
        lista.removeIf(s -> s.startsWith(letra) || s.length() < minLength);
        return tieneTaco;
    }

    // 3. Conversor de Mayúsculas
    public static ArrayList<String> convertirAMayusculas(ArrayList<String> palabras) {
        return palabras.stream().map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));
    }

    // 5. Mapa de Longitudes
    public static HashMap<String, Integer> mapearLongitudes(ArrayList<String> palabras) {
        return palabras.stream().distinct().collect(Collectors.toMap(p -> p, String::length, (a, b) -> a, HashMap::new));
    }

    // 6. Modificador de Inventario
    public static void imprimirCatalogoConDescuento(HashMap<String, Double> inventario) {
        inventario.forEach((prod, precio) -> System.out.printf("- %s: $%.2f%n", prod, precio * 0.90));
    }

    // 7. Contador de Frecuencias
    public static HashMap<String, Integer> contarFrecuencias(ArrayList<String> palabras) {
        HashMap<String, Integer> mapa = new HashMap<>();
        palabras.forEach(p -> mapa.merge(p, 1, Integer::sum));
        return mapa;
    }

    // 8. Clasificador de Palabras
    public static ArrayList<String> filtrarPorFrecuencia(HashMap<String, Integer> frecuencias, int max) {
        return frecuencias.entrySet().stream()
                .filter(e -> e.getValue() < max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 9. Deduplicación de Palabras
    public static HashSet<String> deduplicarFrase(String frase, int minLength) {
        return Arrays.stream(frase.split("\\W+"))
                .filter(w -> w.length() >= minLength)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // 10. El Tope de Frecuencias (Uso ingenioso de Math.min)
    public static void toparFrecuencias(HashMap<String, Integer> frecuencias, int tope) {
        frecuencias.replaceAll((k, v) -> Math.min(v, tope));
    }
}
