public class AppendA {
  public static void main(String[] args) {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `am` and assign the value `kuty` to it
    String am="kuty";
// - Write a function called `appendA` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(am)`
    System.out.println(appendA(am));
  }

  public static String appendA(String text) {
    return text+"a";
  }
}
