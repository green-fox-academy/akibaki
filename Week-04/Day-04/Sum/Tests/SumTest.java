import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;
  static ArrayList<Integer> numbers;

  @BeforeClass
  public static void setUp() throws Exception {
    numbers = new ArrayList<Integer>(Arrays.asList( 1, 2, 3, 4));

  }

  @Test
  public void should_return_sum_of_the_integersInArrayList() {
    int result = sum.sum(numbers);
    int expectedresult = 10;
    assertEquals(expectedresult, result);
  }

  @Test
  public void should_return_0_when_emptyList() {
    numbers = new ArrayList<Integer>();
    int result = sum.sum(numbers);
    int expectedresult = 0;
    assertEquals(expectedresult, result);
  }

  @Test
  public void should_return_value_of_single_element() {
    numbers = new ArrayList<Integer>(Arrays.asList(4));
    int result = sum.sum(numbers);
    int expectedresult = 4;
    assertEquals(expectedresult, result);
  }

  @Test
  public void should_return_0_when_input_is_null() {
    numbers = null;
    int result = sum.sum(numbers);
    int expectedresult = 0;
    assertEquals(expectedresult, result);
  }

}