package EXAMEN;

import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
    public void buscarHabitacion(Habitacion numeroHabitacion) throws IllegalArgumentException {
        if (numeroHabitacion.getNumero() < 0) {
            numeroHabitacion.setNumero(0);
        }
        if (numeroHabitacion == null) {
            throw new IllegalArgumentException("Error: La habitación no existe");
        }
        for (Habitacion h : habitaciones) {
            if (h.equals(numeroHabitacion.getNumero())) {
                System.out.println("Tú habitación es la " + numeroHabitacion.getNumero());
            }
        }
    }
    public boolean hacerReserva(Reserva reserva) throws IllegalArgumentException {
        for (Reserva r : reservas) {
            if (r.equals(reserva)) {
                throw new IllegalArgumentException("Error: La reserva no se puede hacer en esas fechas.");
            }
        }
        reservas.add(reserva);
        return true;
    }
}
