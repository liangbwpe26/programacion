package EjerciciosUD6_1;

import java.util.*;

public class Ejercicio2Mapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<Integer>> mapa = new HashMap<>();

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {

            if(!mapa.containsKey(palabras[i])) {
                mapa.put(palabras[i], new ArrayList<>());
            }
            mapa.get(palabras[i]).add(i);
        }
        System.out.println("Posiciones de las palabras: ");
        for (Map.Entry<String, ArrayList<Integer>> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }
    }
}