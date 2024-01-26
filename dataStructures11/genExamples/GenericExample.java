package dataStructures11.genExamples;

public class GenericExample {
    public static void main(String[] args) {
        // generics work with classes, not with
        // primitive types itself
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.0, 2.0, 4.0};
        Character[] charArray = {'a', 'b', 'c'};
        // now read method passed to all arrays
        read(intArray);
        read(doubleArray);
        read(charArray);
    }

    // in order not to write for evey data type it's own overloading method
    // use generics instead
    public static <T> void read(T[] valuesArr){
        System.out.println(valuesArr[0].getClass()); // and it shows type, which was passed, e.g. Charachter or Integer
        for(T val: valuesArr){
            System.out.println(val);
        }
    }
}
