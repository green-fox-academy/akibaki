import java.util.Arrays;
public class PrintArguments {
  public static void main(String[] args) {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...
    printParams("first", "second", "third", "fourh");
  }

  public static void printParams(String... whatever) {
    String output="";
    for (String row:whatever) {
      output+=row;
    }
    System.out.println(output);
  }
}
