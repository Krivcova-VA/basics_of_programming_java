import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int limit = 100;

        Set<Integer> uSet = new HashSet<>();
        uSet.add(1); //

        for (int x = 1; x <= limit; x++) {
            int y = 2 * x + 1;
            int z = 3 * x + 1;

            uSet.add(y);
            uSet.add(z);
        }

        System.out.println("ряд чисел u без дубликатов:");
        for (int num : uSet) {
            System.out.print(num + " ");
        }
    }
}