import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

  static CountLetters countletters;

  @BeforeClass
  public static void setUp() throws Exception {
    countletters = new CountLetters();
  }

  @Test
  public void lettersOccurance() {
    int expectedResult = countletters.lettersOccurance("Casanova").get("a");
    int result = 3;
    assertEquals(expectedResult, result);
  }
}