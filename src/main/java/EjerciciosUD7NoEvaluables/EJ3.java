package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el primer número: ");
        int n2 = sc.nextInt();
        System.out.print("El número menor es "+ minimo(n1, n2));
    }
    public static int minimo(int a, int b) {
        return Math.min(a, b);
    }
}
