import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("калькулятор");
        List<String> history = History.loadHistory();
        Scanner scanner = new Scanner(System.in);
        String expression;
        while (true) {
            System.out.print("введите выражение,'история' для просмотра истории, 'стоп' для выхода: ");
            expression = scanner.nextLine();
            if (expression.equalsIgnoreCase("история")) {
                History.printHistory(history);
                continue;
            } else if (expression.equalsIgnoreCase("стоп")) {
                break;
            }
            try {
                double result = Calculater.calculate(expression);
                System.out.println("результат: " + result);
                History.saveHistory(expression, result);
                history.add(expression + " = " + result);
            } catch (Exception e) {
                System.out.println("ошибка при вычислении выражения: " + e.getMessage());
            }
        }
    }
}