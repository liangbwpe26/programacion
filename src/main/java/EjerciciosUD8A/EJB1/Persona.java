package EjerciciosUD8A.EJB1;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona() {
    }

    public Persona(String nombre, int edad, String apellidos) throws IllegalArgumentException {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("Error: El nombre no puede estar vacio.");
        }
        if (apellidos.isEmpty()) {
            throw new IllegalArgumentException("Error: Los apellidos no pueden estar vacios.");
        }
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("Error: La edad no puede ser mayor a 120 o menor a 0.");
        }
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    boolean esmayor () {
        return edad >= 18;
    }
    boolean esJubilado () {
        return edad >= 65;
    }
    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.getEdad());
    }

    void printPersona() {
        if (!esmayor()) {
            System.out.println(nombre + " " + apellidos + (dni != null ? " con DNI " + dni : " sin DNI") + " es menor de edad.");
        } else if (esJubilado()){
            System.out.println(nombre + " " + apellidos + (dni != null ? " con DNI " + dni : " sin DNI") + " es mayor de edad y esta jubilado.");
        } else {
            System.out.println(nombre + " " + apellidos + (dni != null ? " con DNI " + dni : " sin DNI") + " es mayor de edad.");
        }
    }
}
