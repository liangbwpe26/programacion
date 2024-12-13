package EjericiosUD4;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INTRODUCE EL RADIO DEL CONO: ");
        double r = scanner.nextDouble();

        System.out.print("INTRODUCE LA ALTURA DEL CONO: ");
        double h = scanner.nextDouble();

        double volumen = (1.0 / 3) * Math.PI*Math.pow(r,2)* h;
        System.out.print("EL VOLUMEN ES: "+ volumen);
    }
}


