package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del array: ");
        int tamano = sc.nextInt();
        int[] array = new int[tamano];
        valoresAleatorios(array);

        for (int valores : array) {
            System.out.print(valores + " ");
        }
    }
    public static void valoresAleatorios (int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
    }
}
