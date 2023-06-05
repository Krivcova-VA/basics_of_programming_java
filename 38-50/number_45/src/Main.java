import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("число (от 1 до 9999): ");
        int number = scanner.nextInt();
        String romanNumber = Converter.convertRim(number);
        System.out.println("pимское число: " + romanNumber);
        }
}