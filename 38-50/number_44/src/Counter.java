public class Counter {
    public static String sumStr(String num1, String num2) {
        int numb1 = Integer.parseInt(num1);
        int numb2 = Integer.parseInt(num2);
        int sum = numb1 + numb2;
        String res = String.valueOf(sum);
        return res;
    }
}
