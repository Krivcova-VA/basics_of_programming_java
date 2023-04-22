import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int m = 5;
        int n = 4;

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r = Math.min(Math.min(i, j), Math.min(m - i - 1, n - j - 1));
                arr[i][j] = r + 1;
            }
        }

        // записываем массив в файл
        try (FileWriter file = new FileWriter("arr.txt")) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    file.write(arr[i][j] + " ");
                }
                file.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}