package UD3;

public class Ejercicio11 {
    public static void main(String[] args) {
        int sum_par= 0;
        int sum_impar= 0;

        for (int N=100; N <=200; N++) {
            if (N%2==0) {
                sum_par = sum_par + N;
            } else {
                sum_impar = sum_impar + N;
            }

        }

        System.out.println("La suma de los números pares es: "+ sum_par +
                " y la suma de los números impares es: "+ sum_impar);
    }
}
