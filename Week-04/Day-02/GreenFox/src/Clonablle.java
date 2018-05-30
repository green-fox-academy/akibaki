public class Clonablle{
  public static void main(String[] args) {
    Student john = new Student("John Doe", 20, "male", "BME");
    Student john2 = null;
    try {
      john2 = john.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    john2.introduce();
    }
  }

