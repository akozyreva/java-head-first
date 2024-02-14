package LambdasStreams_12;

import java.util.Arrays;
import java.util.List;

public class SmallWordInString {
    public static int findShort(String s) {
        String[] words = s.split("\\s+");
        List<String> wordList = Arrays.asList(words);
        String word = wordList.stream().sorted( (s1, s2) -> s1.length() - s2.length()).findFirst().get();
        return word.length();
    }

    public static void main(String[] args) {
        String phrase = "bitcoin take over the world maybe who knows perhaps";
        findShort(phrase);

    }
}
