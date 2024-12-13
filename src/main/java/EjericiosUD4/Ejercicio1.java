package EjericiosUD4;
import java.text.DecimalFormat;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println();
        int horas, minutos, segundos;

        horas = 24 * 365;
        minutos =  horas * 60;
        segundos = minutos * 60;
        DecimalFormat seg = new DecimalFormat("#########");

        System.out.println("Las horas en un año son: "+ horas);
        System.out.println("Los minutos en un año son: "+ minutos);
        System.out.println("Las segundos en un año son: " + seg.format(segundos));

    }
}