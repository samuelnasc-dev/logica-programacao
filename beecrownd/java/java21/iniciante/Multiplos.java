import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt(), b = ler.nextInt();
        if (b > a) {
            int c = a;
            a = b;
            b = c;
        }
        if (a % b == 0) {
            System.out.println("Sao Multiplos");
        } else
            System.out.println("Nao sao Multiplos");

        ler.close();
    }
}
