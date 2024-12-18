package EjerciciosUD6;

public class C_ej1 {
    public static void main(String[] args) {
        int cont = 1;

        for (int i = 0; i < 5; i++) {
             System.out.println();
             for (int j = 0; j < 5; j++) {
                 System.out.print(cont + "\t");
                 cont++;
             }
        }
    }
}
