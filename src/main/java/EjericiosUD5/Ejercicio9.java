package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseña = "thebest";

        System.out.println("Introduce la contraseña: ");
        String password = scanner.nextLine();

        if (password.equalsIgnoreCase(contraseña)) {
            System.out.println("La contraseña es correcta");
        } else {
            System.out.println("La contraseña es incorrecta");
        }
    }
}

