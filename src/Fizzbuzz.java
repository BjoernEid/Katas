public class Fizzbuzz {
    public static String toString(int i) {
        if (i % 3 == 0) return "Fizz";

        if (i == 5) return "Buzz";

        return String.valueOf(i);
    }
}
