package EjerciciosUD5_2_B;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String hora;
        int horas, minutos, segundos;
        boolean formato = false;

        while (!formato) {
            System.out.print("Ingresa una hora en formato (HH:MM:SS): ");
            hora = sc.next();

            String h = hora.charAt(0) + "" + hora.charAt(1);
            String m = hora.charAt(3) + "" + hora.charAt(4);
            String s = hora.charAt(6) + "" + hora.charAt(7);

            horas = Integer.parseInt(h);
            minutos = Integer.parseInt(m);
            segundos = Integer.parseInt(s);

            if (segundos >= 60 || minutos >= 60 || horas >= 24) {
                System.out.println("Ingresa el formato correctamente.");
            } else {
                DecimalFormat df = new DecimalFormat("00");

                while (true) {
                    System.out.println(df.format(horas) + ":" + df.format(minutos) + ":" + df.format(segundos));
                    segundos++;
                    if (segundos == 60) {
                        segundos = 0;
                        minutos++;
                        if (minutos == 60) {
                            minutos = 0;
                            horas++;
                            if (horas == 24) {
                                horas = 0;
                            }
                        }
                    }
                    Thread.sleep(1000);
                }
            }
        }
        sc.close();
    }
}