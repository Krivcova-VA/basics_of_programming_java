import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] l = {50, 55, 57, 58, 60};
        int maxDist = 175;
        int numCities = 3;

        ArrayList<int[]> comb = Count.getComb(l, numCities);
        int maxSum = -1;
        for (int[] combo : comb) {
            int sum = Arrays.stream(combo).sum();
            if (sum <= maxDist && sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}