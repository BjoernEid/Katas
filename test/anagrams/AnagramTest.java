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
        Assertions.assertTrue(Anagram.getAnagrams("iro").containsAll(anagrams));

        anagrams = new HashSet<>(Arrays.asList("abc", "acb"));
        Assertions.assertTrue(Anagram.getAnagrams("abc").containsAll(anagrams));
    }

    @Test
    void wordWith3CharsReturnsAllAnagrams() {
        Set<String> anagrams = new HashSet<>(Arrays.asList("iro", "ior", "roi", "rio", "ori", "oir"));
        Assertions.assertEquals(anagrams, Anagram.getAnagrams("iro"));
    }

    @Test
    void returnsAllAnagramsForTheLastThreeCharacters() {
        Set<String> anagrams = new HashSet<>(Arrays.asList(
            "biro", "bior", "brio", "broi", "boir", "bori"
        ));
        System.out.println(Anagram.getAnagrams("biro"));
        Assertions.assertTrue(Anagram.getAnagrams("biro").containsAll(anagrams));
    }

//    Wir nehmen an, dass die Anzahl der Permutationen Fakultaet von Leange des Wortes ist.
//    4*3*2*1 = 24
//    5*4*3*2*1 = 120

//    @Test
//    void wordWith4CharsReturns24Anagrams() {
//        Set<String> anagrams = new HashSet<>(Arrays.asList(
//                "biro", "bior", "brio", "broi", "boir", "bori",
//                "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
//                "rbio", "rboi", "ribo", "riob", "roib", "robi",
//                "obir", "obri", "oibr", "oirb", "orbi", "orib"
//        ));
//        System.out.println(Anagram.getAnagrams("biro"));
//        Assertions.assertTrue(Anagram.getAnagrams("biro").containsAll(anagrams));
//    }
}
