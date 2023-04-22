import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cell exCell = new Cell();
        System.out.println(Arrays.toString(exCell.fillCell(1)));
        System.out.println(Arrays.toString(exCell.fillCell(2)));
        System.out.println(Arrays.toString(exCell.fillCell(3)));
    }
}