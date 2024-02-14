package LambdasStreams_12;

public class MethodReferenceExample {
    void close() {
        System.out.println("Close.");
    }

    public static void main(String[] args) throws Exception {
        MethodReferenceExample referenceObj = new MethodReferenceExample();
        // it's convenient operator
        // () -> referenceObj.close() it's too much code.
        // it's method reference example
        try (AutoCloseable ac = referenceObj::close;) {
        }
    }
}
