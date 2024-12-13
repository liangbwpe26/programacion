package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual tù edad? ");
        int edad = scanner.nextInt();

        if (edad<= 4) {
            System.out.println("La entrada es gratis.");
        } else if (edad<=17) {
            System.out.println("La entrada vale 5€.");
        } else {
            System.out.println("La entrada vale 10€.");
        }
    }
}
