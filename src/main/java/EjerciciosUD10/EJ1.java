package EjerciciosUD10;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos=3;
        int valor;

        while (intentos != 0) {
            try {
                System.out.print("Introduce un valor: ");
                valor = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();
                intentos--;
                if (intentos == 0) {
                    System.out.print("");
                } else if (intentos == 1) {
                    System.out.println("Te quedan "+intentos+" intento");
                } else {
                System.out.println("Te quedan "+intentos+" intentos");
                }
            }
        }
        if (intentos == 0) {
            System.out.println("Te quedaste sin intentos.");
        } else {
            System.out.println("Valor introducido correcto.");
        }
    }
}
