public class SortArray {
    static String rangeSearch(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length-1 ; i++) {

            if (i == 0 && array[i + 1] - array[i] <= 1) {
                stringBuilder
                        .append(array[i])
                        .append("-");
            }

            if (array[i + 1] - array[i] > 1) {
                stringBuilder.append(array[i])
                        .append(",");
            }
            if ((array[i + 1] - array[i] > 1 && array[i + 2] - array[i + 1] == 1)) {
                stringBuilder
                        .append(array[i + 1])
                        .append("-");
            }
        }

        return "диапазоны: " + stringBuilder.toString();
    }
}
