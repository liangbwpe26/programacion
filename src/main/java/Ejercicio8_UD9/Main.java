package Ejercicio8_UD9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dispositivo lenovo = new Portatil("Lenovo");
        Dispositivo iPhone = new Movil("iPhone 15");

        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            empleados.add(new JefeEquipo("", 2000.0, lenovo));
            empleados.add(new Programador("Ana", 2500.0, lenovo));
            empleados.add(new Administrativo("Elena", 2600.0, iPhone));
            empleados.add(new Programador("Carlos", 3000.0, lenovo));
            empleados.add(new Programador("Pedro", 3200.0, lenovo));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        empleados.sort(new ComparaSalario());

        System.out.println("RANKING POR SALARIO:");
        System.out.println("====================================================");
        for (int i = 0; i < empleados.size(); i++) {
            Empleado e = empleados.get(i);
            System.out.println((i + 1) + "- Empleado: " + e.getNombre() + " / Salario: " + e.getSueldoBase() + " euros");
        }
    }
    public static ArrayList<String> obtenerNombresEmpleados (ArrayList<Empleado> empleados) {
        ArrayList<String> nombresEmpleados = new ArrayList<>();
        for (Empleado e : empleados) {
            nombresEmpleados.add(e.getNombre());
        }
        return nombresEmpleados;
    }
}
