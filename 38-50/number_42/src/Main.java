import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> intervls = new ArrayList<>();
        System.out.print("количество интервалов: ");
        int numIntervals = scanner.nextInt();

        for (int i = 1; i <= numIntervals; i++) {
            System.out.print("начало интервала " + i + ": ");
            int start = scanner.nextInt();

            System.out.print("конец интервала " + i + ": ");
            int end = scanner.nextInt();

            intervls.add(new int[]{start, end});
        }
        int res = Counter.calculateInterval(intervls);
        System.out.println("Количество чисел между интервалами: " + res);
    }
}