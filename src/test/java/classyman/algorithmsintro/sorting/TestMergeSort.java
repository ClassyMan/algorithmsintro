package classyman.algorithmsintro.sorting;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMergeSort {

	@DataProvider(name = "test")
	public static Object[][][] testData() {
		return new Integer[][][]{{{1,3,5,2,4,5,6},{1,2,3,4,5,5,6}}};
	}
	
	@DataProvider(name = "testFullSort")
	public static Object[][][] testFullSortData() {
		return new Integer[][][]{{{1,3,5,2,4,5,6},{1,2,3,4,5,5,6}}};
	}
	
	/**
	 * Tests the merge operation in isolation. This will be removed once the full sort is tested
	 */
	@Test(dataProvider = "test")
	public void testMergeOperation(Integer[] input, Integer[] expectedOutput) {
		
		Integer[] mergedArray = MergeSort.construct(null).merge(input , 0, 2, 6);
		
		Assertions.assertThat(mergedArray).containsExactly(expectedOutput);
	}
	
	/**
	 * Tests the merge sort in full
	 */
	@Test(dataProvider = "testFullSort")
	public void testMergeSort(Integer[] input, Integer[] expectedOutput) {
		
		Integer[] mergedArray = MergeSort.construct(null).sort(input);
		
		Assertions.assertThat(mergedArray).containsExactly(expectedOutput);
	}
	
}
