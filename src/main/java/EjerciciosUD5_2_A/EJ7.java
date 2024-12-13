package EjerciciosUD5_2_A;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese un número: ");
            int n = sc.nextInt();
            if (n < 0) {
                neg++;
            } else {
                pos++;
            }
        }
        System.out.println("Positivos = " + pos);
        System.out.println("Negativos = " + neg);
        sc.close();
    }
}

