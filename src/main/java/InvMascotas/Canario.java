package InvMascotas;

import java.time.LocalDate;

public class Canario extends Ave{
    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, LocalDate fecha_nacimiento, boolean vuelo, String color, boolean canta) throws IllegalArgumentException {
        super(nombre, edad, estado, fecha_nacimiento, vuelo);
        this.color = color;
        this.canta = canta;
    }

    @Override
    void volar() {
        System.out.println(nombre + " esta volando!");
    }

    @Override
    void muestra() {
        System.out.println("Canario: " + nombre + ", Color: " + color + ", Estado: " + estado);
    }

    @Override
    void habla() {
        if (canta) {
            System.out.println(nombre + " canta melodiosamente.");
        } else {
            System.out.println(nombre + " no canta.");
        }
    }
}
