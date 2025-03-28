package InvMascotas;

import java.time.LocalDate;

public class Gato extends Mascota {
    private String color;

    public Gato(String nombre, int edad, String estado, LocalDate fecha_nacimiento, String color) throws IllegalArgumentException {
        super(nombre, edad, estado, fecha_nacimiento);
        this.color = color;
    }
    @Override
    void muestra() {
        System.out.println("Gato: " + nombre + ", Color: " + color + ", Estado: " + estado);
    }

    @Override
    void habla() {
        System.out.println("Miau Miau!");
    }
}
