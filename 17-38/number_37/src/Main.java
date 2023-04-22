import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите количество игроков: ");
        int n = scanner.nextInt();
        System.out.print("введите номер начального игрока: ");
        int start = scanner.nextInt();

        List<Integer> player = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            player.add(i);
        }

        List<Integer> res = new ArrayList<>();
        int cnt = 0;
        int index = start - 1;

        while (player.size() > 1) {
            cnt += 1;
            index = (index + cnt) % player.size();
            if (cnt % 3 == 0) {
                res.add(player.remove(index));
                index -= 1;
            }
        }

        res.addAll(player);
        System.out.println(res);
    }
}