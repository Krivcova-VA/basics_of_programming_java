public class Calculater {

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
                    throw new RuntimeException("недопустимый символ: " + (char) ch);
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
                        throw new RuntimeException("неизвестная функция: " + func);
                } else {
                    throw new RuntimeException("недопустимый символ: " + (char) ch);
                }
                if (eat('^'))
                    x = Math.pow(x, parseFactor());
                return x;
            }
        }.parse();
    }
}
