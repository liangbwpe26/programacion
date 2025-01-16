package EjerciciosUD6_1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2Conjuntos {
    public static void main(String[] args) {
        ArrayList<Integer> listaAleatoria = new ArrayList<>();
        final int tamanoLista = 10;
        for (int i = 0; i < tamanoLista; i++) {
            listaAleatoria.add((int) (Math.random()*101));
        }

        System.out.print("Lista original: "+ listaAleatoria);
        Collections.sort(listaAleatoria, Collections.reverseOrder());
        System.out.print("\nLista ordenada decrecientemente: "+ listaAleatoria);
    }
}
