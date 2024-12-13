package EjerciciosUD5_2_B;
import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia1 = 0, dia2 = 0, hora1 = 0, hora2 = 0;
        boolean datosValidos = false;

        while (dia1 == 0) {
            System.out.print("Introduce primer día (como número del 1 al 7 o texto): ");
            String entradaDia1 = sc.nextLine().toLowerCase();

            switch (entradaDia1) {
                case "lunes", "1" -> dia1 = 1;
                case "martes", "2" -> dia1 = 2;
                case "miércoles", "3" -> dia1 = 3;
                case "jueves", "4" -> dia1 = 4;
                case "viernes", "5" -> dia1 = 5;
                case "sábado", "6" -> dia1 = 6;
                case "domingo", "7" -> dia1 = 7;
                default -> System.out.println("Día no válido. Intenta de nuevo.");
            }
        }

        String nombreDia1 = switch (dia1) {
            case 1 -> "lunes";
            case 2 -> "martes";
            case 3 -> "miércoles";
            case 4 -> "jueves";
            case 5 -> "viernes";
            case 6 -> "sábado";
            case 7 -> "domingo";
            default -> "día desconocido";
        };

        System.out.print("Introduce la hora del día " + nombreDia1 + ": ");
        hora1 = sc.nextInt();
        sc.nextLine();

        while (!datosValidos) {
            System.out.print("Introduce segundo día (como número del 1 al 7 o texto): ");
            String entradaDia2 = sc.nextLine().toLowerCase();

            switch (entradaDia2) {
                case "lunes", "1" -> dia2 = 1;
                case "martes", "2" -> dia2 = 2;
                case "miércoles", "3" -> dia2 = 3;
                case "jueves", "4" -> dia2 = 4;
                case "viernes", "5" -> dia2 = 5;
                case "sábado", "6" -> dia2 = 6;
                case "domingo", "7" -> dia2 = 7;
                default -> {
                    System.out.println("Día no válido. Intenta de nuevo.");
                    dia2 = 0;
                }
            }

            if (dia2 < dia1) {
                System.out.println("El segundo día debe ser posterior al primero.");
                dia2 = 0;
                continue;
            }

            String nombreDia2 = switch (dia2) {
                case 1 -> "lunes";
                case 2 -> "martes";
                case 3 -> "miércoles";
                case 4 -> "jueves";
                case 5 -> "viernes";
                case 6 -> "sábado";
                case 7 -> "domingo";
                default -> "día desconocido";
            };

            System.out.print("Introduce la hora del día " + nombreDia2 + ": ");
            hora2 = sc.nextInt();
            sc.nextLine();

            if (dia1 == dia2 && hora2 < hora1) {
                System.out.println("La segunda hora debe ser mayor o igual a la primera.");
            } else {
                datosValidos = true;
            }
        }

        int horasTotales = (dia2 - dia1) * 24 + (hora2 - hora1);
        if (horasTotales < 0) {
            horasTotales += 168;
        }

        String nombreDia1Final = switch (dia1) {
            case 1 -> "lunes";
            case 2 -> "martes";
            case 3 -> "miércoles";
            case 4 -> "jueves";
            case 5 -> "viernes";
            case 6 -> "sábado";
            case 7 -> "domingo";
            default -> "día desconocido";
        };

        String nombreDia2Final = switch (dia2) {
            case 1 -> "lunes";
            case 2 -> "martes";
            case 3 -> "miércoles";
            case 4 -> "jueves";
            case 5 -> "viernes";
            case 6 -> "sábado";
            case 7 -> "domingo";
            default -> "día desconocido";
        };

        System.out.println("Entre las " + hora1 + ":00h del " + nombreDia1Final + " y las " + hora2 + ":00h del "
                + nombreDia2Final + " hay " + horasTotales + " hora/s.");
        sc.close();
    }
}
