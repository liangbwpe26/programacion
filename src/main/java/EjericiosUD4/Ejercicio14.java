package EjericiosUD4;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INTRODUCE UN VALOR: ");
        double n = scanner.nextDouble();

        double suma = n * (n + 1) / 2;
        System.out.println("La suma de los "+ n + " primeros números naturales es: "+ suma);
    }
}
