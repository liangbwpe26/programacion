package EjericiosUD4;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("INTRODUCE LA INVERSIÓN: ");
    double inv = scanner.nextDouble();

    double interes = 0.04;
    DecimalFormat format = new DecimalFormat("##.00");

    double año1 = inv * (1 + interes);
    System.out.println("El año 1 es: "+ format.format(año1));

    double año2 = año1 * (1 + interes);
    System.out.println("El año 2 es: "+ format.format(año2));

    double año3 = año2 * (1 + interes);
    System.out.println("El año 3 es: "+ format.format(año3));
    }
}
