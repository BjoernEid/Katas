package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
  @Test
  void no_fizzbuzz() {
    assertEquals("1", Fizzbuzz.toString(1));
    assertEquals("2", Fizzbuzz.toString(2));
    assertEquals("4", Fizzbuzz.toString(4));
  }

  @Test
  void fizz() {
    assertEquals("Fizz", Fizzbuzz.toString(3));
    assertEquals("Fizz", Fizzbuzz.toString(6));
    assertEquals("Fizz", Fizzbuzz.toString(9));
  }

  @Test
  void buzz() {
    assertEquals("Buzz", Fizzbuzz.toString(5));
    assertEquals("Buzz", Fizzbuzz.toString(10));
    assertEquals("Buzz", Fizzbuzz.toString(20));
  }

  @Test
  void fizzBuzz() {
    assertEquals("FizzBuzz", Fizzbuzz.toString(15));
  }
}
