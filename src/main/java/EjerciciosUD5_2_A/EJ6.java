package EjerciciosUD5_2_A;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hayN = false;
        for (int i = 1; i<=100; i++) {
            System.out.print("Escribe un número: ");
            int n = sc.nextInt();

            if (n<0) {
                hayN = true;
            }
        }
        if (hayN) {
            System.out.println("Hay un número negativo");
        } else {
            System.out.println("No hay un número negativo");
        }
        sc.close();
    }
}
