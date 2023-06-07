package romanNumerals;

import org.assertj.core.error.AssertionErrorMessagesAggregrator;
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
}
