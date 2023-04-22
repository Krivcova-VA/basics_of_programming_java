import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        boolean sashaStr = true;
        while (n > 1) {
            if (n % 2 == 0) {
                if (sashaStr) {
                    n = n / 2;
                } else {
                    n = n - 1;
                }
            } else {
                n = n - 1;
            }
            sashaStr = !sashaStr;
        }
        if (sashaStr) {
            System.out.println("Таня");
        } else {
            System.out.println("Саша");
        }
    }
}