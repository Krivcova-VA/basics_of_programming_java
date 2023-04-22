import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int start = scan.nextInt();

        int sum = 0;
        int power = 1;
        while (true) {
            int dig = Count.getDigit(num, power);
            if (dig == 0) {
                break;
            }
            sum += Math.pow(start, power) * dig;
            power++;
        }

        for (int i = 2; i <= Math.pow(2, 6); i++) {
            if (sum % i == 0 && Count.isFactor(start, i)) {
                System.out.println(sum + " = " + start + " * " + (sum / i));
                return;
            }
        }

        System.out.println("операция не возможна");
    }
}