import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("количество строк: ");
        int rows = scanner.nextInt();

        System.out.print("количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("элементы массива:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        List<Integer> snailSorted = Counter.snail(array);
        System.out.println("массив по змейке: " + snailSorted);
    }
}