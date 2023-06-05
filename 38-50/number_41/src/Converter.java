public class Converter {
    public static String calculateTime(int sec) {
        int[] times = {365 * 24 * 60 * 60, 30 * 24 * 60 * 60, 7 * 24 * 60 * 60, 24 * 60 * 60, 60 * 60, 60, 1};
        String[] names = {"год", "месяц", "неделя", "день", "час", "минута", "секунда"};

        StringBuilder res = new StringBuilder();
        boolean previousIncluded = false;

        for (int i = 0; i < times.length; i++) {
            int time = times[i];
            String name = names[i];

            if (sec >= time) {
                int count = sec / time;
                sec %= time;

                if (previousIncluded) {
                    res.append(", ");
                }

                if (count > 1) {
                    res.append(count).append(" ").append(name).append("и");
                } else {
                    res.append(count).append(" ").append(name);
                }

                previousIncluded = true;
            }
        }

        return res.toString();
    }

}
