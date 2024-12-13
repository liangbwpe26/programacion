package EjerciciosUD6;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los números ingresados son: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: " + numeros[i]);
        }
        sc.close();
    }
}
