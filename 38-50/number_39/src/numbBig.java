import java.util.Arrays;

public class numbBig {
    public int numbBig1(int numb) {
        int[] numbers = Integer.toString(numb).chars().map(c -> c - '0').toArray();
        int i = numbers.length - 2;
        while (i >= 0 && numbers[i] >= numbers[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = numbers.length - 1;
        while (numbers[j] <= numbers[i]) {
            j--;
        }
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        Arrays.sort(numbers, i + 1, numbers.length);
        int nextNumber = Integer.parseInt(Arrays.toString(numbers)
                .replaceAll("[\\[\\]\\,\\s]", ""));
        return (nextNumber > numb) ? nextNumber : -1;
    }
}
