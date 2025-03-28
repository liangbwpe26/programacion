package EjerciciosUD8A.Bombilla;

public class Bombilla {
    private static boolean luzgeneral = true;
    private boolean encendido = false;

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }
    public static void cortarLuz () {
        luzgeneral = false;
    }

    public static void restaurarLuz () {
        luzgeneral = true;
    }
    public boolean bombillaEncendida () {
        return encendido && luzgeneral;
    }

    public void estadoBombillas () {
        if (encendido && luzgeneral) {
            System.out.println("La bombilla esta encendida");
        } else {
            System.out.println("La bombilla esta apagada");;
        }
    }

}
