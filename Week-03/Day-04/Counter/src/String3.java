public class String3 {

  public static String String1(String string) {
    if (string.length() > 1) {
        return string.substring(0, 1)+"*" + String1(string.substring(1));
      }
     else {
      return string;
    }
  }

  public static void main(String[] args) {
    System.out.println(String1("KUUVA ANNYAT"));
  }
}
