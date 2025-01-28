package EjerciciosUD7NoEvaluables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double [] precios = new double [5];
        System.out.print("Ingresa 5 precios: ");
        for (int i = 0; i < precios.length; i++) {
            precios[i] = sc.nextDouble();
        }
        System.out.println("Precios con IVA: ");
        for (double precio : precios) {
            System.out.println(df.format(precioConIVA(precio)));
        }
    }
    public static double precioConIVA(double precio) {
        return precio + (precio * 0.21);
    }
}
