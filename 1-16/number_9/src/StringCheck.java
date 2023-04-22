public class StringCheck {
    private final String str1;
    private final String str2;
    public StringCheck(String str2, String str1) {
        this.str1 = str1;
        this.str2 = str2;
    }
    public boolean checkStrEnd () {
        return str2.endsWith(str1);
    }
}
