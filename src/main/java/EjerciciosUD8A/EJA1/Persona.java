package EjerciciosUD8A.EJA1;

public class Persona {
    String dni;
    String nombre;
    String apellidos;
    int edad;

    void esMayorDeEdad() {
        if (edad < 18) {
            System.out.println(nombre + apellidos + " con DNI " + dni + " es menor de edad");
        } else {
            System.out.println(nombre + apellidos + " con DNI " + dni + " es mayor de edad");
        }
    }
}
