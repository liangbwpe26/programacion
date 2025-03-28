package InvMascotas;

import java.time.LocalDate;

public class Loro extends Ave {
    private OrigenLoro origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, LocalDate fecha_nacimiento, boolean vuelo, OrigenLoro origen, boolean habla) throws IllegalArgumentException {
        super(nombre, edad, estado, fecha_nacimiento, vuelo);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    void volar() {
        System.out.println(nombre + " esta volando!");
    }

    @Override
    void muestra() {
        System.out.println("Loro: " + nombre + ", Origen: " + origen + ", Estado: " + estado);
    }

    @Override
    void habla() {
        if (habla) {
            System.out.println(nombre + " dice: ¡Hola!");
        } else {
            System.out.println(nombre + " no habla.");
        }
    }
}
