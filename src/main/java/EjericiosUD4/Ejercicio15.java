package EjericiosUD4;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INTRODUCE LAS HORAS: ");
        double horas = scanner.nextDouble();

        System.out.print("INTRODUCE LAS TARIFA: ");
        double tarifa = scanner.nextDouble();


        double salario = horas * tarifa;
        System.out.println("El salario en bruto es: "+ salario);

        double impuesto = ((salario * 15) / 100);
        double salarioFinal = salario - impuesto;
        System.out.println("El salario en neto es: "+ salarioFinal);

    }
}
