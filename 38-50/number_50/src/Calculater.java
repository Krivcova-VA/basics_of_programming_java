import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Calculater {
    private static final String HISTORY_FILE = "history.txt";

    static double calculate(String expression) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ')
                    nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length())
                    throw new RuntimeException("Недопустимый символ: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                while (true) {
                    if (eat('+'))
                        x += parseTerm();
                    else if (eat('-'))
                        x -= parseTerm();
                    else
                        return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                while (true) {
                    if (eat('*'))
                        x *= parseFactor();
                    else if (eat('/'))
                        x /= parseFactor();
                    else if (eat('%'))
                        x %= parseFactor();
                    else if (eat('^'))
                        x = Math.pow(x, parseFactor());
                    else if (eat(Integer.parseInt("//")))
                        x = (int) x / parseFactor();
                    else
                        return x;
                }
            }

            double parseFactor() {
                if (eat('+'))
                    return parseFactor();
                if (eat('-'))
                    return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.')
                        nextChar();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z')
                        nextChar();
                    String func = expression.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("abs"))
                        x = Math.abs(x);
                    else
                        throw new RuntimeException("Неизвестная функция: " + func);
                } else {
                    throw new RuntimeException("Недопустимый символ: " + (char) ch);
                }

                if (eat('^'))
                    x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }

    static void saveHistory(String expression, double result) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(HISTORY_FILE, true))) {
            writer.println(expression + " = " + result);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении истории: " + e.getMessage());
        }
    }

    static List<String> loadHistory() {
        List<String> history = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(HISTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке истории: " + e.getMessage());
        }

        return history;
    }

    static void printHistory(List<String> history) {
        System.out.println("История вычислений:");
        for (String item : history) {
            System.out.println(item);
        }
    }
}
