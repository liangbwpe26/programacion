package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Multiplicación: "+multiplica(n1, n2));
    }
    public static double multiplica(double a, double b) {
        return a * b;
    }
}
