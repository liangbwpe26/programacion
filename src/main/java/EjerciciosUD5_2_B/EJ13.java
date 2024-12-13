package EjerciciosUD5_2_B;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();

        System.out.print("Introduce el carácter de relleno: ");
        char character = sc.next().charAt(0);

        for (int i = 1; i <= altura; i++) {

            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print(character);
            }
            System.out.println();
        }
        sc.close();
    }
}
