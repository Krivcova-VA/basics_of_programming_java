import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] secretCode = new int[4];
        for (int i = 0; i < 4; i++) {
            secretCode[i] = random.nextInt(10);
        }

        System.out.println("разгадайте код из четырех чисел");

        int attempts = 20;
        while (attempts > 0) {
            System.out.println("Осталось попыток: " + attempts);
            int[] arr = new int[4];
            System.out.print("Введите 4 числа (от 0 до 9): ");
            for (int i = 0; i < 4; i++) {
                arr[i] = scan.nextInt();
            }

            int cntSovp = 0;
            for (int i = 0; i < 4; i++) {
                if (arr[i] == secretCode[i]) {
                    cntSovp++;
                }
            }

            if (cntSovp == 4) {
                System.out.println("вы разгадали код!");
                return;
            } else {
                System.out.println("совпадений: " + cntSovp);
            }

            attempts--;
        }

        System.out.println("попытки закончились, вы проиграли аххаха");
    }
}