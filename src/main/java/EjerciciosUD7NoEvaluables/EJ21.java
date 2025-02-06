package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("******Circunferencia, área y volumen*******");
            System.out.println("1- Circunferencia");
            System.out.println("2- Área");
            System.out.println("3- Volumen");
            System.out.println("4- Salir");
            System.out.print("Ingresa un opcion: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1: {
                    System.out.print("Ingresa el radio: ");
                    int r = sc.nextInt();
                    System.out.println(circunferencia(r));
                    System.out.println("\n");
                    break;
                }
                case 2: {
                    System.out.print("Ingresa el radio: ");
                    int r = sc.nextInt();
                    System.out.println(area(r));
                    System.out.println("\n");
                    break;
                }
                case 3: {
                    System.out.print("Ingresa el radio: ");
                    int r = sc.nextInt();
                    System.out.println(volumen(r));
                    System.out.println("\n");
                    break;
                }
                case 4: {
                    System.out.println("Saliendo del programa");
                    break;
                }
            }
        } while (menu != 4);
    }
    public static double circunferencia (double r) {
        return 2 * Math.PI * r;
    }
    public static double area (double r) {
        return Math.PI * r * r;
    }
    public static double volumen (double r) {
        return (4/3) * Math.PI * (r * r * r);
    }
}
