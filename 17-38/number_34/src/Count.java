public class Count {
    public static int sumValue(String numb) {
        int sum = 0;
        for (int i = 0; i < numb.length(); i++) {
            sum += Character.getNumericValue(numb.charAt(i));
        }
        return sum;
    }
}
