import java.text.DecimalFormat;
import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        double[] cedulas = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00 };
        double[] moedas = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };
        double totalValue = Math.round(ler.nextDouble() * 100) / 100.0;

        System.out.println("NOTAS:");
        for (int i = 0; i < cedulas.length; i++) {
            int qtdCedulas = (int) (totalValue / cedulas[i]);
            totalValue = Math.round((totalValue % cedulas[i]) * 100) / 100.0;
            System.out.println(qtdCedulas + " nota(s) de R$ " + formato.format(cedulas[i]));
        }

        System.out.println("MOEDAS:");
        for (int a = 0; a < moedas.length; a++) {
            int qtdMoedas = (int) (totalValue / moedas[a]);
            totalValue = Math.round((totalValue % moedas[a]) * 100) / 100.0;
            System.out.println(qtdMoedas + " moeda(s) de R$ " + formato.format(moedas[a]));
        }

        ler.close();
    }
}
