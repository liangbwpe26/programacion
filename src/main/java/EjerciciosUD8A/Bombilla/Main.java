package EjerciciosUD8A.Bombilla;

public class Main {
    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();

        System.out.println("\nEstado Inicial: ");
        bombilla1.estadoBombillas();
        bombilla2.estadoBombillas();

        bombilla1.encender();
        bombilla2.encender();

        System.out.println("\nEncendemos las bombillas: ");
        bombilla1.estadoBombillas();
        bombilla2.estadoBombillas();

        bombilla1.apagar();
        System.out.println("\nApagamos una bombilla: ");

        bombilla1.estadoBombillas();
        bombilla2.estadoBombillas();

    }
}
