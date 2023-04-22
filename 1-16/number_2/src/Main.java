import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("длина массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("ввод элементов:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("введенные элементы:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
        int cnt = 0;
        for (int element : array) {
            if (element == 1) cnt += 1;
        }
        System.out.println("кол-во сотрудников: " + cnt);
    }
}