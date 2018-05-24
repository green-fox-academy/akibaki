public class SumDigit {

  public static int SumDigit(int number) {
    if (number / 10 == 0){
      return number % 10;
    } else {
      return number % 10 + SumDigit(number / 10);
    }
  }

  public static void main(String[] args) {
    System.out.println(SumDigit(54324573));
  }
}
