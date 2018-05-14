import java.util.Arrays;

public class ReverseList {
  public static void main(String[] args) {
    // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
    int[]aj={3,4,5,6,7};
    int[]aja=aj.clone();
    System.out.println(Arrays.toString(aja));
    System.out.println(aj.length);
    for (int i = 0; i <aj.length; i++) {
      aj[i]=aja[aj.length-i-1];
    }
    System.out.println(Arrays.toString(aj));
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
  }
}
