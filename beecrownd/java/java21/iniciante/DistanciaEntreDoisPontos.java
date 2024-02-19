import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args) throws IOException {

        DecimalFormat formato = new DecimalFormat("0.0000");
        Scanner ler = new Scanner(System.in);

        double x1 = ler.nextDouble();
        double y1 = ler.nextDouble();
        double x2 = ler.nextDouble();
        double y2 = ler.nextDouble();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(formato.format(distance));
        ler.close();

    }
}
