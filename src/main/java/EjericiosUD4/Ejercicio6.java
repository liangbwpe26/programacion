package EjericiosUD4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INTRODUCE EL LADO DEL CUADRADO: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        System.out.println("El área es: "+ area);
    }

}
