public class Factorial {
  public static void main(String[] args) {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
    System.out.println(factorio(6));
  }
  public static int factorio(int number){
    int factorial=1;
    for (int i = 0; i <number; i++) {
      factorial*=(i+1);
    }
  return factorial;
  }
}
