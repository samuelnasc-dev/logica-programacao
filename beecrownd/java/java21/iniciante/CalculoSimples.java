import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) throws IOException {

        int cod, qtdPecas, i = 0;
        double valorPeca, soma = 0;

        Scanner ler = new Scanner(System.in);

        while (i < 2) {
            cod = ler.nextInt();
            qtdPecas = ler.nextInt();
            valorPeca = ler.nextDouble();
            soma += qtdPecas * valorPeca;
            i++;
        }

        DecimalFormat formato = new DecimalFormat("#.00");

        System.out.println("VALOR A PAGAR: R$ " + formato.format(soma));

        ler.close();
    }
}
