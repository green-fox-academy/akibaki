public class Counter {

  public static int Counter(int n, int it, int sum){
    if (it <= n) {
      sum = it + Counter(n, it+1, sum);
    }
      return sum;
  }

  public static void main(String[] args) {
    System.out.println(Counter(50,0, 0));
  }

}
