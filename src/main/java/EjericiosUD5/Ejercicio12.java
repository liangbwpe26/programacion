package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();
        char inicial = nombre.toUpperCase().charAt(0);

        System.out.print("¿Cuál es tu género (H o M)? ");
        char genero = scanner.nextLine().toUpperCase().charAt(0);

        if ((genero == 'M' && inicial <= 'M') || (genero == 'H' && inicial >= 'N')) {
            System.out.println("Tu grupo es A");
        } else {
            System.out.println("Tu grupo es B");
        }
    }
}