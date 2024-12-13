package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número decimal: ");
        double num = sc.nextDouble();

        int parteEnt = (int) num;

        if (parteEnt%2==0) {
            System.out.println("El número es par");

        } else {
            System.out.println("El número es impar");
        }
    }
}
