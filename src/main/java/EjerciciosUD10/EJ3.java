package EjerciciosUD10;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] valores = new int [5];
        int cont = 0;

        while (cont != 5) {
            try {
                System.out.print("Ingresa un número: ");
                valores[cont] = sc.nextInt();
                cont++;
            } catch (Exception e) {
                System.out.println("Ingresa un número entero.");
                sc.next();
            }
        }
        System.out.print("Los valores del vector son: "+"\n"+mostrarVector(valores));
    }
    public static String mostrarVector (int [] valores) {
        String resultado = "";
        for (int i = 0; i < valores.length; i++) {
            if (i < valores.length - 1) {
                resultado += valores[i] + ", ";
            } else {
                resultado += valores[i];
            }
        }
        return resultado;
    }
}
