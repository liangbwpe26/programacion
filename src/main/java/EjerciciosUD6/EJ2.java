package EjerciciosUD6;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        double [] nums = new double [SIZE];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingresa un número: ");
            nums[i] = sc.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }
        System.out.println("La suma de los números ingresados es: "+ suma);
        sc.close();
    }
}
