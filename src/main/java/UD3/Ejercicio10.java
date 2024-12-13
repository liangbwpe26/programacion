package UD3;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nota10 = false;

        System.out.println("Introduce un número del 1 al 10, inserta -1 cuando acabes: ");

        while (true){
            System.out.print("Introduce una nota: ");
            int nota = scanner.nextInt();

            if (nota==-1){
            break;
            }

            if (nota==10){
                nota10 = true;
            }

            if (nota>10){
                System.out.println("Una nota del 1 al 10");
            }
        }

        if (nota10==true) {
            System.out.println("Entre las notas introducidas hay al menos una nota de 10");
        } else {
            System.out.println("No hay un nota de 10 entre las notas introducidas");
        }
        scanner.close();
    }
}
