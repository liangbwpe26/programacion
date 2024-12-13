package EjerciciosUD5_2_B;

public class EJ5 {
    public static void main(String[] args) {
        int nm = 0;

        // Bucle Para La Elevación De Los 5 Primeros Números
        for (int i = 1; i <= 5; i++) {
            nm += (int) Math.pow(i,2);
        }

        // Imprime la suma del cálculo
        System.out.println("La suma de los cuadrados es: " + nm);
    }
}
