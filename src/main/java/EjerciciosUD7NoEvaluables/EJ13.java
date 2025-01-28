package EjerciciosUD7NoEvaluables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio original: ");
        double precioOriginal = sc.nextDouble();
        System.out.print("Introduce el precio con descuento: ");
        double precioDescuento = sc.nextDouble();

        System.out.println("El porcentaje del descuento es " + descuento(precioOriginal, precioDescuento) + "%");
    }
    public static String descuento (double a, double b) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format((a - b) / a * 100);
    }
}
