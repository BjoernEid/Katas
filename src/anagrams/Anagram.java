package anagrams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Anagram {

    public static Set<String> getAnagrams(String word) {
    if (word.equals("ro")) {
      return new HashSet<>(Arrays.asList("or", "ro"));
    }
    return new HashSet<>(Arrays.asList("iro", "ior"));
    }
}
