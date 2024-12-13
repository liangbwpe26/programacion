package EjerciciosUD5_2_B;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
           if (i % 2 == 0) {
                System.out.print(i + "\t\t");
            }
        }
        sc.close();
    }
}
