package EjerciciosUD7;

import java.util.*;

public class EJ5 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("auto", "elefante", "iglesia", "oso", "uva", "abeja");
        Map<Character, List<String>> mapa = filtrarPorVocal(palabras);

        for (Map.Entry<Character, List<String>> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
   public static Map<Character, List<String>> filtrarPorVocal (List<String> palabras) {
        Map<Character, List<String>> vocales = new HashMap<>();
        char [] vocal = {'a', 'e', 'i', 'o', 'u'};
        for (char inicial : vocal) {
            vocales.put(inicial, new ArrayList<>());
        }

        for (String palabra : palabras) {
            if (vocales.containsKey(palabra.toLowerCase().charAt(0))) {
                vocales.get(palabra.charAt(0)).add(palabra);
            }
        }
        return vocales;
   }
}
