import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.0");

        int indice = 0;
        double maior = 0, sum = 0;

        double a = ler.nextDouble(), b = ler.nextDouble(), c = ler.nextDouble();
        double[] values = { a, b, c };

        ler.close();

        for (int i = 0; i < values.length; i++) {
            if (values[i] > maior) {
                maior = values[i];
                indice = i;
            }
        }

        int d = 0;
        while (d < values.length) {
            if (d != indice) {
                sum += values[d];
            }
            d++;
        }

        if (sum > maior)
            System.out.println("Perimetro = " + formato.format(sum + maior));
        else
            System.out.println("Area = " + formato.format(((values[0] + values[1]) * values[2]) / 2.0));
    }
}
