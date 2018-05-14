import java.util.Arrays;

public class AppendAArray {
  public static void main(String[] args) {
    // - Create an array variable named `animals`
//   with the following content: `["kuty", "macsk", "cic"]`
    String[]animals={"kuty", "macsk", "cic"};
    for (int i = 0; i <animals.length; i++) {
      animals[i]+="a";
    }
// - Add all elements an `"a"` at the end
    System.out.println(Arrays.deepToString(animals));
  }
}
