package EjericiosUD4;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double barrasfrescas = 1.20;
        double barrasnofrescas = 0.60;

        System.out.print("INTRODUCE EL NUMERO DE BARRAS FRESCAS: ");
        double barrasf = scanner.nextDouble();

        System.out.print("INTRODUCE EL NUMERO DE BARRAS NO FRESCAS: ");
        double barrasnf = scanner.nextDouble();

        double ingresofr = barrasf * barrasfrescas;
        double ingresonf = barrasnf * barrasnofrescas;

        double ingresototal = ingresofr + ingresonf;
        System.out.println("El ingreso total es: "+ ingresototal);
    }
}
