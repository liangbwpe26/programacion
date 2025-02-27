package EjerciciosUD10;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        boolean entry= false;
        int division;

        while (!entry) {
            try {
                System.out.print("Introduces el valor A: ");
                a = sc.nextInt();
                entry = true;
            } catch (Exception e) {
                System.out.println("Ingresa un valor correcto.");
                sc.next();
            }
        }

        entry= false;

        while (!entry) {
            try {
                System.out.print("Introduces el valor B: ");
                b = sc.nextInt();
                entry = true;
            } catch (Exception e) {
                System.out.println("Ingresa un valor correcto.");
                sc.next();
            }
        }
        try {
            division = a / b;
            System.out.println("El cociente de A y B es: " + division);
        } catch (ArithmeticException e) {
            System.out.println("La división entre cero no es posible.");
        }
    }
}
