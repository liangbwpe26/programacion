package EjerciciosUD7;

import java.util.*;

public class EJ7 {
    public static void main(String[] args) {
        HashMap<String, Integer> valores = new HashMap<>();
        valores.put("", 15);
        valores.put("Plátanos", 0);
        valores.put("Peras", 30);
        valores.put("Naranjas", -10);
        valores.put("Manzanas", 50);

        List<String> errores = validarnventario(valores);

        System.out.println("El inventario contiene los siguientes errores:");
        for (String error : errores) {
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
