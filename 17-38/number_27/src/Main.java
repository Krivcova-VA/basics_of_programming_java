import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int ch = scan.nextInt();
        String dir = scan.next();

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                if (dir.equals("right")) {
                    c = (char) ((c - 'a' + ch) % 26 + 'a');
                } else if (dir.equals("left")) {
                    c = (char) ((c - 'a' - ch + 26) % 26 + 'a');
                }
            }
            res += c;
        }

        System.out.println(res);
    }
}