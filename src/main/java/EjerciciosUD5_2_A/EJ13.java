package EjerciciosUD5_2_A;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lminf = 1, lmsup = 100, nmpensado = 0;
        String respuesta;
        System.out.print("Piensa en un número: ");
        int nm = sc.nextInt();

        while (nmpensado != nm) {
                nmpensado = (lminf + lmsup) / 2;
                if (nmpensado != nm) {
                    System.out.println("Tú número es: " + nmpensado + "?");
                    respuesta = sc.next();

                    if (respuesta.equals("mayor")) {
                        lminf = nmpensado;
                    } else if (respuesta.equals("menor")) {
                        lmsup = nmpensado;
                    }
                }

        }
        System.out.println("Tú número es " + nmpensado + "!");
        sc.close();
    }
}
