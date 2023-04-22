public class Triangle {
    public double countS2(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double s2 = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return s2;
    }
}
