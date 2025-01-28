package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        tablaDeMultiplicar(n);
    }
    public static void tablaDeMultiplicar (int a) {
        System.out.println("Tabla de multiplicar");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a*i));
        }
    }
}
