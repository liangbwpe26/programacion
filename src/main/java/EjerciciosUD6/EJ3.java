package EjerciciosUD6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] num = new double [10];
        System.out.print("Ingresa un número: ");
        double menor , mayor;
        DecimalFormat df = new DecimalFormat("##.###########");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextDouble();
        }

        mayor = num[0];
        menor = num[0];

        for (int i = 0; i < 10; i++) {
            if (mayor<num[i]) {
                mayor= num[i];
            } else if (menor>num[i]) {
                menor = num[i];
            }
        }
        System.out.println("El número mayor es "+ df.format(mayor) + " y el número menor es " + df.format(menor));
        sc.close();
    }
}
