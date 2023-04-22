import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "abc abc ab abc ab acs acs";
        String[] arrayStr = str.split(" ");
        ArrayList<String> strUniq = new ArrayList<>();
        strUniq.add(arrayStr[0]);
        for (String elem : arrayStr) {
            if (!strUniq.contains(elem)) {
                strUniq.add(elem);
            }
        }
        System.out.println(strUniq);
    }
}