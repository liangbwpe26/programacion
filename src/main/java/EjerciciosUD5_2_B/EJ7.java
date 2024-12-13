package EjerciciosUD5_2_B;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantnotas, notas, media = 0, numtotal = 0, num;
        DecimalFormat df = new DecimalFormat("##.######");
        System.out.print("Introduce la cantidad de notas: ");
        cantnotas = sc.nextDouble();

        for (notas = 1; notas <= cantnotas; notas++) {
            System.out.print("Introduce la nota " + df.format(notas) +": " );
            num = sc.nextDouble();
            numtotal += num;
            media = numtotal / cantnotas;
        }
        System.out.print("La media de todas las notas es " + df.format(media));
    }
}
