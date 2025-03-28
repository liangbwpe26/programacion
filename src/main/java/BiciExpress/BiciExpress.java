package BiciExpress;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiciExpress {
    List<Repartidor> repartidores = new ArrayList<>();
    List<Paquete> paquetesNoAsignados = new ArrayList<>();
    List<Paquete> paquetesEntregados = new ArrayList<>();
    List<Paquete> paquetesRetrasados = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new BiciExpress().iniciar();
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> crearRepartidor();
                case 2 -> crearPaqueteNormal();
                case 3 -> crearPaqueteUrgente();
                case 4 -> mostrarPaquetesNoAsignados();
                case 5 -> asignarPaqueteARepartidor();
                case 6 -> entregarPaquete();
                case 7 -> mostrarRepartidores();
                case 8 -> mostrarPaquetesRetrasados();
                case 9 -> mostrarPaquetesEntregados();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("--- MENSAJERÍA BICI-EXPRESS ---");
        System.out.println("1. Crear repartidor");
        System.out.println("2. Crear paquete normal");
        System.out.println("3. Crear envío urgente");
        System.out.println("4. Mostrar paquetes no asignados");
        System.out.println("5. Asignar paquete a repartidor");
        System.out.println("6. Entregar paquete a cliente");
        System.out.println("7. Mostrar repartidores y paquetes asignados");
        System.out.println("8. Mostrar paquetes retrasados");
        System.out.println("9. Mostrar paquetes entregados");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void crearRepartidor() {
        System.out.print("Ingrese el nombre del repartidor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa el DNI del repartidor: ");
        String dni = scanner.nextLine();
        repartidores.add(new Repartidor(nombre, dni));
        System.out.println("Repartidor creado exitosamente.");
    }

    private void crearPaqueteNormal() {
        System.out.print("Ingrese el peso del paquete: ");
        double peso = scanner.nextDouble();
        paquetesNoAsignados.add(new Paquete(peso));
        System.out.println("Paquete creado exitosamente.");
    }

    private void crearPaqueteUrgente() {
        System.out.print("Ingrese el peso del paquete: ");
        double peso = scanner.nextDouble();
        paquetesNoAsignados.add(new Paquete(peso));
        System.out.println("Paquete creado exitosamente.");
    }

    private void mostrarPaquetesNoAsignados() {
        System.out.println("Paquetes no asignados:");
        for (Paquete p : paquetesNoAsignados) {
            System.out.println(p);
        }
    }

    private void asignarPaqueteARepartidor() {
    }

    private void entregarPaquete() {
    }

    private void mostrarRepartidores() {
    }

    private void mostrarPaquetesRetrasados() {
        System.out.println("Paquetes retrasados:");
        for (Paquete p : paquetesRetrasados) {
            System.out.println(p);
        }
    }

    private void mostrarPaquetesEntregados() {
        System.out.println("Paquetes entregados:");
        for (Paquete p : paquetesEntregados) {
            System.out.println(p);
        }
    }
}
