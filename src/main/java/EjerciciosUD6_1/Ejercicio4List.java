package EjerciciosUD6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Ingresa 10 palabras: ");
        for (int i = 0; i < 10; i++) {
            lista.add(sc.next());
        }
        System.out.println("Lista original: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }
}
