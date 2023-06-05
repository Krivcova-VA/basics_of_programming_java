import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("количество уровней пирамиды: ");
        int cnt = scanner.nextInt();

        int[][] peramida = new int[cnt][];

        for (int i = 0; i < cnt; i++) {
            System.out.print("элементы уровня " + (i+1) + ": ");
            int size = scanner.nextInt();
            peramida[i] = new int[size];

            for (int j = 0; j < size; j++) {
                peramida[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Counter.maxSum(peramida);

        System.out.println("макс сумма: " + maxSum);
    }
}