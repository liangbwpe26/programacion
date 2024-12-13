package EjerciciosUD6;

import java.util.Scanner;

public class B_ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int euros, centimos;

        System.out.print("Ingresa el precio del producto: ");
        String Precio = sc.nextLine();

        // Dividir el precio entre euros y centimos a partir de la coma
        String [] dividir = Precio.split(",");

        euros = Integer.parseInt(dividir[0]);
        centimos = Integer.parseInt(dividir[1]);

        System.out.println("Euros: " + euros);
        System.out.println("Centimos: " + centimos);
    }
}
