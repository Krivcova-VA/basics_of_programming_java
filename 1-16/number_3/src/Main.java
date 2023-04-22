public class Main {
    public static void main(String[] args) {
        Cord zn = new Cord();
        float [] A = zn.cord();
        float [] B = zn.cord();
        float [] C = zn.cord();
        Count count = new Count(A, B, C);
        System.out.println("координатф барицентра: " + count.xBar() + ";" + count.yBar());
    }
}