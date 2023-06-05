public class Counter {
    public static int fusc(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                int temp = a;
                a = b;
                b = temp + b;
                n = (n - 1) / 2;
            }
        }

        return a + b;
    }
}
