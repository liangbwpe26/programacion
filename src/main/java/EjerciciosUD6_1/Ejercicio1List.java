package EjerciciosUD6_1;
import java.util.ArrayList;

public class Ejercicio1List {
    public static void main(String[] args) {
        ArrayList<String> Lista1 = new ArrayList<>();

        Lista1.add("Yago");
        Lista1.add("Juanma");
        Lista1.add("Alex");
        Lista1.add("Emmanuel");
        Lista1.add("Toni");
        Lista1.add("Unai");

        for (String Nombres : Lista1) {
            System.out.println(Nombres);
        }
    }
}
