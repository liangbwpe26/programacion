package Ejercicio8_UD9;

abstract class Empleado {
    protected String nombre;
    protected double sueldoBase;
    protected Dispositivo dispositivoElectronico;

    public Empleado() {
    }

    public Empleado(String nombre, double sueldoBase, Dispositivo dispositivoElectronico) throws IllegalArgumentException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre del empleado no puede estar vacio");
        }
        if (sueldoBase <= 0) {
            throw new IllegalArgumentException("El sueldo base no puede ser un valor negativo");
        }
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.dispositivoElectronico = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre del empleado no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        if (sueldoBase <= 0) {
            throw new IllegalArgumentException("El sueldo base no puede ser un valor negativo");
        }
        this.sueldoBase = sueldoBase;
    }

    public Dispositivo getDispositivoElectronico() {
        return dispositivoElectronico;
    }

    public void setDispositivoElectronico(Dispositivo dispositivoElectronico) {
        this.dispositivoElectronico = dispositivoElectronico;
    }

    abstract double calcularSalario();

    public String mostrarInformacion() {
        return "Empleado: " + nombre + "/ Salario: " + sueldoBase + " euros";
    }
}
