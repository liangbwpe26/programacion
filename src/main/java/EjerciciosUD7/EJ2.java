package EjerciciosUD7;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();
        System.out.print("Ingresa la longitud de referencia: ");
        int longitud = sc.nextInt();

        int [] longitudes = contarPorLongitud(frase, longitud);

        System.out.println("Palabras de longitud igual: " + longitudes[0]);
        System.out.println("Palabras de longitud menor: " + longitudes[1]);
        System.out.println("Palabras de longitud mayor: " + longitudes[2]);
    }
    public static int[] contarPorLongitud(String frase, int longitudrefe) {
        String [] palabras = frase.split(" ");
        int [] longitudes = new int[3];

        for (String palabra : palabras) {
            if (palabra.length() == longitudrefe) {
                longitudes[0] = longitudes[0]+ 1;
            }
            if (palabra.length() < longitudrefe) {
                longitudes[1] = longitudes[1]+ 1;
            }
            if (palabra.length() > longitudrefe) {
                longitudes[2] = longitudes[2]+ 1;
            }
        }
        return longitudes;
    }
}
