package Ejercicio8_UD9;

public class Movil implements Dispositivo {
    private String nombre;
    private Estado estado;

    public Movil(String nombre) {
        this.nombre = nombre;
        this.estado = Estado.apagado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean equals (Object obj) {
        Portatil p = (Portatil) obj;
        return nombre.equals(p.getNombre());
    }

    @Override
    public void encender() {
        if (estado == Estado.apagado) {
            setEstado(Estado.encendido);
        } else {
            System.out.println("El móvil ya esta encendido");
        }
    }

    @Override
    public void apagar() {
        if (estado == Estado.encendido) {
            setEstado(Estado.apagado);
        } else {
            System.out.println("El móvil ya esta apagado");
        }
    }

    @Override
    public String estadoDispositivo() {
        return getEstado().toString();
    }
}
