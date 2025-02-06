package EjerciciosUD7ConjuntosNoEvaluables;

import java.util.*;

public class EJ1 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Juan");
        nombres.add("Juan");
        nombres.add("Mateo");
        nombres.add("Lionel");
        nombres.add("Ronaldo");
        nombres.add("Luka");

        System.out.println("Lista original: " + nombres);
        System.out.println("Lista sin repeticiones: "+eliminaRepeticiones(nombres));
    }
    public static List<String> eliminaRepeticiones(List<String> lista) {
        Set<String> set = new HashSet<>(lista);
        return new ArrayList<>(set);
    }
}
