import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();

        DecimalFormat formato = new DecimalFormat("00.000");

        System.out.println(
                "TRIANGULO: " + formato.format(a * c / 2) +
                        "\nCIRCULO: " + formato.format(3.14159 * c * c) +
                        "\nTRAPEZIO: " + formato.format((a + b) * c / 2) +
                        "\nQUADRADO: " + formato.format(b * b) +
                        "\nRETANGULO: " + formato.format(a * b));

        // 3,0 4,0 5,2
        // 12,7 10,4 15,2
        ler.close();
    }

}
