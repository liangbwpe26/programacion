package EjericiosUD5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        DecimalFormat decimalFormat = new DecimalFormat("##");
        
        if (num1==num2) {
            System.out.println("Los números son iguales. Finalizando el programa.");

        } else  {
            
            boolean entero1 = num1 % 1 == 0;
            boolean entero2 = num2 % 1 == 0;

            if (entero1 && entero2) {
                System.out.println("Números enteros: " + num1 + ", " + num2);

            } if (!entero1 && !entero2) {
                System.out.println("Ninguno de los números es entero.");

            } else {
                if (entero1) {
                    System.out.println("Números enteros: " + num1);
                }
                if (entero2) {
                    System.out.println("Números enteros: " + num2);
                }
            }
        }
    }
}
