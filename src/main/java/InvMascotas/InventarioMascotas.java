package InvMascotas;

import java.util.ArrayList;

public class InventarioMascotas {
    private ArrayList<Mascota> mascotas;

    public InventarioMascotas() {
        mascotas = new ArrayList<>();
    }

    public void insertarAnimal(Mascota m) {
        mascotas.add(m);
    }

    public void eliminarAnimal(String nombre, Mascota m) {
        if (m.getNombre().equalsIgnoreCase(nombre)) {
            mascotas.remove(m);
        } else {
            System.out.println("La mascota no existe");
        }
    }

    public void vaciarInventario() {
        mascotas.clear();
    }

    public void mostrarListaAnimales() {
        for (Mascota m : mascotas) {
            System.out.println(m.getClass().getSimpleName() + " - " + m.getNombre());
        }
    }

    public void mostrarDatosAnimal(String nombre) {
        for (Mascota m : mascotas) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                m.muestra();
                return;
            }
        }
        System.out.println("No se encontró un animal con ese nombre.");
    }

    public void mostrarTodosLosAnimales() {
        for (Mascota m : mascotas) {
            m.muestra();
        }
    }
}
