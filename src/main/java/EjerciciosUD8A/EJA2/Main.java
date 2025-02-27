package EjerciciosUD8A.EJA2;

public class Main {
    public static void main(String[] args) {
        Articulo articulo = new Articulo();
        articulo.nombreArticulo= "Pijama";
        articulo.precioSinIVA= 10;
        articulo.cuantosQuedan= 4;

        articulo.printdDelArticulo();
    }
}
