package BiciExpress;

import java.time.LocalDate;

public class EnvioUrgente extends Paquete {

    public EnvioUrgente() {
    }

    public EnvioUrgente(double peso) throws IllegalArgumentException {
        super(peso);
        if (super.getFecha_entrega().isAfter(LocalDate.now().plusDays(2))) {
            throw new IllegalArgumentException("La fecha de entrega no puede superar las 48 horas.");
        }
        super.setFecha_entrega(LocalDate.now().plusDays(2));
    }

    @Override
    public boolean estaRetrasado() {
        return !LocalDate.now().isAfter(fecha_entrega) && !(estado_paquete == EstadoEnvio.ENTREGADO);
    }

    @Override
    public String toString() {
        return "[URGENTE] " + super.toString();
    }
}
