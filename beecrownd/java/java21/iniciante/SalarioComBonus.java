import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SalarioComBonus {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        String nome = ler.next();
        double salario = ler.nextDouble();
        double vendas = ler.nextDouble();

        // formatar a saida
        DecimalFormat formato = new DecimalFormat("#.00");

        System.out.println("TOTAL = R$ " + formato.format(vendas * 15 / 100 + salario));

        ler.close();
    }

}