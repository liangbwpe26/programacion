package EjerciciosUD8A.EJB2;

import java.text.DecimalFormat;

public class Articulo {
    private String nombreArticulo;
    private double precioSinIVA;
    private double iva;
    private int cuantosQuedan;
    private double pvp;
    private double descuento;

    Articulo(String nombreArticulo, double precioSinIVA, double iva, int cuantosQuedan) throws IllegalArgumentException {
        if (nombreArticulo == null || nombreArticulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: El nombre del articulo no debe estar vacio.");
        }
        if (precioSinIVA <= 0) {
            throw new IllegalArgumentException("Error: El precio del articulo debe ser mayor a 0.");
        }
        if (iva < 0 || iva > 100) {
            throw new IllegalArgumentException("Error: El IVA solo puedo tener un porcentaje de 1% a 100%.");
        }
        if (cuantosQuedan < 0) {
            throw new IllegalArgumentException("Error: El stock no puede estar en números negativos.");
        }
        this.nombreArticulo = nombreArticulo;
        this.precioSinIVA = precioSinIVA;
        this.cuantosQuedan = cuantosQuedan;
        this.iva = iva;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(double precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getPVP() {
        DecimalFormat df = new DecimalFormat("##.##");
        double PVP = precioSinIVA * (1 + iva / 100);
        return df.format(PVP);
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public double getPVPDescuento() {
        DecimalFormat df = new DecimalFormat("##.##");
        double PVP = precioSinIVA * (1 + iva / 100);
        return PVP - (PVP * (descuento / 100));
    }


    public void printDelArticulo() {
        DecimalFormat df = new DecimalFormat("##.##");
        pvp = (precioSinIVA * (1 + iva/100)) + precioSinIVA;
        if (descuento != 0) {
            System.out.println("Articulo: " + nombreArticulo + " | Precio: " + df.format(precioSinIVA)
                    + "€" + " | IVA: " + df.format(iva) + "% | PVP: " + df.format(getPVPDescuento()) + "€");
        } else if (cuantosQuedan > 0) {
            System.out.println("Articulo: " + nombreArticulo + " | Precio: " + df.format(precioSinIVA)
                    + "€"+ " | IVA: " + df.format(iva) + "% | PVP: " + df.format(pvp) + "€");
        } else {
            System.out.println("No queda stock del articulo, pero su precio es: " + pvp + "€");
        }
    }
}
