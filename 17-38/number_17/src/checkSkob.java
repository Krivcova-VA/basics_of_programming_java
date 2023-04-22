public class checkSkob {
    private final String str;
    public checkSkob(String str) {
        this.str = str;
    }
    public boolean check() {
        int skob1 = 0;
        int skob2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                skob1 += 1;
            } else if (str.charAt(i) == ')') {
                skob2 += 1;
            }
        }
        return skob1 == skob2;
    }
}
