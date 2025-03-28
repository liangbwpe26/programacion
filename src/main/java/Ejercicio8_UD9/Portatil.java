package Ejercicio8_UD9;

public class Portatil implements Dispositivo {
    private String nombre;
    private EstadoDispositivo estado;

    public Portatil(String nombre) {
        this.nombre = nombre;
        this.estado = EstadoDispositivo.apagado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoDispositivo getEstado() {
        return estado;
    }

    public void setEstado(EstadoDispositivo estado) {
        this.estado = estado;
    }

    public boolean equals (Object obj) {
        Portatil p = (Portatil) obj;
        return nombre.equals(p.getNombre());
    }

    @Override
    public void encender() {
        if (estado == EstadoDispositivo.apagado) {
        setEstado(EstadoDispositivo.encendido);
        } else {
            System.out.println("El portatil ya esta encendido");
        }
    }

    @Override
    public void apagar() {
        if (estado == EstadoDispositivo.encendido) {
            setEstado(EstadoDispositivo.apagado);
        } else {
            System.out.println("El portatil ya esta apagado");
        }
    }

    @Override
    public EstadoDispositivo estadoDispositivo() {
        return estadoDispositivo();
    }
}
