import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число: ");
        int num = scanner.nextInt();

        boolean isProst = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isProst = false;
                break;
            }
        }

        if (isProst && num > 1) {
            System.out.println(num + " простое");
        } else {
            System.out.println(num + " простое");
        }
    }
}