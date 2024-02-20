import java.text.DecimalFormat;
import java.util.Scanner;

public class Lanche {

    public static void total(int qtd, double price) {
        DecimalFormat formato = new DecimalFormat("0.00");
        System.out.println("Total: R$ " + formato.format(qtd * price));
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cod = ler.nextInt(), qtd = ler.nextInt();
        switch (cod) {
            case 1:
                total(qtd, 4.00);
                break;
            case 2:
                total(qtd, 4.50);
                break;
            case 3:
                total(qtd, 5.00);
                break;
            case 4:
                total(qtd, 2.00);
                break;
            case 5:
                total(qtd, 1.50);
                break;
            default:
                break;
        }
        ler.close();
    }
}
