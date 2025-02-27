package EjerciciosUD8A.EJA2;

import java.text.DecimalFormat;

public class Articulo {
    String nombreArticulo;
    double precioSinIVA;
    private static final double iva = 21;
    int cuantosQuedan;

    void printdDelArticulo() {
        DecimalFormat df = new DecimalFormat("##.##");
        double pvp = (precioSinIVA * (iva/100)) + precioSinIVA;
        if (cuantosQuedan > 0) {
            System.out.println("Articulo: " + nombreArticulo + " | Precio: " + df.format(precioSinIVA)
                    + "€"+ " | IVA: " + df.format(iva) + "% | PVP: " + df.format(pvp) + "€");
        } else {
            System.out.println("No queda stock del articulo, pero su precio es: " + pvp + "€");
        }
    }
}
