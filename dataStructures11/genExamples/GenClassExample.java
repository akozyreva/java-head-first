package dataStructures11.genExamples;

public class GenClassExample <T> {
    T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        // and now we can specify class with specific generic type
        GenClassExample<Double> generic = new GenClassExample();
        generic.setObject(1.0);
        GenClassExample<Integer> genericInt = new GenClassExample();
        genericInt.setObject(1);
    }
}

