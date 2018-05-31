import java.util.ArrayList;

public class Sum {

  public static int sum(ArrayList<Integer> numbers){
    if (numbers == null) {
      return 0;
    }
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}
