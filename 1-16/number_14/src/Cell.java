public class Cell {
    private static Integer [] cel = new Integer[3];
    public Integer [] fillCell(int number) {
        int idMin = 0;
        for (int i = 0; i < 3; i++) {
            if (cel[i] == null) {
                cel[i] = number;
            } else if (cel[i] < cel[idMin]) {
                idMin = i;
            }
        }
        cel[idMin] = number;
        return cel;
    }
}
