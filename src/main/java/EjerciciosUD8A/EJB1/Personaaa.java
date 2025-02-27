package EjerciciosUD8A.EJB1;

import java.util.InputMismatchException;

public class Personaaa {
    String dni;
    String nombre;
    String apellidos;
    int edad;

    public Personaaa(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Personaaa(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


    void esMayorDeEdad() throws IllegalArgumentException, InputMismatchException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

        if (dni != null) {
            if (edad < 18) {
                System.out.println(nombre + " " + apellidos + " con DNI " + dni + " es menor de edad.");
            } else {
                System.out.println(nombre + " " +  apellidos + " con DNI " + dni + " es mayor de edad.");
            }
        } else {
            if (edad < 18) {
                System.out.println(nombre + " " + apellidos + " sin DNI " + "es menor de edad.");
            } else {
                System.out.println(nombre + " " + apellidos + " sin DNI " + "es mayor de edad.");
            }
        }
    }
}
