package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opción;
        System.out.println("Escribe un número: ");
        int num1 = scanner.nextInt();
        System.out.println("Escribe el 2do número: ");
        int num2 = scanner.nextInt();
        System.out.println("Escribe el 3er número: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El " + num1 + " es el mayor");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("El " + num2 + " es el mayor");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("El " + num3 + " es el mayor");
        }
    }
}

