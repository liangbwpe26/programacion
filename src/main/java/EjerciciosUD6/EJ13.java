package EjerciciosUD6;

import java.util.Arrays;
import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa V: ");
        int v = sc.nextInt();
        System.out.print("Ingresa I: ");
        int i = sc.nextInt();
        System.out.print("Ingresa el número de valores: ");
        final int n = sc.nextInt();
        int [] valores = new int[n];

        for (int k = 0 ; k < n; k++) {
            valores[k] = v;
            v += i;

        }

        // Imprimir todos los valores del array
        System.out.println(Arrays.toString(valores));
    }
}