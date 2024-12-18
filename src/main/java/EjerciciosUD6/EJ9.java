package EjerciciosUD6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        final int SIZE = 100;

        int [] valores = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            valores[i] = (int) (1 + Math.random() * 10);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un valor: ");
        int valor = sc.nextInt();

        ArrayList<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            if (valores[i] == valor) {
                posiciones.add(i);
            }
        }

        if (posiciones.isEmpty()) {
            System.out.println("No existe el valor");
        } else {
            System.out.println("El valor " + valor + " esta en estas posiciones: " + posiciones);
        }
    }
}
