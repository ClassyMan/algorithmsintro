package classyman.algorithmsintro.sorting;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMergeSort {

	@DataProvider(name = "test")
	public static Object[][][] testData() {
		return new Integer[][][] { { { 1, 3, 5, 2, 4, 5, 6 }, { 1, 2, 3, 4, 5, 5, 6 } } };
	}

	@DataProvider(name = "testFullSort")
	public static Object[][][] testFullSortData() {
		return new Integer[][][] { { { 1, 3, 5, 2, 4, 5, 6 }, { 1, 2, 3, 4, 5, 5, 6 } },
				{ { 2, 1, 7, 9, 4, 5, 6 }, { 1, 2, 4, 5, 6, 7, 9 } },
				{ { 11, 33, 25, 12, 54, 15, 26 }, { 11, 12, 15, 25, 26, 33, 54 } },
				{ { 5, 4, 6, 3, 7, 2, 8, 1, 9 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 } },
				{ { 55, 444, 13, 2512, 232, 521, 125, 4346, 3, 12423, 42, 236, 47, 73474, 3 }, { 3, 3, 13, 42, 47, 55, 125, 232, 236, 444, 521, 2512, 4346, 12423, 73474 } } };
	}

	/**
	 * Tests the merge operation in isolation. This will be removed once the
	 * full sort is tested
	 */
	@Test(dataProvider = "test")
	public void testMergeOperation(Integer[] input, Integer[] expectedOutput) {

		Integer[] mergedArray = MergeSort.construct().merge(input, 0, 2, 6);

		Assertions.assertThat(mergedArray).containsExactly(expectedOutput);
	}

	/**
	 * Tests the merge sort in full
	 */
	@Test(dataProvider = "testFullSort")
	public void testMergeSort(Integer[] input, Integer[] expectedOutput) {

		Integer[] mergedArray = MergeSort.construct().sort(input);

		Assertions.assertThat(mergedArray).containsExactly(expectedOutput);
	}

}
