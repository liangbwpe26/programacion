package EjerciciosUD6_1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5Mapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("móvil", "phone");
        diccionario.put("ratón","mouse");
        diccionario.put("cabello","hair");
        diccionario.put("cargador","charger");
        diccionario.put("teclado","keyboard");
        diccionario.put("silla","chair");
        diccionario.put("mesa","table");
        diccionario.put("escritorio","desk");
        diccionario.put("lápiz","pencil");
        diccionario.put("bolígrafo","pen");
        diccionario.put("plátano","banana");
        diccionario.put("portátil","laptop");
        diccionario.put("ventana","window");
        diccionario.put("puerta","door");
        diccionario.put("árbol","tree");
        diccionario.put("pared","wall");
        diccionario.put("jugador","player");
        diccionario.put("docente","teacher");
        diccionario.put("decano","principal");
        diccionario.put("techo","roof");

        System.out.print("Introduce una palabra en español: ");
        String palabra = sc.nextLine();

        if (diccionario.containsKey(palabra.toLowerCase())) {
            System.out.println(palabra+" en inglés es: " + diccionario.get(palabra.toLowerCase()));
        } else {
            System.out.println("Lo siento, no conozco esa palabra.");
        }
    }
}