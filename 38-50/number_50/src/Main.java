import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор");

        List<String> history = Calculater.loadHistory();

        Scanner scanner = new Scanner(System.in);
        String expression;

        while (true) {
            System.out.print("Введите выражение (или 'history' для просмотра истории, 'exit' для выхода): ");
            expression = scanner.nextLine();

            if (expression.equalsIgnoreCase("history")) {
                Calculater.printHistory(history);
                continue;
            } else if (expression.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double result = Calculater.calculate(expression);
                System.out.println("Результат: " + result);
                Calculater.saveHistory(expression, result);
                history.add(expression + " = " + result);
            } catch (Exception e) {
                System.out.println("Ошибка при вычислении выражения: " + e.getMessage());
            }
        }
    }
}