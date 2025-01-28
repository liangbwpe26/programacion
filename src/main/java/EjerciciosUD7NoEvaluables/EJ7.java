package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ancho, alto;
        System.out.println("Ingrese el ancho y el alto: ");
        ancho = sc.nextDouble();
        alto = sc.nextDouble();
        System.out.println("Perimetro: " + perimetroRectangulo(ancho, alto));
        System.out.println("Área: "+ areaRectangulo(ancho, alto));
    }
    public static double perimetroRectangulo(double ancho, double alto) {
        return 2 * (ancho * alto);
    }

    public static double areaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }
}
