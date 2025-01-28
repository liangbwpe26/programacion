package EjerciciosUD6_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> agenda = new ArrayList<>();
        String opcion;

        do {
            System.out.println("\nAgenda de Contactos: ");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.next();
            switch (opcion) {
                case "1": {
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Introduce el telefono: ");
                    String telefono = scanner.next();

                    boolean telefonoExistente = false;
                    for (String[] contacto : agenda) {
                        if (contacto[1].equals(telefono)) {
                            telefonoExistente = true;
                            break;
                        }
                    }
                    if (telefonoExistente) {
                        System.out.println("El teléfono ya existe.");
                    } else {
                        agenda.add(new String[]{nombre, telefono});
                        System.out.println("Contacto añadido.");
                    }
                    break;
                }
                case "2": {
                    if (agenda.isEmpty()) {
                        System.out.println("No hay contactos en la agenda.");
                    } else {
                        for (String[] contacto : agenda) {
                            System.out.println("Nombre: "+ contacto[0] + ", Teléfono: " + contacto[1]);
                        }
                    }
                    break;
                }
                case "3": {
                    if (agenda.isEmpty()) {
                        System.out.println("No hay contactos en la agenda.");
                        break;
                    } else {
                        System.out.print("Ingresa el contacto a buscar: ");
                        String contactoBuscado = scanner.next();
                        boolean encontrado = false;
                        for (String[] contacto : agenda) {
                            if (contactoBuscado.equalsIgnoreCase(contacto[0])) {
                                System.out.println("Nombre: " + contacto[0] + ", Teléfono: " + contacto[1]);
                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Contacto no encontrado.");
                        }
                    }
                    break;
                }
                case "4": {
                    if (agenda.isEmpty()) {
                        System.out.println("No hay contactos en la agenda.");
                    } else {
                        System.out.print("Introduce el nombre del contacto a eliminar: ");
                        String nombreEliminar = scanner.next();
                        boolean eliminado = false;
                        Iterator<String[]> iterador = agenda.iterator();
                        while (iterador.hasNext()) {
                            String[] contacto = iterador.next();
                            if (contacto[0].equalsIgnoreCase(nombreEliminar)) {
                                iterador.remove();
                                eliminado = true;
                                break;
                            }
                        }
                        if (eliminado) {
                            System.out.println("Contacto eliminado.");
                        } else {
                            System.out.println("Contacto no encontrado.");
                        }
                    }
                    break;
                }
                case "5": {
                    System.out.println("Saliendo de la agenda.");
                    break;
                }
            }
        }
        while (!opcion.equals("5"));
    }
}