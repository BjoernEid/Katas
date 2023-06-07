package romanNumerals;

public class ArabicToRoman {
  // Switch driver navigator more often
  // Respect roles
  // Commit after every assert

  private static String[] romanNumerals = {"I", "V", "X", "L"};
  private static int[] divisors = {1, 5, 10};

  public static String convert(int number) {
    if(number > 4999) {
      return "Numbers higher than 4999 not supported";
    }
    String result = "";
    for (int i = divisors.length - 1; i > 0; i--) {
      int currentDivisor = divisors[i];
      int quotient = number / currentDivisor;
      int rest = number % currentDivisor;
      if (quotient > 0) {
        result += convertToRomanNumeral(quotient, i);
      } else {
        result += convertToRomanNumeral(rest, i);
      }
    }
    return result;
  }

  private static String convertToRomanNumeral(int number, int index) {
    if (number == 0) {
      return "";
    }
    if (number < 4) {
      return convertToI(number, romanNumerals[index]);
    }
    if (number == 4) {
      return romanNumerals[index - 1] + romanNumerals[index];
    }
    if (number < 9) {
      return romanNumerals[index] + convertToI(number - divisors[index], romanNumerals[index - 1]);
    }
    return romanNumerals[index - 1] + romanNumerals[index + 1];
  }

  private static String convertToI(int number, String symbol) {
    if (number == 0) {
      return "";
    }
    return symbol + convertToI(number - 1, symbol);
  }
}
