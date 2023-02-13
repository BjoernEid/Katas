import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void no_fizzbuzz() {
        assertEquals("1", Fizzbuzz.toString(1));
        assertEquals("2", Fizzbuzz.toString(2));
        assertEquals("4", Fizzbuzz.toString(4));
    }

    @Test
    public void fizz() {
        assertEquals("Fizz", Fizzbuzz.toString(3));
        assertEquals("Fizz", Fizzbuzz.toString(6));
    }
}
