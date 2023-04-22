public class Main {
    public static void main(String[] args) {
        int i = 10; // искомый элемент ряда
        long fib = Fibonacci.getFibonacci(i);
        int maxDigit = Fibonacci.getMaxDigit(fib);
        System.out.printf("f(%d) = %d  ; вернет [(%d, %d)]%n", i, fib, maxDigit, Fibonacci.getCountOfMaxDigit(fib, maxDigit));
    }
}