package anagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest {
    @Test
    void bar() {
        assertEquals("of fo", Foo.makeAnagram("of"));
    }
}
