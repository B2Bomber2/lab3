import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReversed2(){
    int[] array1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(array1));
  }

  @Test 
  public void testReversed3(){
    int[] array1 = {100,99,98};
    assertArrayEquals(new int[]{98,99,100}, ArrayExamples.reversed(array1));
  }

  @Test 
  public void testReverseInPlace2(){
    int[] array1 = {100,99,98};
    int[] result = {98,99,100};
    assertArrayEquals(result, ArrayExamples.reversed(array1));
  }
}
