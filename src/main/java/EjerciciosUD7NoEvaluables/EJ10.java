package EjerciciosUD7NoEvaluables;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una fecha (DD/MM/YYYY):  ");
        String fecha = sc.nextLine();
        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        if (fechaValida(dia, mes)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    }
    public static boolean fechaValida (int day, int month) {
        if (day > 30 || month > 12) {
            return false;
        } else {
            return true;
        }
    }
}
