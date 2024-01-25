class Dog1 {
    String name;
    public static void main(String[] args) {
        
        Dog1 Dog11 = new Dog1();
        Dog11.bark();
        Dog11.name = "Bart";

        Dog1[] myDog1s = new Dog1[3];
        myDog1s[0] = new Dog1();
        myDog1s[1] = new Dog1();
        myDog1s[2] = Dog11;

        myDog1s[0].name = "Fred";
        myDog1s[1].name = "George";

        System.out.println("The name of last Dog1 is " + myDog1s[2].name);
        int x = 0;
        while(x < myDog1s.length) {
            myDog1s[x].bark();
            x = x + 1;
        }

    }

    public void bark() {
        System.out.println(name + " : hav-hav!");
    }

    public void eat() {}
    public void chaseCat() {}
}