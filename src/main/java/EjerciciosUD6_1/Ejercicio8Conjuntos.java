package EjerciciosUD6_1;

import java.util.*;

public class Ejercicio8Conjuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el conjunto de números: ");
        String conjunto1 = sc.nextLine();
        System.out.println("Ingrese el 2do conjunto de números: ");
        String conjunto2 = sc.nextLine();

        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        for (String num : conjunto1.split(",")) {
            int convertido = Integer.parseInt(num);
            set1.add(convertido);
        }
        for (String num : conjunto2.split(",")) {
            int convertido = Integer.parseInt(num);
            set2.add(convertido);
        }

        TreeSet<Integer> interseccion = new TreeSet<>(set1);
        interseccion.retainAll(set2);
        System.out.println("Intersección: "+ interseccion);

        TreeSet<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: "+ union);
    }
}
