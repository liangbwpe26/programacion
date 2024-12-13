package EjericiosUD4;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de empanadillas: ");
        double numempa = scanner.nextDouble();

        System.out.println("Introduce el número de napolitanas: ");
        double numnapo = scanner.nextDouble();

        double empa = 112;
        double napa = 75;

        double gramos = (numempa * empa) + (numnapo * napa);
        double kilos = gramos / 1000;

        System.out.println("El peso total es: "+ kilos + "kg");
    }
}
