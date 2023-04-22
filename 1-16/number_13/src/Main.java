import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите начало ряда:");
        int start = scanner.nextInt();

        System.out.println("введите шаг:");
        int step = scanner.nextInt();

        System.out.println("введите количество шагов:");
        int cnt = scanner.nextInt();

        for (int i = 0; i < cnt; i++) {
            int num = start + i * step;
            System.out.print(num + " ");
        }
    }
}