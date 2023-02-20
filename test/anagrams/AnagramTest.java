package anagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {
    @Test
    void twoCharacters() {
        assertEquals("of fo", new Anagram("of").toString());
        assertEquals("ok ko", new Anagram("ok").toString());
        assertEquals("ip pi", new Anagram("ip").toString());
    }

    @Test
    void threeCharactersWith2Permutations() {
        // assertEquals("oha hao aho hoa", Foo.makeAnagram("oha"));
        String input = "oha";
        String result = new Anagram(input).toString();
        assertEquals("oha hao", result);

        input = "the";
        result = new Anagram(input).toString();
        assertEquals("the het", result);

        input = "bee";
        result = new Anagram(input).toString();
        assertEquals("bee eeb", result);
   }

   @Test
   void threeCharactersWith3Permutations() {
       String input = "oha";
       String result = new Anagram(input).toString();
       assertEquals("oha hao aoh", result);
   }
}
