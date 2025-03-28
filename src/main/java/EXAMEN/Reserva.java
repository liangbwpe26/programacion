package EXAMEN;

import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Reserva() {
    }

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) throws IllegalArgumentException {
        if (fechaEntrada == fechaSalida) {
            throw new IllegalArgumentException("Error: La fecha de entrada y saida no pueden ser la misma.");
        }
        if (fechaEntrada.isAfter(fechaSalida)) {
            throw new IllegalArgumentException("Error: La fecha de entrada no puede ser despues de la fecha de salida.");
        }
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public String datosReserva () {
        return ("Reserva de " + cliente.getNombre() + " en habitación " + habitacion.getNumero() + " del " + fechaEntrada + " al " + fechaSalida);
    }
}
