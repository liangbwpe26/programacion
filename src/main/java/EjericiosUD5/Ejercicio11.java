package EjericiosUD5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        DecimalFormat f = new DecimalFormat("##.##");
        System.out.print(
                """
                        
                        Ingresa una conversión: 
                        1- Celsius a Farenheit
                        2- Farenhit a Celsius
                        3- Celsius a Kelvin
                        
                        """
                        );

        opcion = scanner.nextInt();

            switch (opcion){

                case 1 -> {
                    System.out.println("Ingresa los Celsius: ");
                    double Celsius= scanner.nextDouble();

                    double CaF = Celsius * (9.0/5) + 32;
                    System.out.println("Los grados Celsius a Farenheit es: "+ f.format(CaF));
                }
                case 2 ->{
                    System.out.println("Ingresa los Farenheit: ");
                    double Farenheit= scanner.nextDouble();

                    double FaC = (Farenheit - 32) * (5.0/9);
                    System.out.println("Los Farenheit a Celsius son: "+ f.format(FaC));
                }
                case 3 -> {
                    System.out.println("Ingresa los Farenheit: ");
                    double Celsius = scanner.nextDouble();

                    double CaK = Celsius + 273.15;
                    System.out.println("Los Farenheit a Celsius son: "+ f.format(CaK));
                }
            }
    }
}
