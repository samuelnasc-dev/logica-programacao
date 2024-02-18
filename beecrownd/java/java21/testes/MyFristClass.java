public class MyFristClass {
    public static void main(String[] args) {
        // Aqui voce pode colocar atriburos nos args[0] e args[1]...!
        System.out.println(GenerateMessage.getMessage());
        System.out.println(AnotherMessage.getMessage());
    }
}

class GenerateMessage {
    static String getMessage() {
        String texto = """
                Sou uma String
                multilinhada
                escrita com java
                """;
        return texto;
    }
}

class AnotherMessage {
    static String getMessage() {
        return "Sou a segunda classe fora da main!";
    }
}