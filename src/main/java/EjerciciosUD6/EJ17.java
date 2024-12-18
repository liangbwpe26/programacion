package EjerciciosUD6;

import java.util.Arrays;
import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] valores1 = new int [10];
        int [] valores2 = new int [10];

        System.out.println("Introduce 20 valores: ");
        for (int i = 0; i < valores1.length; i++) {
            valores1[i] = sc.nextInt();
        }
        for (int i = 0; i < valores2.length; i++) {
            valores2[i] = sc.nextInt();
        }

        if (Arrays.equals(valores1, valores2)) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays son diferentes");
        }
        sc.close();
    }
}
