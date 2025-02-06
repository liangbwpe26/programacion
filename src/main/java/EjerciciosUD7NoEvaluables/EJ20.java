package EjerciciosUD7NoEvaluables;

public class EJ20 {
    public static void main(String[] args) {
        int numero= 2;
        tablademultiplicar(numero);
    }
    public static void tablademultiplicar (int numero) {
        System.out.println("Tabla de Multiplicar (Del 1 al 10) de "+ numero + ": ");
       for (int i = 1; i <= 10; i++) {
           System.out.println(i + " x " + numero + " = " + numero * i);
       }
    }
}
