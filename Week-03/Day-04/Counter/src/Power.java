public class Power {

  public static int Power(int base, int power) {
    if (power > 0) {
      return base * Power(base, power - 1);
    } else {
      return 1;
    }
  }

  public static void main(String[] args) {
    System.out.println(Power(4,5));
  }
}
