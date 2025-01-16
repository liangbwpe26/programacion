package EjerciciosUD6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> crud = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\nCRUD: ");
            System.out.println("1- Alta");
            System.out.println("2- Baja");
            System.out.println("3- Listado");
            System.out.println("4- Modificación");
            System.out.println("5- Salir");
            System.out.print("Ingresa una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1: {
                    System.out.print("Ingresa el IBAN: ");
                    String iban = scanner.nextLine();
                    System.out.print("Ingresa al autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingresa el título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingresa el género: ");
                    String genero = scanner.nextLine();
                    System.out.print("Ingresa el precio: ");
                    String precio = scanner.nextLine();
                    crud.add(new String[]{iban, autor, titulo, genero, precio});
                    break;
                }
                case 2: {
                    System.out.print("Ingresa el libro que deseas eliminar: ");
                    String libroEliminar = scanner.nextLine();
                    boolean eliminado = crud.removeIf(libro -> libroEliminar.equalsIgnoreCase(libro[2]));
                    if (eliminado) {
                        System.out.println("Libro eliminado.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                }
                case 3: {
                    if (crud.isEmpty()) {
                        System.out.println("No hay libros en la base de datos.");
                    } else {
                        for (String[] libro : crud) {
                            System.out.print("IBAN: " + libro[0] + " || Autor: " + libro[1] + " || Título: " + libro[2] + " || Género: " + libro[3] + " || Precio: " + libro[4] + "\n");
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.print("Ingresa el libro que deseas modificar: ");
                    String libroBuscado = scanner.nextLine();
                    for (String[] libro : crud) {
                        boolean eliminado = crud.removeIf(libroAux -> libroAux[2].equalsIgnoreCase(libroBuscado));
                        if (eliminado) {
                            if (libroBuscado.equalsIgnoreCase(libro[2])) {
                                System.out.print("Ingresa el IBAN: ");
                                String iban = scanner.nextLine();
                                System.out.print("Ingresa al autor: ");
                                String autor = scanner.nextLine();
                                System.out.print("Ingresa el título: ");
                                String titulo = scanner.nextLine();
                                System.out.print("Ingresa el género: ");
                                String genero = scanner.nextLine();
                                System.out.print("Ingresa el precio: ");
                                String precio = scanner.nextLine();
                                crud.add(new String[]{iban, autor, titulo, genero, precio});
                            } else {
                                System.out.println("Libro no encontrado.");
                            }
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Saliendo de CRUD.");
                    break;
                }
            }
        }
        while (opcion != 5);
    }
}
