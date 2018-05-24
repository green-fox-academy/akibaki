public class String1 {

  public static String String1(String string) {
    if (string.length() > 0){
      System.out.println("<"+string.substring(0,1)+">");
      System.out.println(string.substring(1));
      if (string.substring(0,1).equals("x")){
        return "y"+String1(string.substring(1));
      }else {
        return string.substring(0, 1) + String1(string.substring(1));
      }
    }else {
      return"";
    }
  }

  public static void main(String[] args) {
    System.out.println(String1("dxll;kjh;hhxlkjggxyrfyuriutlyitfxxxxxliutyyittiyoxxx"));
  }
  // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
  //dxll;kjh;hhxlkjggxyrfyuriutlyitfxxxxxliutyyittiyoxxx
}
