package EjerciciosUD7NoEvaluables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("***Conversor de Millas a Kilometros*** ");
        System.out.print("Ingresa las millas: ");
        int millas = sc.nextInt();
        System.out.println("Los kilometros son "+df.format(millas_a_kilometros(millas)) + "km.");
    }
    public static double millas_a_kilometros(int millas) {
        return millas * 1.609344;
    }
}
