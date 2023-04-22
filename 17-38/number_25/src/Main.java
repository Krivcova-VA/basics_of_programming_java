import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] dell = new int[args.length - 2];
        for (int i = 2; i < args.length; i++) {
            dell[i - 2] = Integer.parseInt(args[i]);
        }

        int sum = 0;
        boolean tf;
        for (int i = m; i <= n; i++) {
            tf = true;
            for (int j = 0; j < dell.length; j++) {
                if (i % dell[j] != 0) {
                    tf = false;
                    break;
                }
            }
            if (tf) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}