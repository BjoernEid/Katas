package anagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest {
    @Test
    void twoCharacters() {
        assertEquals("of fo", Foo.makeAnagram("of"));
        assertEquals("ok ko", Foo.makeAnagram("ok"));
        assertEquals("ip pi", Foo.makeAnagram("ip"));
    }

    @Test
    void threeCharactersWith2Permutations() {
        // assertEquals("oha hao aho hoa", Foo.makeAnagram("oha"));
        final String input = "oha";
        final String result = Foo.makeAnagram(input);
        assertEquals("oha hao", result);
    }
}
