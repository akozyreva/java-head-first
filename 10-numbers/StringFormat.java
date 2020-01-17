public class StringFormat {
    public static void main(String[] args) {
        String x = String.format("%,6.2f", 42.000);
        System.out.println(x);

        String y = String.format("%.3f", 42.000000);
        System.out.println(y);

        int one = 20456654;
        double two = 584357982647.222;
        String s = String.format("Level %,d from %,.2f", one, two);
        System.out.println(s);
    }
}