public class Wrapper {
    Integer i; // null, no ref to obj
    int j; // 0

    public void go() {
        //i = j; shouldn't work!
        System.out.println(j);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        w.go();
    }
}