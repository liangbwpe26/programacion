package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int x = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        int y = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        int z = sc.nextInt();

        if (ecuaPitagoras(x,y,z)) {
            System.out.println("La ecucación de pitágoras es correcta.");
        } else {
            System.out.println("La ecucación de pitágoras es incorrecta.");
        }
    }
    public static boolean ecuaPitagoras (int x, int y, int z) {
        return (x * x) + (y * y) == (z * z);
    }
}
