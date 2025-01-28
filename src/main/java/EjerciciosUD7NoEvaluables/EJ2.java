package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        if (mayorEdad(sc.nextInt())) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    }
    public static boolean mayorEdad (int edad) {
        return edad >= 18;
    }
}
