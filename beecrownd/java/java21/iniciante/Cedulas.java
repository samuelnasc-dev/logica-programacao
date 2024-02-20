import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };
        int totalValue = ler.nextInt();
        System.out.println(totalValue);
        for (int i = 0; i < cedulas.length; i++) {
            int qtdCedulas = totalValue / cedulas[i];
            totalValue %= cedulas[i];
            System.out.println(qtdCedulas + " nota(s) de R$ " + cedulas[i] + ",00");
        }
        ler.close();
    }
}
