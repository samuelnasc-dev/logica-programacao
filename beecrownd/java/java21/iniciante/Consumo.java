import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) throws IOException {
        DecimalFormat formato = new DecimalFormat("0.000");
        Scanner ler = new Scanner(System.in);
        int distance = ler.nextInt();
        double litros = ler.nextDouble();
        System.out.println(formato.format(distance / litros) + " km/l");
        ler.close();
    }
}
