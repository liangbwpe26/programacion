package EjerciciosUD6;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] n = new int [20];
        int pos = 0, neg = 0;
        System.out.println("Ingrese número: ");
        for (int i = 0; i < 20; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (n[i] > 0) {
                pos += n[i];
            } else {
                neg += n[i];
            }
        }
        System.out.println("La suma de los positivos es: " + pos);
        System.out.println("La suma de los negativos es " + neg);
        sc.close();
    }
}
