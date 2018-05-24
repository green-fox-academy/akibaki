public class Refactorio {
  public static int Refactorio(int n, int it, int res){
    if (it <= n) {
      res = it * Refactorio(n, it+1, res);
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(Refactorio(10,1, 1));
  }

}
