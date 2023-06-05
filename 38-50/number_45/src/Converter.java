public class Converter {
    public static String convertRim(int number) {
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arabVal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder rimNumb = new StringBuilder();
        int i = 0;
        while (number > 0) {
            if (number >= arabVal[i]) {
                rimNumb.append(romanSymbols[i]);
                number -= arabVal[i];
            } else {
                i++;
            }
        }
        return rimNumb.toString();
    }
}
