public class Main {
    public static void main(String[] args) {
        String text = "ABccAAr";
        int cntA = 0;
        int cnta = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == text.toUpperCase().charAt(i)) {
                cntA += 1;
            } else {
                cnta += 1;
            }
        }
        if (cntA > cnta) {
            System.out.println(text.toUpperCase());
        } else {
            System.out.println(text.toLowerCase());
        }
    }
}