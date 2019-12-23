class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark () {
        if (size > 60) {
            System.out.println("Haw haw!");
        } else if (size > 14) {
            System.out.println("Wow wow!");
        } else {
            System.out.println("Tiaf tiaf!");
        }
    }
}