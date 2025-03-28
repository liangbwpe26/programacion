package Ejercicio8_UD9;

public class JefeEquipo extends Empleado implements TrabajadorRemoto {
    private EstadoVPN estado;
    private String valorCategoria;

    public JefeEquipo(String nombre, double sueldoBase, Dispositivo dispositivoElectronico) throws IllegalArgumentException {
        super(nombre, sueldoBase, dispositivoElectronico);
        this.estado = EstadoVPN.desconectado;
        this.valorCategoria = "Jefe de Equipo";
    }

    public EstadoVPN getEstado() {
        return estado;
    }

    public void setEstado(EstadoVPN estado) {
        this.estado = estado;
    }

    @Override
    double calcularSalario() {
        double bono = 0.25;
        return (sueldoBase * bono) + sueldoBase;
    }

    public String mostrarInformacion() {
        return super.mostrarInformacion() + " / Categoria: "+ valorCategoria;
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
