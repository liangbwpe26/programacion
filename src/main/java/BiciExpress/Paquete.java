package BiciExpress;

import java.time.LocalDate;

public class Paquete {
    protected static int contID = 0;
    protected int idPaquete;
    protected double peso;
    protected LocalDate fecha_entrega;
    protected EstadoEnvio estado_paquete;

    public Paquete() {
    }

    public Paquete(double peso) throws IllegalArgumentException {
        if (peso <= 0 || peso > 20) {
            throw new IllegalArgumentException("El peso debe estar entre 1 y 20 kg.");
        }
        this.idPaquete = contID++;
        this.estado_paquete = EstadoEnvio.PENDIENTE;
        this.peso = peso;
        if (peso < 5) {
            this.fecha_entrega = LocalDate.now().plusDays(1);
        } else if (peso < 10) {
            this.fecha_entrega = LocalDate.now().plusDays(2);
        } else if (peso < 15) {
            this.fecha_entrega = LocalDate.now().plusDays(4);
        } else if (peso < 20) {
            this.fecha_entrega = LocalDate.now().plusDays(5);
        }
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public EstadoEnvio getEstado_paquete() {
        return estado_paquete;
    }

    public void setEstado_paquete(EstadoEnvio estado_paquete) {
        this.estado_paquete = estado_paquete;
    }

    public boolean estaRetrasado() {
        return LocalDate.now().isAfter(fecha_entrega) && !(estado_paquete == EstadoEnvio.ENTREGADO);
    }

    public void entregar() throws IllegalStateException {
        if (estado_paquete == EstadoEnvio.ENTREGADO) {
            throw new IllegalStateException("El paquete ya ha sido entregado");
        } else {
            estado_paquete = EstadoEnvio.ENTREGADO;
        }
    }

    public String toString() {
        return "Id del paquete: " + idPaquete + " Peso: " + peso + " Fecha de Entrega: "
                + fecha_entrega + " Estado de Paquete: " + estado_paquete;
    }
}
