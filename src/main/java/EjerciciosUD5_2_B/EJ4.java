package EjerciciosUD5_2_B;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int nm = sc.nextInt();
        int entero = Math.abs(nm);

        for (int i = 1; i <= entero; i++) {
            if (nm > 0) {
                System.out.print("*");
            } else {
                System.out.print("#");
            }
        }
        sc.close();
    }
}
