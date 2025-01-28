package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el carácter: ");
        String caracter = sc.nextLine();
        System.out.print("Ingresa la altura: ");
        int altura = sc.nextInt();
        triangulo(caracter, altura);
    }
    public static void triangulo (String a, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}