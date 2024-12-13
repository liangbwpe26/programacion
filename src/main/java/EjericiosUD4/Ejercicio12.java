package EjericiosUD4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INTRODUCE EL PRECIO REAL: ");
        double precioreal = scanner.nextDouble();

        System.out.println("INTRODUCE EL PRECIO: ");
        double precio = scanner.nextDouble();

        double desc = ((precioreal - precio) / precioreal) * 100;
        DecimalFormat f = new DecimalFormat("##.##");
        System.out.println("El descuento es: "+ f.format(desc)+ "%");
    }
}
