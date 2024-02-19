import java.io.IOException;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int distance = ler.nextInt();
        System.out.println(distance * 2 + " minutos");
        ler.close();
    }
}
