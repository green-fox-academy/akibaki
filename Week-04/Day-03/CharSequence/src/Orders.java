public class Orders {
  public static void main(String[] args) {
    Gnirts gnirts = new Gnirts("this example");
    System.out.println(gnirts.length());
    System.out.println(gnirts.charAt(2));
    System.out.println(gnirts.subSequence(2,6));

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
    System.out.println(s.charAt(2));
    System.out.println(s.subSequence(2,6));
  }
}
