package EjerciciosUD6_1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4Mapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Liang26", "contraseña1234");
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();


            System.out.print("Contraseña: ");
            String contraseña = sc.nextLine();

            if (mapa.containsKey(usuario) && mapa.get(usuario).equals(contraseña)) {
                System.out.println("Has accedido al área restringida.");
                return;
            } else {
                intentos--;
                System.out.println("Usuario o contraseña incorrectos. Quedan " + intentos + " oportunidades");
            }
        }
        System.out.println("Lo siento, no tiene acceso al área restringida.");
    }
}
