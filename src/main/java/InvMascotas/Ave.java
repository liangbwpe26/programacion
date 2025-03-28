package InvMascotas;

import java.time.LocalDate;

abstract class Ave extends Mascota {
    private boolean vuelo;

    public Ave(String nombre, int edad, String estado, LocalDate fecha_nacimiento) throws IllegalArgumentException {
        super(nombre, edad, estado, fecha_nacimiento);
    }

    public Ave(String nombre, int edad, String estado, LocalDate fecha_nacimiento, boolean vuelo) throws IllegalArgumentException {
        super(nombre, edad, estado, fecha_nacimiento);
        this.vuelo = vuelo;
    }

    abstract void volar();
}
