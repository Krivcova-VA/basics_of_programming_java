public class Count {
    public int str_count (String str, char ch) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) cnt += 1;
        }
        return cnt;
    }
}
