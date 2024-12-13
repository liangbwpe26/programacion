package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        double edad = scanner.nextDouble();

        System.out.println("Ingresa tus ingresos mensuales: ");
        double ingresos = scanner.nextDouble();

        if (edad>=16 && ingresos>=1000) {
            System.out.println("Tienes que tributar.");
        } else {
            System.out.println("No tienes que tributar");
        }
    }
}
