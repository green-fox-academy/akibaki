public class Bunnies1 {

  public static int Bunnies(int number) {
    if (number>0){
      return 2+Bunnies(number-1);
    }else {
      return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(Bunnies(34));
  }
}
