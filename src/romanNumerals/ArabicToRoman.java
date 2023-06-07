package romanNumerals;

public class ArabicToRoman {
  private static int[] arabicNumbers = {1,5,10,50,100,500,1000};
  private static String[] romanNumerals = {"I","V","X","L","C","D","M"};

  public static String convert(int number) {
    String result = "";
    for (int index=arabicNumbers.length-1; index >=0 ; index--) {
      int dividend = arabicNumbers[index];
      int quotient = number / dividend;
      int rest = number - dividend * quotient;
      if (quotient > 0) {
        if (number > 8 && (number == 9 || (quotient == 1 && rest >= 4 * arabicNumbers[index - 1]))) {
          result += romanNumerals[index - 1] + romanNumerals[index + 1];
          number = number - (arabicNumbers[index - 1] * 9);
        } else
        if (quotient == 4) {
          result += romanNumerals[index] + romanNumerals[index + 1];
          number = number - (arabicNumbers[index] * 4);
        } else
        if (quotient <= 3) {
          result += romanNumerals[index].repeat(quotient);
          number = number % dividend;
        }
      }
    }
    return result;
  }
}
