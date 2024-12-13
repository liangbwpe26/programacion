package EjerciciosUD6;

import java.util.Arrays;

public class EJ14 {
    public static void main(String[] args) {
        // Suma desde 1 hasta 10
        int nummax = 10 * (10 + 1) / 2;
        int [] valores = new int [nummax];
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                valores[contador] = i;
                contador++;
            }
        }
        System.out.println(Arrays.toString(valores));
    }
}
