package EjerciciosUD5_2_B;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, mult=0, n;
        System.out.print("Introduce un número: ");
        n = sc.nextInt();

        for (cont = 1; cont <= n; cont++){
            if (cont % 3 == 0){
                mult++;
            }
        }
        System.out.println("Cantidad de múltiplos de 3: " + mult);
        sc.close();
    }
}
