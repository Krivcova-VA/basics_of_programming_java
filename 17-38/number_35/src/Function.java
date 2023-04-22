import java.util.HashMap;
import java.util.Map;

public class Function {
    public static Map<Character, Integer> getOften(String text) {
        Map<Character, Integer> often = new HashMap<>();

        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                often.put(c, often.getOrDefault(c, 0) + 1);
            }
        }

        return often;
    }
}
