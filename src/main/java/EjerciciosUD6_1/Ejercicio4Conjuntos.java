package EjerciciosUD6_1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ejercicio4Conjuntos {
    public static void main(String[] args) {
        Collection<Integer> conjunto = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            conjunto.add((int) (Math.random() * 11));
        }
        System.out.println(conjunto);

    }
}
