import java.util.Arrays;
import java.util.Random;
public class Mtwo {
    Random randomizer = new Random();
    private int size;
    private int[][] matrix;

    public Mtwo(int size) {
        this.size = size;
        matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = randomizer.nextInt(9) + 1;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matrix)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");
    }
    public String transposeMatrix(Mtwo a){
        int[][] temp = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp[j][i] = matrix[i][j];
            }
        }
        return Arrays.deepToString(temp)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");
    }
}

