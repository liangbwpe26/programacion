package EjericiosUD4;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INTRODUCE UN NÚMERO: ");
        double numero1 = scanner.nextDouble();

        System.out.print("INTRODUCE OTRO NÚMERO: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        System.out.println("La suma es: "+ suma);

        double resta = numero1 - numero2;
        System.out.println("La resta es: "+ resta);

        double multi = numero1 * numero2;
        System.out.println("La multiplicación es: "+ multi);

        if (numero2==0){
            System.out.println("La división entre 0 no es posible");

        }else {
            double div = numero1 / numero2;
            System.out.println("La división es: "+ div);
        }
    }
}
