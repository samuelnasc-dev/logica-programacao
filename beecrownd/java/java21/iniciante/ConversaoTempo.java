import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int seconds = ler.nextInt();
        int hrs = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;
        System.out.println(hrs + ":" + minutes + ":" + seconds);
        ler.close();
    }
}
