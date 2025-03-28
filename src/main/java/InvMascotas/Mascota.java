package InvMascotas;

import java.time.LocalDate;

abstract class Mascota {
    protected String nombre;
    protected int edad;
    protected String estado;
    protected LocalDate fecha_nacimiento;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, String estado, LocalDate fecha_nacimiento) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad may not be negative");
        }
        if (estado == null) {
            throw new IllegalArgumentException("Estado may not be null");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    abstract void muestra();
    abstract void habla();
}
