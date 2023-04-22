import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите первое число:");
        int first = scanner.nextInt();

        System.out.println("введите шаг:");
        int step = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            int num = first + i * step;
            int square = num * num;
            System.out.print(square + " ");
        }
    }
}