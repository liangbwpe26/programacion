package EjerciciosUD6;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa P: ");
        int p = sc.nextInt();
        System.out.print("Ingresa Q: ");
        int q = sc.nextInt();

        if (q<p) {
            System.out.println("P debe ser mayor que el valor Q");
        }
        else {
            int [] array = new int [q - p + 1];

            for (int i = 0; i < array.length; i++) {
                array[i] = p + i;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
