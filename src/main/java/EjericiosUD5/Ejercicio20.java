package EjericiosUD5;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        double salarioBruto;
        if (horasTrabajadas <= 35) {
            salarioBruto = horasTrabajadas * tarifaPorHora;
        } else {
            salarioBruto = 35 * tarifaPorHora + (horasTrabajadas - 35) * tarifaPorHora * 1.5;
        }


        double impuestos = 0;
        double salarioNeto;

        if (salarioBruto > 900) {
            impuestos += (salarioBruto - 900) * 0.45;
            impuestos += 400 * 0.25;
        } else if (salarioBruto > 500) {
            impuestos += (salarioBruto - 500) * 0.25;
        }

        salarioNeto = salarioBruto - impuestos;

        System.out.println("Por las "+ horasTrabajadas + " a " + nombre + " le corresponde un salario bruto de "+ salarioBruto + " y un neto "+ salarioNeto +
                " tras aplicar "+ impuestos + " euros de impuesto.");

    }
}