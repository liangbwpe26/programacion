package BiciExpress;

import java.util.List;
import java.util.NoSuchElementException;

public class Repartidor {
    private String nombre;
    private String dni;
    private List<Paquete> lista_paquetes;

    public Repartidor() {
    }

    public Repartidor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Paquete> getLista_paquetes() {
        return lista_paquetes;
    }

    public void setLista_paquetes(List<Paquete> lista_paquetes) {
        this.lista_paquetes = lista_paquetes;
    }

    public String toString() {
        return "Repartidor: " + getNombre() + " - " + getDni() + " - " + getLista_paquetes();
    }

    public void asignarPaquetes(Paquete p) throws IllegalArgumentException {
        if (lista_paquetes.size() >= 10) {
            throw new IllegalArgumentException("No se pueden asignar más paquetes");
        }
        lista_paquetes.add(p);
    }
    public void entregarPaquete(int idPaquete) throws NoSuchElementException {
        for (Paquete p : lista_paquetes) {
            if (p.getIdPaquete() == idPaquete) {
                p.entregar();
                lista_paquetes.remove(p);
                System.out.println("Paquete " + p.getIdPaquete() + " ha sido entregado");
            }
        }
        throw new NoSuchElementException("Paquete con ID: " + idPaquete + " no ha sido encontrado");
    }
}
