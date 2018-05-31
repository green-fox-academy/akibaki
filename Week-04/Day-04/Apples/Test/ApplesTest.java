import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  static Apples apples;

  @BeforeClass
  public static void init() {
    apples = new Apples();
  }

  @Test
  public void main() {
  }

  @Test
  public void getApple() {
    String result = apples.getApple();
    String expectedResult = "apple";
    assertEquals(expectedResult, result);}
}