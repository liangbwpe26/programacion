package EjerciciosUD5_2_A;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        double potencia=1, n1, n2;

        System.out.print("Ingresa la base: ");
        n1 = sc.nextDouble();
        System.out.print("Ingresa la potencia: ");
        n2 = sc.nextDouble();

        for (int i = 1; i <= n2; i++) {

            if (n2 == 0) {
                potencia = 1;
            } else {
                potencia = potencia * n1;
            }
        }
        System.out.println(df.format(potencia));
        sc.close();
    }
}
