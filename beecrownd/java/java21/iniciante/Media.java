import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1 = ler.nextDouble(), n2 = ler.nextDouble(), n3 = ler.nextDouble(), n4 = ler.nextDouble();
        DecimalFormat formato = new DecimalFormat("0.0");
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.println("Media: " + formato.format(media));
        if (media >= 7.0)
            System.out.println("Aluno aprovado.");
        else if (media < 5.0)
            System.out.println("Aluno reprovado.");
        else if (media >= 5.0 && media < 7.0) {
            System.out.println("Aluno em exame.");
            n1 = ler.nextDouble();
            System.out.println("Nota do exame: " + formato.format(n1));
            if (((media + n1) / 2) >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media Final: " + formato.format((media + n1) / 2));
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media Final: " + formato.format((media + n1) / 2));
            }
        }
        ler.close();
    }
}
