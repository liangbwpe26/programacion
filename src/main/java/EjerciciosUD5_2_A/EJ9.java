package EjerciciosUD5_2_A;

public class EJ9 {
    public static void main(String[] args) {
        int suma = 0, producto = 1;

        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
            producto = producto * i;
        }
        System.out.println(suma);
        System.out.println(producto);
    }
}
