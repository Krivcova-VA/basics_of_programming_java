import java.util.ArrayList;
import java.util.Arrays;

public class Count {
    public static ArrayList<int[]> getComb(int[] arr, int n) {
        ArrayList<int[]> res = new ArrayList<>();
        int[] combo = new int[n];
        combHelper(res, arr, combo, 0, 0);
        return res;
    }

    private static void combHelper(ArrayList<int[]> res, int[] arr, int[] combo, int index, int start) {
        if (index == combo.length) {
            res.add(Arrays.copyOf(combo, combo.length));
        } else {
            for (int i = start; i < arr.length; i++) {
                combo[index] = arr[i];
                combHelper(res, arr, combo, index + 1, i + 1);
            }
        }
    }
}
