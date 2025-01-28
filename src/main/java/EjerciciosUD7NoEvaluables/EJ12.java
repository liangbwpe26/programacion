package EjerciciosUD7NoEvaluables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Introduce los kilometros: ");
        double kilometros = sc.nextDouble();
        System.out.println("Las millas son: "+df.format(kilometros_a_millas(kilometros)));
    }
    public static double kilometros_a_millas(double kilometros) {
        return kilometros / 1.609;
    }
}
