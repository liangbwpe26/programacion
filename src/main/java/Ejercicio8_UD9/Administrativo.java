package Ejercicio8_UD9;

public class Administrativo extends Empleado {
    private String valorCategoria;

    public Administrativo(String nombre, double sueldoBase, Dispositivo dispositivo) throws IllegalArgumentException {
        super(nombre, sueldoBase, dispositivo);
        this.valorCategoria = "Administrativo";
    }

    @Override
    double calcularSalario() {
        return sueldoBase;
    }
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " / Categoria: " + valorCategoria;
    }
}
