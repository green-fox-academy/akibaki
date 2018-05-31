import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  static Anagram anagramm;

  @BeforeClass
  public static void setUp()  throws Exception {
    anagramm = new Anagram();
  }

  @Test
  public void are_they_anagrams() {
    String string1 = "Casanova";
    String string2 = "VanaCsoa";
    assertTrue(anagramm.anagram(string1, string2));
  }
}