package EjerciciosUD5_2_B;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, cantPares = 0;

        System.out.print("Introduce N1: ");
        n1 = sc.nextInt();
        System.out.print("Introduce N2: ");
        n2 = sc.nextInt();

        while (n1 > n2) {
            System.out.print("N2 debe ser mayor a N1, vuelve a introducirlo: ");
            n2 = sc.nextInt();
        }
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                cantPares++;
            }
            if (i == n2) {
                System.out.print(i);
            }
            else {
                System.out.print(i + " - ");
            }
        }
        System.out.println();
        System.out.print("La cantidad de pares es: " + cantPares);
        sc.close();
    }
}
