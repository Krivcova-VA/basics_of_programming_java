public class Main {
    public static void main(String[] args) {
        String text = "В программу поступает текст в виде одного предложения.";
        String[] sent = text.split("\\.\\s*");

        for (int i = 0; i < sent.length; i++) {
            String[] sent1 = sent[i].split("\\s+");
            for (int j = 0; j < sent1.length; j++) {
                char firstLetter = sent1[j].charAt(0);
                String rest = sent1[j].substring(1);
                sent1[j] = rest + firstLetter + "ауч";
            }
            sent[i] = String.join(" ", sent1) + ".";
        }

        String res = String.join(" ", sent);
        System.out.println(res);
    }
}