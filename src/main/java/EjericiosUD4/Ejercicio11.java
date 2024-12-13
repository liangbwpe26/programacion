package EjericiosUD4;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INTRODUCE EL RADIO: ");
        double r = scanner.nextDouble();

        double longi = 2 * Math.PI * r;
        System.out.println("La longitud de la circunferencia es: "+ longi);

        double arcir = Math.PI*Math.pow(r,2);
        System.out.println("El área del círculo es: "+ arcir);

        double volesf = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        System.out.println("El volumen de la esfera es: "+ volesf);

    }
}
