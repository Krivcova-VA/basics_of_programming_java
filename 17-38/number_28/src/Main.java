import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int x = (int) Math.sqrt(n);
        int y = x + 1;

        int razn = y * y - x * x;

        if (razn == n) {
            System.out.println(y * y + "-" + x * x + "=" + razn);
        } else {
            System.out.println("неверный ввод");
        }
    }
}