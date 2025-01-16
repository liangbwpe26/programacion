package EjerciciosUD6_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejercicio2List {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        for (int i = 0; i < (int) (Math.random()*21); i++) {
            lista1.add((int) (Math.random()*101));
        }
        int sumaTotal = 0;
        for (int numero : lista1) {
            sumaTotal += numero;
        }
        Collections.sort(lista1);
        int minimo = lista1.get(0);
        int maximo = lista1.get(lista1.size()-1);
        int media = sumaTotal / lista1.size();
        String mostrarLista = lista1.toString();
        System.out.println("Lista generada: " + mostrarLista);
        System.out.println("La suma total es: " + sumaTotal);
        System.out.println("La media es: " + media);
        System.out.println("El mínimo es: " + minimo);
        System.out.println("El máximo es: " + maximo);
    }
}
