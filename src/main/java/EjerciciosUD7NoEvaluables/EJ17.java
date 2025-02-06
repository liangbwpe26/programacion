package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("**** Es primo o no? ****");
        do {
            System.out.print("Ingrese un número: ");
            n = sc.nextInt();
            if (n == 0) {
                System.out.println("***Saliendo del programa***");
            } else if (primo(n)) {
                    System.out.println("El número es primo");
            } else {
                    System.out.println("El número no es primo");
            }
        } while (n != 0);
    }

    public static boolean primo(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
