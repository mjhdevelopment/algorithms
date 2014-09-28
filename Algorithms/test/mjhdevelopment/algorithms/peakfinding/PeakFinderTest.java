package mjhdevelopment.algorithms.peakfinding;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PeakFinderTest {

	@Test
	public void test() {
		int[] numbers = { 1, 2, 6, 5, 3, 7, 4 };
		int actual = numbers[PeakFinder.getPeakIndex(numbers)];
		int leftOfActual = numbers[actual - 1];
		int rightOfActual = numbers[actual + 1];
		
		assertThat(actual, is(greaterThan( leftOfActual));

	}
}
