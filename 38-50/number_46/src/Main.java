import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("римское число (от I до MMMCMXCIX): ");
        String rimNumb = scanner.nextLine();
        int arabicNumb = Converter.arabicConvert(rimNumb);
        System.out.println("aрабское число: " + arabicNumb);
    }
}