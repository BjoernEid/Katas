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

        Set<String> finalResult = new HashSet();

        for(int i = 0; i < word.length(); i++) {
            Set<String> result = new HashSet();
            String firstChar = word.substring(0, 1);
            String wordTail = word.substring(1, word.length());

            result.addAll(getPermutationsForLast2Chars(wordTail));

            for(int j = word.length() - 2; j > 0; j--) {
                wordTail = shiftAndRotateWordLeft(wordTail);
                result.addAll(getPermutationsForLast2Chars(wordTail));
            }

            result.forEach(s -> finalResult.add(firstChar.concat(s)));
            word = shiftAndRotateWordLeft(word);
        }

        return finalResult;
    }

    private static String shiftAndRotateWordLeft(String word) {
        String firstChar = word.substring(0, 1);
        String restChar = word.substring(1, word.length());
        String rotatedWord = restChar.concat(firstChar);
        return rotatedWord;

    }

    private static Set<String> getPermutationsForLast2Chars(String word) {
        assert word.length() >= 2;

        final int index = word.length() - 2;
        final String firstChars = word.substring(0, index);

        Set<String> anagrams = getAnagrams(word.substring(index, word.length()));
        String firstPermutation = firstChars.concat(anagrams.toArray(new String[2])[0]);
        String secondPermutation = firstChars.concat(anagrams.toArray(new String[2])[1]);
        return new HashSet<>(Arrays.asList(firstPermutation, secondPermutation));
    }
}
