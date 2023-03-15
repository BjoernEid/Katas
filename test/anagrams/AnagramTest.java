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

import java.util.Set;

public class AnagramTest {
    @Test
    void anagramFor2CharacterWord() {
        Assertions.assertEquals(Set.of("ro","or"), Anagrams.getAllAnagrams("ro"));
        Assertions.assertEquals(Set.of("ab","ba"), Anagrams.getAllAnagrams("ab"));
        Assertions.assertEquals(Set.of("xy","yx"), Anagrams.getAllAnagrams("xy"));
    }

    @Test
    void anagramFor3CharacterWord() {
        Assertions.assertEquals(Set.of("iro","ior","roi","rio","ori","oir"), Anagrams.getAllAnagrams("iro"));
    }


}
