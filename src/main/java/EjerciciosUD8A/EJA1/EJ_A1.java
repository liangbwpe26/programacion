package EjerciciosUD8A.EJA1;

import java.util.Scanner;

public class EJ_A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personaaaaaa person1 = new Personaaaaaa();
        Personaaaaaa person2 = new Personaaaaaa();

        System.out.println("Ingresa el nombre de la primera persona: ");
        person1.nombre= sc.nextLine();
        System.out.println("--------------------------");
        System.out.println("Ingresa los apellidos de la primera persona: ");
        person1.apellidos= sc.nextLine();
        System.out.println("--------------------------");
        System.out.println("Ingresa el DNI de la primera persona: ");
        person1.dni= sc.nextLine();
        System.out.println("--------------------------");
        System.out.println("Ingresa la edad de la primera persona: ");
        person1.edad= sc.nextInt();

        sc.nextLine();

        System.out.println("Ingresa el nombre de la segunda persona: ");
        person2.nombre= sc.nextLine();
        System.out.println("--------------------------");
        System.out.println("Ingresa los apellidos de la primera persona: ");
        person2.apellidos= sc.nextLine();
        System.out.println("--------------------------");
        System.out.println("Ingresa el DNI de la segunda persona: ");
        person2.dni= sc.nextLine();
        System.out.println("--------------------------");
        System.out.println("Ingresa la edad de la primera persona: ");
        person2.edad= sc.nextInt();

        person1.esMayorDeEdad();
        person2.esMayorDeEdad();
    }
}
