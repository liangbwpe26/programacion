package EjericiosUD4;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las millas marinas: ");
        int millas = scanner.nextInt();

        int metros = millas * 1852;
        System.out.println("Los metros de las millas marinas son: "+ metros);
    }
}
