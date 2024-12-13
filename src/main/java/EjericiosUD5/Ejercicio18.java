package EjericiosUD5;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, Ingrediente = 0;

        System.out.println("""     
                ¡Bienvenido a la pizzeria BELLA NAPOLI!
                Tipos de pizza:
                1- Vegetariana\s
                2- No Vegetariana\s
                Introduce el número correspondiente al tipo de pizza que quieres:
                """);
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1 ->{
                System.out.println("¿Qué ingrediente prefieres en tu pizza vegetariana? (1-Cebolla, 2-Pimiento, 3-Champiñón)");
                Ingrediente = scanner.nextInt();}
            case 2 ->{
                System.out.println("¿Qué ingrediente prefieres en tu pizza no vegetariana? (1-Jamón, 2-Pavo, 3-Aceituna)");
                Ingrediente = scanner.nextInt();}
        }
        switch (Ingrediente){
            case 1 -> System.out.println("Has elegido cebolla como ingrediente en tu pizza.");
            case 2 -> System.out.println("Has elegido pimiento como ingrediente en tu pizza.");
            case 3 -> System.out.println("Has elegido champiñón como ingrediente en tu pizza.");
            case 4 -> System.out.println("Has elegido jamón como ingrediente en tu pizza.");
            case 5 -> System.out.println("Has elegido pavo como ingrediente en tu pizza.");
            case 6 -> System.out.println("Has elegido aceituna como ingrediente en tu pizza.");
            default -> System.out.println("No has elegido un ingrediente válido.");
        }
    }
}