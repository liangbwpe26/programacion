package EjerciciosUD5_2_B;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu año de nacimiento: ");
        int nacimiento = sc.nextInt(), edad = 0;

        if (nacimiento > 2024) {
            System.out.print("La edad no puede ser mayor a 2024");
        } else {
            while (nacimiento < 2024) {
                nacimiento++;
                edad++;
                System.out.println("Has cumplido " + edad + " años");
            }
            sc.close();
        }
    }
}
