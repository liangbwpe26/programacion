package Ejercicio8_UD9;

import java.util.Comparator;

public class ComparaSalario implements Comparator<Empleado> {
   public int compare(Empleado empleado1, Empleado empleado2) {
       return Double.compare(empleado1.getSueldoBase(), empleado2.getSueldoBase());
   }
}
