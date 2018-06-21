import java.util.*;

public class CountLetters {

  public static Map<Character, Integer> lettersOccurance(String string) {
    List<Character> listedString = new ArrayList<>();
    for (char ch : string.toLowerCase().toCharArray()){
      listedString.add(ch);
    }
    Collections.sort(listedString);
    int counter = 1;
    Map<Character, Integer> lettersOccurance = new HashMap<>();
    for (int i = 0; i < listedString.size() - 1; i++) {
      if (listedString.get(i) == listedString.get(i + 1)){
        counter ++;
      }
      else {
        lettersOccurance.put(listedString.get(i), counter);
        counter = 1;
      }
    }
    if (counter == 1){
      lettersOccurance.put(listedString.get(listedString.size()-1), counter);
    }

    return lettersOccurance;
  }

  public static void main(String[] args) {
    System.out.println(lettersOccurance("Casanova").get((char)"a"));
  }
}