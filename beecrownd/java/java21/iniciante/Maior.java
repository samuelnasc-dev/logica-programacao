import java.io.IOException;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int[] numers = new int[3];
        int maior = 0;

        for (int i = 0; i < 3; i++) {
            int n = ler.nextInt();
            numers[i] = n;
            if (numers[i] > maior) {
                maior = numers[i];
            }
        }

        System.out.println(maior + " eh o maior");

        ler.close();

    }
}
