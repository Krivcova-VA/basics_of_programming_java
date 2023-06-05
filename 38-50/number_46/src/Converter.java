import java.util.HashMap;
import java.util.Map;
public class Converter {
    public static int arabicConvert(String rimNumb) {

        Map<Character, Integer> rimSymbols = new HashMap<>();
        rimSymbols.put('I', 1);
        rimSymbols.put('V', 5);
        rimSymbols.put('X', 10);
        rimSymbols.put('L', 50);
        rimSymbols.put('C', 100);
        rimSymbols.put('D', 500);
        rimSymbols.put('M', 1000);
        int arabicNumb = 0;
        int prevValue = 0;
        for (int i = rimNumb.length() - 1; i >= 0; i--) {
            char currSymb = rimNumb.charAt(i);
            int currValue = rimSymbols.get(currSymb);
            if (currValue < prevValue) {
                arabicNumb -= currValue;
            }
            else {
                arabicNumb += currValue;
                prevValue = currValue;
            }
        }
        return arabicNumb;
    }
}
