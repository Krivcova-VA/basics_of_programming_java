import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Введите количество секунд: ");
         int sec = scanner.nextInt();
         String res = Converter.calculateTime(sec);
         System.out.println(res);

    }
}               