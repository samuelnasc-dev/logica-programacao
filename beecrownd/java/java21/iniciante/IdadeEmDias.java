import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dias = ler.nextInt();
        int anos = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;
        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
        ler.close();
    }
}
