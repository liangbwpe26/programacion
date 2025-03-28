package EjerciciosUD8A.EJB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        try {
            Articulo articulo1 = new Articulo("Pijama", 10, 21, 2);
            //Articulo articulo1 = new Articulo("Camiseta", -5, 3);
            // articulo2.printDelArticulo();

            // Articulo articulo1 = new Articulo("", 20, 5);
            // articulo3.printDelArticulo();

            //Articulo articulo1 = new Articulo("Zapatos", 30, -2);
            // articulo4.printDelArticulo();

            System.out.println("Articulo sin el cambio: ");
            System.out.println(articulo1.getNombreArticulo());
            System.out.println(articulo1.getPrecioSinIVA());
            System.out.println(articulo1.getIva());
            System.out.println(articulo1.getCuantosQuedan());
            articulo1.printDelArticulo();

            System.out.println("Tienes un descuento? Introduce tu descuento: ");
            double descuento = sc.nextDouble();
            articulo1.setDescuento(descuento);

            System.out.println("El articulo ahora tiene este precio con el descuento: ");
            articulo1.printDelArticulo();

            do {
                System.out.println("\nCambios del artículo: ");
                System.out.println("1- Compra del artículo.");
                System.out.println("2- Venta del artículo.");
                System.out.println("3- Salir.");
                System.out.print("Selecciona una opción: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Por favor, ingresa un número válido.");
                    sc.next();
                }
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce cuántas unidades compraste: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ingresa un número válido.");
                            sc.next();
                        }
                        int compra = sc.nextInt();
                        if (compra >= 0) {
                            articulo1.setCompra(compra);
                            articulo1.comprar();
                        } else {
                            System.out.println("Error: No puedes comprar una cantidad negativa.");
                        }
                        break;

                    case 2:
                        System.out.println("Introduce cuántas unidades vendiste: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ingresa un número válido.");
                            sc.next();
                        }
                        int venta = sc.nextInt();
                        if (venta >= 0) {
                            articulo1.setVenta(venta);
                            articulo1.vender();
                        } else {
                            System.out.println("Error: No puedes vender una cantidad negativa.");
                        }
                        break;

                    case 3:
                        System.out.println("Saliendo del sistema.");
                        break;

                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }

            } while (opcion != 3);

            System.out.println("\nEstado final del artículo:");
            articulo1.printDelArticulo();

        } catch (IllegalArgumentException error) {
            System.out.println("Error: " + error.getMessage());
        }


            /*System.out.println("--------------------------");
            System.out.println("Articulo con el cambio: ");
            articulo1.setNombreArticulo("Pijama Blanca");
            articulo1.setPrecioSinIVA(14);
            articulo1.setIva(24);
            articulo1.setCuantosQuedan(10);
            System.out.println(articulo1.getNombreArticulo());
            System.out.println(articulo1.getPrecioSinIVA());
            System.out.println(articulo1.getIva());
            System.out.println(articulo1.getCuantosQuedan());
            articulo1.printDelArticulo();
            */

    }
}
