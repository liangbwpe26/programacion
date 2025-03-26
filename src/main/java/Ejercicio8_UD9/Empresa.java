package Ejercicio8_UD9;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa() {
    }

    public Empresa(String nombre, ArrayList<Empleado> empleados) throws IllegalArgumentException {
        if (!verificarNombre(nombre)) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
        if (!verificarNombre(nombre)) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public boolean verificarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
}
