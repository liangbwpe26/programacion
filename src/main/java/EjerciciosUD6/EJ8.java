package EjerciciosUD6;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 100;

        double [] valores = new double[SIZE];

        for (int i = 0; i < SIZE; i++) {
            valores[i] = Math.random();
        }

        System.out.print("Ingresa un valor real: ");
        double valor = sc.nextDouble();

        int cont = 0;
        for (int i = 0; i < SIZE; i++) {
            if (valores[i] >= valor) {
                cont++;
            }
        }
        System.out.print("La cantidad de valores mayores o iguales a " + valor + " es: " + cont);
        sc.close();
    }
}
