import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String input = "56 65 74 100 99 68 86 180 90";
        String[] weights = input.split(" ");
        Arrays.sort(weights, Comparator.comparingInt(Count::sumValue));
        System.out.println(String.join(" ", weights));
    }
}