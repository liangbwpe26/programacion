package EjerciciosUD5_2_A;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        int numero, pos= 0 , neg= 0;
        boolean numneg = false;
        Scanner sc = new Scanner(System.in);


        while (true) {
                System.out.print("Ingresa un número: ");
                numero = sc.nextInt();

                if (numero==0) {
                    break;
                } else if (numero<0){
                    numneg = true;
                    neg++;
                } else {
                    pos++;
                }
        }
        if (numneg) {
            System.out.println("Si hay números negativos.");
            System.out.println("Hay " + pos + " números postivos.");
            System.out.println("Hay " + neg + " números negativos.");
        } else {
            System.out.println("No hay números negativos.");
            System.out.println("Hay " + pos + " números postivos.");
        }
        sc.close();
    }
}
