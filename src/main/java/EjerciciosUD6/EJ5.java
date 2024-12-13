package EjerciciosUD6;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 20;
        double [] nums = new double [SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Ingresa un número: ");
            nums[i] = sc.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < SIZE; i++) {
            suma += nums[i];
        }
        double media = suma / SIZE;

        System.out.print("La media de los valores es: " + media);
    }
}
