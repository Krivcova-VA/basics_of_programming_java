import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("калькулятор");
        Scanner scanner = new Scanner(System.in);
        String expression;
        while (true) {
            System.out.print("введите выражение, 'stop' для выхода: ");
            expression = scanner.nextLine();
            if (expression.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                double result = Calculater.calculate(expression);
                System.out.println("результат: " + result);
            } catch (Exception e) {
                System.out.println("ошибка при вычислении выражения: " + e.getMessage());
            }
        }
    }
}