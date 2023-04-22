import java.util.Scanner;

public class Cord {
    public float [] cord() {
        Scanner scanner = new Scanner(System.in);
        int size = 2;
        float [] cord = new float [size];
        for (int i = 0; i < size; i++) {
            System.out.println("введите координату:");
            cord[i] = scanner.nextInt();
        }
        return cord;
    }
}
