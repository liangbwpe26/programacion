package EjericiosUD4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la inversión: ");
        double inversion = scanner.nextDouble();

        System.out.println("Introduce el interés anual: ");
        double interesAnual = scanner.nextDouble();

        System.out.println("Introduce el número de meses: ");
        double meses = scanner.nextDouble();

        double años = meses / 12;


        DecimalFormat f = new DecimalFormat("##.##");
        double capfinal = inversion * Math.pow((1.0 + (interesAnual / 100)), años);
        System.out.println("El capital final es: "+ f.format(capfinal) + "€");

    }
}
