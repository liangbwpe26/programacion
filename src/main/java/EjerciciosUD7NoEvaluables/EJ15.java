package EjerciciosUD7NoEvaluables;

public class EJ15 {
    public static void main(String[] args) {
        int [] numeros = new int[100];
        for (int i = 1; i <= 100; i++) {
            numeros[i - 1] = i;
        }
        System.out.println("La suma total es: "+ sumaTotal(numeros));
        System.out.println("La media es: "+ media(numeros));

    }
    public static int sumaTotal (int[] numerosNaturales) {
        int suma = 0;
        for (int numeros : numerosNaturales) {
            suma += numeros;
        }
        return suma;
    }
    public static double media(int[] numerosNaturales) {
        return (double) sumaTotal(numerosNaturales) / numerosNaturales.length;
    }
}
