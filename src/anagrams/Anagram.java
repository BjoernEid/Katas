package anagrams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Anagram {

    public static Set<String> getAnagrams(String word) {

        if (word.length() == 2) {
            final String firstChar = word.substring(0, 1);
            final String secondChar = word.substring(1, 2);
            return new HashSet<>(Arrays.asList(word, secondChar.concat(firstChar)));
        }

        return getPermutationsForLast2Chars(word);
    }

    private static Set<String> getPermutationsForLast2Chars(String word) {
        final String firstChar = word.substring(0, 1);
        String firstPermutation = firstChar.concat(getAnagrams(word.substring(1, 3)).toArray(new String[2])[0]);
        String secondPermutation = firstChar.concat(getAnagrams(word.substring(1, 3)).toArray(new String[2])[1]);
        return new HashSet<>(Arrays.asList(firstPermutation, secondPermutation));
    }
}
