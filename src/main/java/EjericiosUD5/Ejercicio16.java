package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una nota del 1 al 10: ");
        double nota = scanner.nextDouble();

        if (nota<0 || nota>10) {
            System.out.println("Ingresa una nota del 1 al 10");
        } else if (nota<3) {
            System.out.println("Tù nota es: Muy deficiente");
        } else if (nota<5) {
            System.out.println("Tú nota es: Deficiente");
        } else if (nota<6) {
            System.out.println("Tú nota es: Bien");
        } else if (nota<9) {
            System.out.println("Tú nota es: Notable");
        } else {
            System.out.println("Tú nota es: Sobresaliente");
        }
    }
}
