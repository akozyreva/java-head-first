package dataStructures11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // String - is key type
        // Integer is value type
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Katy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);
        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
