package anagrams;

public class Foo {
    public static String makeAnagram(String word) {
        StringBuffer result = new StringBuffer(word);
        StringBuffer reverse = new StringBuffer(word).reverse();

        return result.append(" ").append(reverse).toString();
    }
}
