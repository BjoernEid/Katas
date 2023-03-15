package anagrams;

// Anagram(2) is shift left
// Anagram(3) is shift left for first character and switch of rest
// Anagram(3+) is shift left of first character with all anagrams of the rest


import java.util.HashSet;
import java.util.Set;

public class Anagrams {

    public static Set<String> getAllAnagrams(String word) {
        final Set<String> result = new HashSet<>();
        result.add(word);
        result.add(shiftLeft(word));
        return result;
    }

    private static String shiftLeft(String word) {
        return word.substring(1).concat(word.substring(0,1));
    }
}
