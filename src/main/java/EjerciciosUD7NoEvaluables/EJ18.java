package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dninum;
        System.out.print("Ingrese el DNI: ");
        String dni = sc.nextLine();
        if (dni.length() > 8) {
            System.out.println("El DNI solo puede tener 8 dígitos");
        } else {
            dninum = Integer.parseInt(dni);
            System.out.println(dninum+"-"+ NIF(dninum));
        }

    }
    public static char NIF (int n) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int NIFnum = n % 23;
        return letras[NIFnum];
    }
}
