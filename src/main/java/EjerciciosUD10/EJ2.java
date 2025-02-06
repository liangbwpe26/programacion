package EjerciciosUD10;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        int division;

        do {
            try {
                System.out.print("Introduce el valor A: ");
                a = sc.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Ingresa un número correcto.");
            }
        } while (a == 0);

        try {
            System.out.print("Introduce el valor B: ");
            b = sc.nextInt();

        } catch (Exception e) {
            System.out.println("Ingresa un número correcto.");
        }

        division= a / b;
        System.out.println("La división es: "+ division);
    }
}
