public class StaticExec {
    static int x = 100;
    int y;
    final static int z;
    static final int a = 12;

    static {
        z = 1;
    }

    public void goStatic(final int a) {
        System.out.println(a);
    }

    public void go() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static void main(String[] args) {
        StaticExec obj = new StaticExec();
        StaticExec obj1 = new StaticExec();
        obj.go();
        obj1.go();
        obj.goStatic(12);
    }
}