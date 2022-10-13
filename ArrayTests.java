import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() { //passed
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() { //passed
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testTwoElementReverse() { //failed
    int[] input = {0, 1};
    int[] expected = {1, 0};
    assertArrayEquals(expected, ArrayExamples.reversed(input));
  }

  @Test
  public void testManyElementsRev() { //failed. now passes
    int[] input = {1, 1, 2, 3, 4, 5};
    int[] expected = {5, 4, 3, 2, 1, 1};
    assertArrayEquals(expected, ArrayExamples.reversed(input));
  }

  @Test 
  public void testingOneReverse() { //passed
    int[] input = {5};
    int[] expected = {5};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expected, input);
  }

  @Test 
  public void testingManyInPlace() { //failed. now passes
    int[] input = {3, 5, 8, 2, 9};
    int[] expected = {9, 2, 8, 5, 3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void testingAverage() { //passed
    double[] input = {1.0, 2.0};
    double expected = 2.0;
    double delta = 0.1;
    assertEquals(expected, ArrayExamples.averageWithoutLowest(input), delta);
  }

  @Test
  public void testingAverageMultiple() { //passed
    double[] input = {1.0, 2.0, 3.4, 6.2};
    double expected =  3.86;
    double delta = 0.01;
    assertEquals(expected, ArrayExamples.averageWithoutLowest(input), delta);
  }

  @Test
  public void testAverageDupes() { //failed
    double[] input = {2.0, 2.0, 2.0, 4.0, 3.5};
    double expected = 2.875;
    double delta = 0.1;
    assertEquals(expected, ArrayExamples.averageWithoutLowest(input), delta);
  }
}
