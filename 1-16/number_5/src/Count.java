import java.util.Scanner;

public class Count {
    public int sum_count() {
        Scanner input = new Scanner(System.in);
        System.out.println("длина массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("ввод элементов:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("ответ:");
        for (int i = 0; i < size; i++) {
            System.out.print (array[i] + " " );
        }
        int summa = 0;
        for (int element : array) {
            summa += element*element;
        }
        return summa;
    }

}
