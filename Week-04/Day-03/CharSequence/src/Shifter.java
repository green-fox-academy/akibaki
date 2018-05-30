public class Shifter implements CharSequence{

  int number;
  String string;

  Shifter(String string, int number){
    this.string = string;
    this.number = number;
  }

  @Override
  public int length() {
    return this.string.length();
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(index + number);
  }

  @Override
  public CharSequence subSequence(int start , int end) {
    return ((this.string)+(this.string)).subSequence(start + number, end + number);
  }
}
