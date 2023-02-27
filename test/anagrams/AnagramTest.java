package anagrams;

//        Write a program to generate all potential anagrams of an input string.
//        For example, the potential anagrams of "biro" are
//
//        biro bior brio broi boir bori
//        ibro ibor irbo irob iobr iorb
//        rbio rboi ribo riob roib robi
//        obir obri oibr oirb orbi orib

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnagramTest {
    @Test
    void flipLast2Characters() {
        Set<String> anagrams = new HashSet<>(Arrays.asList("ro", "or"));
        Assertions.assertEquals(anagrams, Anagram.getAnagrams("ro"));

        anagrams = new HashSet<>(Arrays.asList("iro", "ior"));
        Assertions.assertEquals(anagrams, Anagram.getAnagrams("iro"));

        anagrams = new HashSet<>(Arrays.asList("abc", "acb"));
        Assertions.assertEquals(anagrams, Anagram.getAnagrams("abc"));

    }
}
