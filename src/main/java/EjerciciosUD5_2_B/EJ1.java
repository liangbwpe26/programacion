package EjerciciosUD5_2_B;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();
        int mitad = palabra.length() / 2;

        for (int i = 0; i < mitad; i++) {
            System.out.println(palabra);
        }

    }
}
