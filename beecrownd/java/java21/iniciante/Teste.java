import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int year = ler.nextInt();
        String century = (!(year % 100 == 0)) ? "Century: " + ((year / 100) + 1) : "Century: " + (year / 100);
        System.out.println(century);
        ler.close();
    }
}
