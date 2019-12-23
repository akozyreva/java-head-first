class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("1 dog: " + one.getSize());
        System.out.println("1 dog: " + two.getSize());
        one.bark();
        two.bark();
    }
}