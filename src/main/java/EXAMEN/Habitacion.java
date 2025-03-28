package EXAMEN;

import java.util.ArrayList;

public class Habitacion {
    private int numero;
    private TipoHabitacion tipoHabitacion;
    private double precioNoche;
    private ArrayList<Reserva> reservas;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static double obtenerTarifaHabitacion(TipoHabitacion tipoHabitacion) {
        if (tipoHabitacion == TipoHabitacion.INDIVIDUAL) {
            return 50.75;
        }
        if (tipoHabitacion == TipoHabitacion.DOBLE) {
            return 85.25;
        }
        return 165;
    }
    public boolean estaDisponible (Reserva reserva) {
        return reserva.getFechaEntrada() == null;
    }
    public void agregarReserva(Reserva reserva) {
        if (reserva.getFechaEntrada() == null) {
            reservas.add(reserva);
        }
    }
    public int obtenerReservasActivas() {
        int reservasActivas = 0;
        for (Reserva reserva : reservas) {
            if (reserva.getFechaEntrada() != null) {
                reservasActivas++;
            }
        }
        return reservasActivas;
    }
}
