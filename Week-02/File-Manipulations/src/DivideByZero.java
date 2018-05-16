public class DivideByZero {

  public static void main(String[] args) {
    int num=5;
    double result=tendivide(num);
    if (num!=0){
      System.out.println(result);
    }
  }


  public static double tendivide(int num) {
  try {
    num= 10/num;
  }catch (Exception e){
    System.out.println("Nullával osztasz, buzi-e vagy?");
  }
  return num;
  }
  // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
}
