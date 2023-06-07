package romanNumerals;

public class ArabicToRoman {
  private static int[] arabicNumbers = {1,5,10,50,100,500,1000};
  private static String[] romanNumerals = {"I","V","X","L","C","D","M"};

  public static String convert(int number) {
    String result = "";
    for (int index=arabicNumbers.length-1; index >=0 ; index--) {
      int quotient = number / arabicNumbers[index];
      if (quotient > 0) {
        result = romanNumerals[index].repeat(quotient);
        break;
      }
    }
    return result;
  }
}
