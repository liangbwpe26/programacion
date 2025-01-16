package EjerciciosUD6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class Ejercicio3Conjuntos {
    public static void main(String[] args) {
        TreeSet<Integer> conjunto = new TreeSet<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            conjunto.add(random.nextInt(100));
        }
        ArrayList<Integer> lista = new ArrayList<>(conjunto);
        lista.sort(Collections.reverseOrder());
        System.out.println("Colección de números: "+lista);
    }
}
