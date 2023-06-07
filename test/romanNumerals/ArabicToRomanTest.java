package romanNumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArabicToRomanTest {
  @Test
  void testOnes() {
    Assertions.assertEquals("I", ArabicToRoman.convert(1));
    Assertions.assertEquals("II", ArabicToRoman.convert(2));
    Assertions.assertEquals("III", ArabicToRoman.convert(3));
    Assertions.assertEquals("IV", ArabicToRoman.convert(4));
    Assertions.assertEquals("V", ArabicToRoman.convert(5));
    Assertions.assertEquals("VI", ArabicToRoman.convert(6));
    Assertions.assertEquals("VII", ArabicToRoman.convert(7));
    Assertions.assertEquals("VIII", ArabicToRoman.convert(8));
    Assertions.assertEquals("IX", ArabicToRoman.convert(9));
  }

  @Test
  void testTenth() {
    Assertions.assertEquals("X", ArabicToRoman.convert(10));
  }
}
