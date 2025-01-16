package EjerciciosUD6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Ingresa 10 números: ");
        for (int i = 0; i < 10; i++) {
            lista.add(sc.nextInt());
        }
        System.out.println("Lista original: "+ lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }
}
