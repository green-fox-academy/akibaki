public class SumLength {
  public static void main(String[] args) {
    // - Create an array variable named `r`
    int[] r ={54,23,66,12};
//   with the following content: `[54, 23, 66, 12]`

// - Print the sum of the second and the third element
    int sum=0;
    for (int number:r){
      sum+=number;
    }
    System.out.println(sum);
  }
}
