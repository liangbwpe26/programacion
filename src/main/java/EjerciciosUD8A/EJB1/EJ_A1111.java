package EjerciciosUD8A.EJB1;

import java.util.Scanner;

public class EJ_A1111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona person1 = new Persona();
        Persona person2 = new Persona();

        try {
            System.out.println("Ingresa el nombre de la primera persona: ");
            String nombre = sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Ingresa los apellidos de la primera persona: ");
            String apellidos = sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Ingresa el DNI de la primera persona: ");
            String dni = sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Ingresa la edad de la primera persona: ");
            int edad = sc.nextInt();

            person1 = dni.isEmpty() ? new Persona(nombre, edad, apellidos) : new Persona(dni, nombre, apellidos, edad);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.nextLine(); //Limpiar buffer

        try {
            System.out.println("Ingresa el nombre de la segunda persona: ");
            String nombre = sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Ingresa los apellidos de la primera persona: ");
            String apellidos = sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Ingresa el DNI de la segunda persona: ");
            String dni = sc.nextLine();
            System.out.println("--------------------------");
            System.out.println("Ingresa la edad de la primera persona: ");
            int edad = sc.nextInt();

            person2 = dni.isEmpty() ? new Persona(nombre, edad, apellidos) : new Persona(dni, nombre, apellidos, edad);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        person1.printPersona();
        person2.printPersona();

        int diferencia = person1.diferenciaEdad(person2);
        System.out.println("La diferencia de edad entre las dos personas es de " + diferencia + " años.");
    }
}

