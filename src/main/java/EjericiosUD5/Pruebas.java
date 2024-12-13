package EjericiosUD5;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean condicion = true;

        while (condicion) {
            System.out.println("""
                Calculadora:
                1- Suma\s
                2- Resta\s
                3- Multiplicación\s
                4- División\s
                5- Resto\s
                6- Salir""");

            opcion = scanner.nextInt();


            switch (opcion) {

                case 1 -> {
                    System.out.println("Ingresa el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double num2 = scanner.nextDouble();

                    double suma = num1 + num2;
                    System.out.println("El resultado es: " + suma);
                }
                case 2 -> {
                    System.out.println("Ingresa el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double num2 = scanner.nextDouble();

                    double resta = num1 - num2;
                    System.out.println("La suma es: " + resta);
                }
                case 3 -> {
                    System.out.println("Ingresa el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double num2 = scanner.nextDouble();

                    double multi = num1 * num2;
                    System.out.println("El producto es: " + multi);
                }
                case 4 -> {

                    System.out.println("Ingresa el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double num2 = scanner.nextDouble();

                    if (num2 == 0) {
                        System.out.print("La división por cero no es posible.");
                    } else {
                        double div = num1 / num2;
                        System.out.println("La suma es: " + div);
                    }
                }
                case 5 -> {
                    System.out.println("Ingresa el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    double num2 = scanner.nextDouble();

                    double resto = num1 % num2;
                    System.out.println("La suma es: " + resto);
                }
                case 6 -> {
                    condicion = false;
                    System.out.println("SALISTE DE LA CALCULADORA");
                }
            }
        }
    }
}
