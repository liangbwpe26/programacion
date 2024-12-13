package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su renta anual: ");
        double renta = scanner.nextDouble();

        if (renta<= 0) {
            System.out.println("El renta no puede ser mayor que 0");
        } else if (renta<10000) {
            System.out.println("Tú tipo impositivo es el 5%");
        } else if (renta<20000) {
            System.out.println("Tú tipo impositivo es el 15%");
        } else if (renta<35000) {
            System.out.println("Tú tipo impositivo es el 20%");
        } else if (renta<60000) {
            System.out.println("Tú tipo impositivo es el 30%");
        } else {
            System.out.println("Tú tipo impositivo es el 45%");
        }
    }
}