package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = scanner.nextInt();

        if (num>=0) {
            System.out.println(num +" es positivo");
        }  else {
            System.out.println(num +" es negativo");
        }

    }
}
