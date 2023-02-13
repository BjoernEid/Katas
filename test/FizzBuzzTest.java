import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void no_fizzbuzz() {
        assertEquals("1", Fizzbuzz.toString(1));
        assertEquals("2", Fizzbuzz.toString(2));
    }
}
