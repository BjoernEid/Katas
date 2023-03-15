package anagrams;

// Anagram(2) is shift left
// Anagram(3) is shift left for first character and switch of rest
// Anagram(3+) is shift left of first character with all anagrams of the rest


import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;

public class Anagrams {

    public static Set<String> getAllAnagrams(String word) {
        final Set<String> result = new HashSet<>();

        for(int rotations = 0; rotations < word.length(); rotations++) {
            result.add(word);

            final Set<String> anagramsForSubstring = new HashSet<>();
            final String firstChar = word.substring(0, 1);
            anagramsForSubstring.addAll(getAllAnagrams(word.substring(1)));
            anagramsForSubstring.forEach(anagram->result.add(firstChar.concat(anagram)));
            word = shiftLeft(word);
        }

        return result;
    }

    private static String shiftLeft(String word) {
        return word.substring(1).concat(word.substring(0,1));
    }
}
