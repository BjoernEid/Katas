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

        if (word.length() == 2) {
            result.add(word);
            result.add(shiftLeft(word));
            return result;
        }

        if (word.length() == 3) {
            return getAnagramsFor3CharWord(word);
        }

        for(int rotations = 0; rotations < word.length(); rotations++) {
            final Set<String> anagramsForSubstring = new HashSet<>();
            final String firstChar = word.substring(0, 1);
            anagramsForSubstring.addAll(getAllAnagrams(word.substring(1)));
            anagramsForSubstring.forEach(anagram->result.add(firstChar.concat(anagram)));
            word = shiftLeft(word);
        }

        return result;
    }

    private static Set<String> getAnagramsFor3CharWord(String word) {
        final Set<String> result = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            word = shiftLeft(word);
            result.add(word);

            for(int switchIndex = 0; switchIndex < word.length() - 1; switchIndex++) {
                final String newWord = switch2CharsAtIndex(word, switchIndex);
                result.add(newWord);
            }
        }

        return result;
    }

    private static String switch2CharsAtIndex(String word, int index) {
        final char[] chars = word.toCharArray();

        final char c = chars[index];
        chars[index] = chars[index+1];
        chars[index+1] = c;

        return new String(chars);
    }

    private static String shiftLeft(String word) {
        return word.substring(1).concat(word.substring(0,1));
    }
}
