package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intoduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Intoduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Intoduce el tercero número: ");
        int num3 = sc.nextInt();

        int max2 = valorMaximo(num1, num2);
        int max3 = valorMaximo(max2, num3);
        System.out.print("El número mayor es "+ max3);
    }
    public static int valorMaximo (int a, int b) {
        return Math.max(a, b);
    }
}