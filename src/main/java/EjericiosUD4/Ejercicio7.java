package EjericiosUD4;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce la base: ");
    double b = scanner.nextDouble();

    System.out.print("Introduce la altura: ");
    double h = scanner.nextDouble();

    double a = (b * h) / 2.0;
    System.out.println("El área de un triángulo isósceles es: "+ a);
    }
}