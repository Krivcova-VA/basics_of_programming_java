import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 8, 4, 9, 5, 3, 2, 1, 6};
        int idMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[idMax]) {
                idMax = i;
            }
        }

        int[] arrL = Arrays.copyOfRange(arr, 0, idMax);
        int[] arrR = Arrays.copyOfRange(arr, idMax + 1, arr.length);

        System.out.println("исходный массив: " + Arrays.toString(arr));
        System.out.println("max элемент: " + arr[idMax]);
        System.out.println("элементы слева : " + Arrays.toString(arrL));
        System.out.println("элементы справа : " + Arrays.toString(arrR));
    }
}


