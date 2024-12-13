package EjerciciosUD5_2_A;

public class EJ11 {
    public static void main(String[] args) {
        int numpar = 0, numimpar = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                numpar += i;
            } else {
                numimpar += i;
            }
        }
        System.out.println(numpar);
        System.out.println(numimpar);
    }
}
