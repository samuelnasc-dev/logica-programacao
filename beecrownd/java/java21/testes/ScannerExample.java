import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {

    public static void main(String... args) {
        String wordsAndNumbers = """
                Longing rusted puta furnace
                daybreak 17 benign puta
                9 homecoming 1 puta
                freight puta car
                putaria
                putaa amor
                """;
        // encontra todas as ocorrencia da palavra "puta" e imprime!
        try (Scanner scanner = new Scanner(wordsAndNumbers)) {
            scanner.findAll("puta").map(MatchResult::group).forEach(System.out::println);
        }
    }
}
