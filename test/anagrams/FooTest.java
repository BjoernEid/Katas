package anagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest {
    @Test
    void twoCharacters() {
        assertEquals("of fo", Foo.makeAnagram("of"));
        assertEquals("ok ko", Foo.makeAnagram("ok"));

    }

}
