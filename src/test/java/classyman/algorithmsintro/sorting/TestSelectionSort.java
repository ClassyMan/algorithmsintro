package classyman.algorithmsintro.sorting;

import static classyman.algorithmsintro.sorting.DescendingComparator.newDescendingcomparator;
import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests the selection sort algorithm
 * 
 * @author Aidan
 */
public class TestSelectionSort {

	@DataProvider(name = "test")
	public static Object[][][] arrays() {
		return new Integer[][][] { { { 1, 5, 4, 7, 3, 5, 7, 3, 5, 6 }, { 1, 3, 3, 4, 5, 5, 5, 6, 7, 7 } },
				{ { 31, 41, 59, 26, 41, 58 }, { 26, 31, 41, 41, 58, 59 } } }; // Exercise
																				// 2.1-1
	}

	@DataProvider(name = "testDesc")
	public static Object[][][] arraysDescending() {
		return new Integer[][][] { { { 1, 5, 4, 7, 3, 5, 7, 3, 5, 6 }, { 7, 7, 6, 5, 5, 5, 4, 3, 3, 1 } },
				{ { 31, 41, 59, 26, 41, 58 }, { 59, 58, 41, 41, 31, 26 } } }; // Exercise
																				// 2.1-2
	}

	/**
	 * Tests that the {@link SelectionSort} can actually sort an array
	 * correctly.
	 */
	@Test(dataProvider = "test")
	public void test(Integer[] arrayToSort, Integer[] expected) {
		Integer[] sortedArray = SelectionSort.construct().sort(arrayToSort);

		assertThat(sortedArray).isSorted().containsExactly(expected);
	}

	/**
	 * Tests that the {@link SelectionSort} can actually sort an array correctly
	 * when we specify descending order.
	 */
	@Test(dataProvider = "testDesc")
	public void testDecreasingOrder(Integer[] arrayToSort, Integer[] expected) {
		Integer[] sortedArray = SelectionSort.construct().desc().sort(arrayToSort);

		assertThat(sortedArray).isSortedAccordingTo(newDescendingcomparator()).containsExactly(expected);
	}

}
