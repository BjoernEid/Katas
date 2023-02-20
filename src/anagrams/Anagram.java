package anagrams;

public class Anagram {

  private String word;

  public Anagram(String word) {
    this.word = word;
  }

  public String toString() {
    assert(this.word.length() >= 2);
    if (this.word.length() == 2) {
      StringBuffer result = new StringBuffer(this.word);
      StringBuffer reverse = new StringBuffer(this.word).reverse();

      return result.append(" ").append(reverse).toString();
    }

    String last = this.word.substring(1, this.word.length());
    String first = this.word.substring(0, 1);
    return this.word.concat(" ").concat(last).concat(first);
    }
}
