package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS RÁPIDAS ===");

        // 1
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        NumberUtils.multiplicarLista(nums1, 10);
        System.out.println("1. Multiplicador: " + nums1);

        // 2
        ArrayList<String> strings2 = new ArrayList<>(Arrays.asList("Manzana", "Pera", "un taco rico"));
        boolean taco = StringUtils.filtroSelectivo(strings2, "M", 5);
        System.out.println("2. Filtro Selectivo: " + strings2 + " | ¿Hay taco?: " + taco);

        // 3
        ArrayList<String> strings3 = new ArrayList<>(Arrays.asList("java", "codigo"));
        System.out.println("3. Mayúsculas: " + StringUtils.convertirAMayusculas(strings3));

        // 4
        ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 4));
        System.out.println("4. Cuadrados Únicos: " + NumberUtils.obtenerCuadradosParesUnicos(nums4));

        // 5
        ArrayList<String> strings5 = new ArrayList<>(Arrays.asList("Gato", "Perro"));
        System.out.println("5. Mapa Longitudes: " + StringUtils.mapearLongitudes(strings5));

        // 6
        System.out.println("6. Modificador Inventario:");
        HashMap<String, Double> inv = new HashMap<>();
        inv.put("Teclado", 100.0);
        StringUtils.imprimirCatalogoConDescuento(inv);

        // 7
        ArrayList<String> repetidas = new ArrayList<>(Arrays.asList("sol", "luna", "sol"));
        HashMap<String, Integer> frec = StringUtils.contarFrecuencias(repetidas);
        System.out.println("7. Frecuencias: " + frec);

        // 8
        System.out.println("8. Palabras con frec < 2: " + StringUtils.filtrarPorFrecuencia(frec, 2));

        // 9
        System.out.println("9. Deduplicar Frase: " + StringUtils.deduplicarFrase("El rey es el rey", 3));

        // 10
        StringUtils.toparFrecuencias(frec, 1);
        System.out.println("10. Tope Frecuencias (Máx 1): " + frec);
    }
}