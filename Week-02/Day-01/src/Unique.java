import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
public class Unique {
  public static void main(String[] args) {


        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example {21, 12,29,3,1,12,29,33,1,5}
        System.out.println(Arrays.toString(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34})));
        //  should print: `[1, 11, 34, 52, 61]`
  }

  public static int[] unique(int[] numbers) {
    Arrays.sort(numbers);
    int[] deletednumbers= new int[numbers.length];
    int i=1;
    deletednumbers[0]=numbers[0];
    for (int number:numbers) {
      if (number==deletednumbers[i-1]){
      } else {
          i = i + 1;
          deletednumbers[i-1] = number;

      }
    }
    int[]finalnumbers=Arrays.copyOf(deletednumbers,i);
    return finalnumbers;
  }

}
