class callFunc {
    static int calcArea (int height, int width) {
        return height * width;
    }
    public static void main(String[] args) {
        int a = calcArea(7, 12);
        short c = 7;
        calcArea(c, 15);
        calcArea(2, 3);
        long t = 42;
        //int f = calcArea(t, 17);
        //byte h = calcArea(4, 20);
        
    }
}