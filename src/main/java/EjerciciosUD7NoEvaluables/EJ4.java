package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número (-1 es negativo, 0 es igual a 0 y 1 es positivo): ");
        int n = sc.nextInt();
        System.out.println(dimeSigno(n));
    }
    public static int dimeSigno(int a) {
        if (a < 0) {
            return -1;
        } else if (a == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
