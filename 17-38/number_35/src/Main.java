import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String cipheredText = "шифр, который нужно расшифровать";
        Map<Character, Integer> often = Function.getOften(cipheredText);
        often.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}