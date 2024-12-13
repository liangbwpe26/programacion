package EjerciciosUD5_2_A;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        boolean nota10 = false;
        double nota = 0;
        Scanner sc = new Scanner(System.in);

        while (nota != -1) {
            System.out.print("Ingresa una nota (Del 1 al 10): ");
            nota = sc.nextDouble();
            if (nota != -1) {
                if (nota < 1 || nota > 10) {
                    System.out.println("Ingresa una nota válida.");
                } else if (nota == 10) {
                    nota10 = true;
                }
            }
        }
        if (nota10) {
            System.out.println("Hay una nota 10 entre las notas introducidas.");
        } else {
            System.out.println("No hay una nota 10 entre las notas introducidas.");
        }
        sc.close();
    }
}
