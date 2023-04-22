import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число: ");
        int chislo = scanner.nextInt();

        int kvd_final = 0;
        int razn_final = Integer.MAX_VALUE;

        for (int i = 0; i <= chislo; i++) {
            int kvd = i * i;
            int razn = Math.abs(chislo - kvd);

            if (razn < razn_final) {
                razn_final = razn;
                kvd_final = kvd;
            }
        }

        System.out.println("ближайший квадрат: " + kvd_final);
    }
}