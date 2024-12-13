package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa otro número: ");
        int num2 = scanner.nextInt();

        if (num1>num2) {
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println(num2 + ", " + num1);
        }
    }
}
