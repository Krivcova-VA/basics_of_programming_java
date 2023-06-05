public class Counter {
    public static int maxSum(int[][] peramida) {
        int lenP = peramida.length;
        for (int i = lenP - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                int maxSum = Math.max(peramida[i+1][j], peramida[i+1][j+1]);
                peramida[i][j] += maxSum;
            }
        }
        return peramida[0][0];
    }
}
