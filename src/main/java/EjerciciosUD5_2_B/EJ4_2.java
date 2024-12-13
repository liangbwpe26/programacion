package EjerciciosUD5_2_B;

import java.util.Scanner;

public class EJ4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        if (n == 0) System.out.print("");

        for (int i = 1; i <= n; i++) {
            if (i>0) System.out.print("*");
        }
        for (int i = 0; i >= n; i--) {
            if (i<0) System.out.print("#");
        }
        sc.close();
    }
}
