import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("первое число: ");
        String num1 = scanner.nextLine();
        System.out.print("второе число: ");
        String num2 = scanner.nextLine();
        String sum = Counter.sumStr(num1, num2);
        System.out.println("cумма: " + sum);
    }
}