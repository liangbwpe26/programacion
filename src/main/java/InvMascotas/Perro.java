package InvMascotas;

import java.time.LocalDate;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, String estado, LocalDate fecha_nacimiento, String raza) throws IllegalArgumentException {
        super(nombre, edad, estado, fecha_nacimiento);
        this.raza = raza;
    }

    @Override
    void muestra() {
        System.out.println("Perro: " + nombre + ", Raza: " + raza + ", Estado: " + estado);
    }

    @Override
    void habla() {
        System.out.println("Guau guau!");
    }
}
