import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

  public static String sortedString(String string) {
    List<Character> listedString = new ArrayList<>();
    for (char ch : string.toLowerCase().toCharArray()){
      listedString.add(ch);
    }
    Collections.sort(listedString);
    return listedString.toString();
  }

  public static boolean anagram(String string, String string2) {
    return sortedString(string).equals(sortedString(string2));
  }

}
