import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int hrs = ler.nextInt();
        double velocidade = ler.nextDouble();
        DecimalFormat formato = new DecimalFormat("0.000");
        System.out.println(formato.format(velocidade / 12 * hrs));
        ler.close();
    }
}
