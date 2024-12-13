package EjerciciosUD5_2_A;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduzca un número: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
