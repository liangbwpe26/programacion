package EjerciciosUD7NoEvaluables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double [] precios = new double [5];
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Ingresa el precio " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }
        System.out.println("Precios con IVA: ");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio " + (i + 1) + ": "+df.format(precioConIVA(precios[i])));
        }
    }
    public static double precioConIVA(double precio) {
        return precio + (precio * 0.21);
    }
}
