import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormulaBaskara {
    public static void main(String[] args) throws IOException {
        DecimalFormat formato = new DecimalFormat("0.00000");
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble(), b = ler.nextDouble(), c = ler.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            if (a != 0) {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("R1 = " + formato.format(raiz1));
                System.out.println("R2 = " + formato.format(raiz2));
            } else
                System.err.println(" Impossivel calcular");
        } else
            System.out.println("Impossivel calcular");
        ler.close();
    }
}