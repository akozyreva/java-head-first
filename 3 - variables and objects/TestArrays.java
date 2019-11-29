class TestArrays {
    public static void main(String[] args) {
        String [] islands = {"Bermuds", "Fidji", "Azor islands", "Kosumel"};
        int [] index = {1, 3, 0, 2};
        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.println(islands[ref]);
            y += 1;
        }
    }
}