import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите текст");
        String userDits = scan.nextLine();
        Palindrome pal = new Palindrome();
        if (pal.isPalindrome(userDits)) {
            System.out.println("полиндром; длина " + pal.cntPol());
        } else {
            System.out.println("не полиндром; длина " + pal.cntPol());
        }
    }
}