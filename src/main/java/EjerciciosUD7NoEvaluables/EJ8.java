package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println(suma1aN(numero));
        System.out.println(producto1aN(numero));
        System.out.println(intermedio1aN(numero));
    }
    public static int suma1aN(int n) {
        return n += n;
    }
    public static int producto1aN(int n) {
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= n;
        }
        return producto;
    }
    public static double intermedio1aN(int n) {
        return (1 + n) / 2.0;
    }
}
