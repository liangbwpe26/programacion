package Ejercicio8_UD9;

public class Programador extends Empleado implements TrabajadorRemoto {
    private EstadoVPN estado;
    private String valorCategoria;

    public Programador(String nombre, double sueldoBase, Dispositivo dispositivoElectronico) throws IllegalArgumentException {
        super(nombre, sueldoBase, dispositivoElectronico);
        this.valorCategoria = "Programador";
        this.estado = EstadoVPN.desconectado;
    }

    @Override
    double calcularSalario() {
        double bono = 0.10;
        return (sueldoBase * bono) + sueldoBase;
    }
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " / Categoria: " + valorCategoria;
    }

    @Override
    public void conectarVPN() {
        if (estado == EstadoVPN.desconectado) {
            estado = EstadoVPN.conectado;
        } else {
            System.out.println("El empleado ya esta conectado");
        }
    }

    @Override
    public void desconectarVPN() {
        if (estado == EstadoVPN.conectado) {
            estado = EstadoVPN.desconectado;
        } else {
            System.out.println("El empleado ya esta desconectado");
        }
    }

    @Override
    public String estadoVPN() {
        return estado.toString();
    }
}
