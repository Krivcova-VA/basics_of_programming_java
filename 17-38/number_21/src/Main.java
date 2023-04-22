import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите цифры");
        String userDits = scan.nextLine();
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "7");
        map.put("2", "8");
        map.put("3", "9");
        map.put("7", "1");
        map.put("8", "2");
        map.put("9", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        map.put("0", "0");
        char check;
        String charStr;
        String res = "";
        for (int i = 0; i < userDits.length(); i++) {
            check = userDits.charAt(i);
            charStr = Character.toString(check);
            res += map.get(charStr);
        }
        System.out.println(res);
    }
}