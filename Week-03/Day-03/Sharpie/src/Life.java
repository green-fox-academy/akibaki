public class Life {
  public static void main(String[] args) {

    Sharpie capali = new Sharpie("Red", 143);
    System.out.println(capali.inkAmount);
    capali.use();
    System.out.println(capali.inkAmount);
  }
}
