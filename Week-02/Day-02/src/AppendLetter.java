import java.util.*;

public class AppendLetter {
    public static void main(String... args){
      List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
      // Create a method called "appendA()" that adds "a" to every string in the "far" list.
      // The parameter should be a list.

      System.out.println(appendA(far));
    }

  public static List<String> appendA(List<String>input) {
    for (int i = 0; i <input.size(); i++) {
      input.set(i,input.get(i)+"a");
    }
  return input;
    }


// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"

}
