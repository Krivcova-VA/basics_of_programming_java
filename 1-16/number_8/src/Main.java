import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите длины трех отрезков:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            double a_rad = Math.acos((b * b + c * c - a * a) / (2.0 * b * c));
            double b_rad = Math.acos((c * c + a * a - b * b) / (2.0 * c * a));
            double c_rad = Math.acos((a * a + b * b - c * c) / (2.0 * a * b));

            double maxAngle = Math.toDegrees(Math.max(a_rad, Math.max(b_rad, c_rad)));

            System.out.println("составить треугольник можно; наибольший внешний угол: " + maxAngle);
        } else {
            System.out.println("составить треугольник невозможно");
        }
    }
}