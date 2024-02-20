import java.text.DecimalFormat;
import java.util.Scanner;

public class NotasMoedas {
    public static double calcularQtds(double[] vetor, double totalValue, int tipo) {
        DecimalFormat formato = new DecimalFormat("0.00");
        for (int i = 0; i < vetor.length; i++) {
            int qtdCedulas = (int) (totalValue / vetor[i]);
            totalValue = Math.round((totalValue % vetor[i]) * 100) / 100.0;
            String msg = (tipo == 1) ? " nota(s) de R$ " : " moeda(s) de R$ ";
            System.out.println(qtdCedulas + msg + formato.format(vetor[i]));
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] cedulas = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00 };
        double[] moedas = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };
        double totalValue = Math.round(ler.nextDouble() * 100) / 100.0;
        System.out.println("NOTAS:");
        totalValue = calcularQtds(cedulas, totalValue, 1);
        System.out.println("MOEDAS:");
        calcularQtds(moedas, totalValue, 0);
        ler.close();
    }
}
