package EjericiosUD4;
public class Ejercicio5 {
    public static void main(String[] args) {
           double cont = 10;
           double limite = 20;

        boolean a = (cont == 0) && (limite < 20);
        boolean b = (limite >= 20) || (cont < 5);
        boolean c = ((limite/(cont-10)) > 7) || (limite < 20);
        boolean d = (limite<=20) || ((limite/(cont-10)) > 7);
        boolean e = ((limite/(cont-10)) > 7) && (limite < 0);
        boolean f = (limite < 0) && ((limite/(cont-10)) > 7);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
