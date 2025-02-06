package EjerciciosUD7;

import java.util.*;

public class EJ7 {
    public static void main(String[] args) {
        HashMap<String, Integer> inventario = new HashMap<>();
        inventario.put("", 15);
        inventario.put("Plátanos", 0);
        inventario.put("Peras", 30);
        inventario.put("Naranjas", -10);
        inventario.put("Manzanas", 50);

        HashMap<String, Integer> inventario2 = new HashMap<>();
        inventario2.put("Uvas", 15);
        inventario2.put("", -5);
        inventario2.put("Peras", 101);
        inventario2.put("Naranjas", -10);
        inventario2.put("Manzanas", 50);

        List<String> errores = validarnventario(inventario);
        List<String> errores2 = validarnventario(inventario2);

        System.out.println("El inventario contiene los siguientes errores:");
        for (String error : errores) {
            System.out.println("-> " + error);
        }
        System.out.println("\nEl inventario 2 contiene los siguientes errores:");
        for (String error : errores2) {
            System.out.println("-> " + error);
        }
    }

   public static List<String> validarnventario (HashMap<String, Integer> valores) {
        List<String> lista = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : valores.entrySet()) {
            if (entry.getKey().isEmpty()) {
                lista.add("Nombre invalido para un producto con cantidad: " + entry.getValue());
            }
            if (entry.getValue() < 0 || entry.getValue() > 100) {
                lista.add("Cantidad invalida para producto: '" + entry.getKey()+"'");
            }
        }
        return lista;
    }
}
