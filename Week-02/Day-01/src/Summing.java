public class Summing {
  public static void main(String[] args) {
    //  Create the usual class wrapper
//  and main method on your own.
    int parameter=16;
// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
    System.out.println(sum(parameter));
  }

  public static int sum(int number ) {
    return number*(number+1)/2;
  }
}
