package EjerciciosUD6_1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio7List {
    public static void main(String[] args) {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] figuras = {"1-As", "2-Dos", "3-Tres", "4-Cuatro", "5-Cinco", "6-Seis", "7-Siete", "10-Sota", "11-Caballo", "12-Rey"};

        ArrayList<String> baraja = new ArrayList<>();
        for (String palo : palos) {
            for (String figura : figuras) {
                baraja.add(figura + " de " + palo);
            }
        }

        Collections.shuffle(baraja);
        System.out.println("Cartas seleccionadas al azar: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(baraja.get(i));
        }
    }
}
