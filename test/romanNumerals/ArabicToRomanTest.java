package romanNumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// [1,5,10,50,100,500,1000]
// ["I","V","X","L","C","D","M"]

// 3 = III
// 4 = IV
// 8 = VIII
// 9 = IX
// 29 = XXIX
// 80 = LXXX
// 294 = CCXCIV
// 2019 = MMXIX
// 2849 = MMDCCCXLIX

public class ArabicToRomanTest {
  @Test
  public void testSingleNumerals() {
    Assertions.assertEquals("III", ArabicToRoman.convert(3));
    Assertions.assertEquals("V", ArabicToRoman.convert(5));
    Assertions.assertEquals("XX", ArabicToRoman.convert(20));
    Assertions.assertEquals("MMM", ArabicToRoman.convert(3000));
  }

  @Test
  public void testHigherNumbers() {
    Assertions.assertEquals("VIII", ArabicToRoman.convert(8));
    Assertions.assertEquals("XVIII", ArabicToRoman.convert(18));
    Assertions.assertEquals("XI", ArabicToRoman.convert(11));
    Assertions.assertEquals("MDCLXVIII", ArabicToRoman.convert(1668));
  }

  @Test
  public void testLowerNumbers() {
    Assertions.assertEquals("IV", ArabicToRoman.convert(4));
    Assertions.assertEquals("IX", ArabicToRoman.convert(9));
    Assertions.assertEquals("XL", ArabicToRoman.convert(40));
    Assertions.assertEquals("XLIX", ArabicToRoman.convert(49));
    Assertions.assertEquals("CMXLIX", ArabicToRoman.convert(949));

  }

  @Test
  public void testCombinedNumbers() {
    Assertions.assertEquals("CCXCIV", ArabicToRoman.convert(294));
    Assertions.assertEquals("MMXIX", ArabicToRoman.convert(2019));
    Assertions.assertEquals("MMDCCCXLIX", ArabicToRoman.convert(2849));

  }

}
