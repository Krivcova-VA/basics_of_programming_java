public class Main {
    public static void main(String[] args) {
        String[] glbykvi = {"а", "о", "у", "ы", "э", "е", "ё", "и", "ю", "я"};
        String text = "вероника";
        for (String bykvi : glbykvi) {
            text = text.replace(bykvi, "");
        }
        System.out.println(text);
    }
}