package EjerciciosUD6;
import java.util.Arrays;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa N: ");
        int n = sc.nextInt();
        System.out.print("Ingresa M: ");
        int m = sc.nextInt();

        int [] array = new int[n];

        Arrays.fill(array, m);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
