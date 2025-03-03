package EjerciciosUD8A.EJB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
