public class Count {
    public static int getDigit(int num, int power) {
        int divisor = (int) Math.pow(10, power - 1);
        return num / divisor % 10;
    }
    public static boolean isFactor(int num, int factor) {
        while (num % factor == 0) {
            num /= factor;
        }
        return num == 1;
    }
}
