import java.util.ArrayList;
import java.util.List;


public class Counter {
    public static List<Integer> snail(int[][] array) {
        List<Integer> result = new ArrayList<>();

        if (array == null || array.length == 0) {
            return result;
        }

        int topRow = 0;
        int bottomRow = array.length - 1;
        int leftCol = 0;
        int rightCol = array[0].length - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Вправо
            for (int col = leftCol; col <= rightCol; col++) {
                result.add(array[topRow][col]);
            }
            topRow++;

            // Вниз
            for (int row = topRow; row <= bottomRow; row++) {
                result.add(array[row][rightCol]);
            }
            rightCol--;

            // Влево
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    result.add(array[bottomRow][col]);
                }
                bottomRow--;
            }

            // Вверх
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    result.add(array[row][leftCol]);
                }
                leftCol++;
            }
        }

        return result;
    }
}
