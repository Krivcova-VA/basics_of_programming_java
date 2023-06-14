import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class History {
    private static final String HISTORY_FILE = "history.txt";
    public static void saveHistory(String expression, double result) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(HISTORY_FILE, true))) {
            writer.println(expression + " = " + result);
        } catch (IOException e) {
            System.out.println("ошибка при сохранении истории: " + e.getMessage());
        }
    }

    public static List<String> loadHistory() {
        List<String> history = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(HISTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
        } catch (IOException e) {
            System.out.println("ошибка при загрузке истории: " + e.getMessage());
        }

        return history;
    }

    public static void printHistory(List<String> history) {
        System.out.println("История вычислений:");
        for (String item : history) {
            System.out.println(item);
        }
    }
}
