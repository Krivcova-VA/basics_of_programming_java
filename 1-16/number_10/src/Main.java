public class Main {
    public static void main(String[] args) {
        String name = "аНнА";
        String name_final = "";
        name_final = name.toUpperCase().charAt(0) + name.toLowerCase().substring(1);
        System.out.println("Привет, " + name_final);
    }
}