package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int número1 = scanner.nextInt();
        System.out.println("Introduce otro número: ");
        int número2 = scanner.nextInt();

        if (número1==número2) {
            System.out.println("El "+ número1 +" es igual a "+ número2);
        }
        else if (número1<número2) {
            System.out.println("El "+ número2 + " es mayor que "+ número1);
        }
        else {
            System.out.println("El "+ número1 + " es mayor que "+número2);
        }

    }
}

