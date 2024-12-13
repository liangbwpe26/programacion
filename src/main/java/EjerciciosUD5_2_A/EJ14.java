package EjerciciosUD5_2_A;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero, bil500 = 0, bil200 = 0, bil100 = 0,
                bil50 = 0, bil20 = 0, bil10 = 0, bil5 = 0;

        System.out.print("Introduce la cantidad de billetes (Mútiplo de 5): ");
        dinero = sc.nextInt();

        if (dinero % 5 != 0) {
            System.out.println("Intruduce un mútiplo de 5 ");
        }
            while (dinero > 0) {
                if (dinero >= 500) {
                    bil500++;
                    dinero = dinero - 500;
                } else if (dinero >= 200) {
                    bil200++;
                    dinero = dinero - 200;
                } else if (dinero >= 100) {
                    bil100++;
                    dinero = dinero - 100;
                } else if (dinero >= 50) {
                    bil50++;
                    dinero = dinero - 50;
                } else if (dinero >= 20) {
                    bil20++;
                    dinero = dinero - 20;
                } else if (dinero >= 10) {
                    bil10++;
                    dinero = dinero - 10;
                } else if (dinero >= 5) {
                    bil5++;
                    dinero = dinero - 5;
                }
            }

            if (bil500 > 0) System.out.println("Necesitas " + bil500 + " billetes de 500");
            if (bil200 > 0) System.out.println("Necesitas " + bil200 + " billetes de 200");
            if (bil100 > 0) System.out.println("Necesitas " + bil100 + " billetes de 100");
            if (bil50 > 0) System.out.println("Necesitas " + bil50 + " billetes de 50");
            if (bil20 > 0) System.out.println("Necesitas " + bil20 + " billetes de 20");
            if (bil10 > 0) System.out.println("Necesitas " + bil10 + " billetes de 10");
            if (bil5 > 0) System.out.println("Necesitas " + bil5 + " billetes de 5");


    }
}
