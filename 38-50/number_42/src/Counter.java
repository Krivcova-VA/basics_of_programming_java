import java.util.List;

public class Counter {
    public static int calculateInterval(List<int[]> intervls) {
        int cnt = 0;
        for (int[] intervl : intervls) {
            int start = intervl[0];
            int end = intervl[1];
            cnt += end - start - 1;
        }
        return cnt;
    }
}
