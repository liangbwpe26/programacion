package EjericiosUD4;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el dividendo: ");
        double dividendo = scanner.nextDouble();

        System.out.println("Introduce el divisor: ");
        double divisor = scanner.nextDouble();

        double cociente = dividendo / divisor;
        double resto = dividendo % divisor;

        System.out.println(dividendo + " entre " + divisor + " da un cociente de " + cociente + " y un resto " + resto + " ");

    }
}
