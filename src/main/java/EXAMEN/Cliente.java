package EXAMEN;

public class Cliente {
    private String dni;
    private String nombre;

    public Cliente() {
    }

    public Cliente(String dni, String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: El nombre del cliente no puede estar vacío.");
        }
        if (dni == null || dni.trim().isEmpty() || dni.length() != 9) {
            throw new IllegalArgumentException("Error: El dni del cliente no puede estar vacío.");
        }
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String datosCliente () {
        return (nombre + " (DNI: " + dni + ")");
    }
}
