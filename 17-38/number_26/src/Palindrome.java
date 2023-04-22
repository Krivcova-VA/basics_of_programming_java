public class Palindrome {
    public static int count = 0;
    public boolean isPalindrome(String word) {
        String check = "";
        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                check = "false";
                continue;
            }
            count += 2;
        }
        if (check.equals("false")) {
            cntPol();
            return false;
        } else {
            cntPol();
            return true;
        }

    }
    public int cntPol() {
        return count;
    }
}
