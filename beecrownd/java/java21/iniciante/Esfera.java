import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) throws IOException {

        DecimalFormat formato = new DecimalFormat("#.000");
        Scanner ler = new Scanner(System.in);
        double raio = ler.nextDouble();
        System.out.println("VOLUME = " + formato.format((4 / 3.0) * 3.14159 * raio * raio * raio));
        ler.close();
    }
}
