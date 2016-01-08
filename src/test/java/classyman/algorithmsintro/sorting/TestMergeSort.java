package classyman.algorithmsintro.sorting;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class TestMergeSort {

	@Test
	public void testMergeOperation() {
		Integer[] arrayToSort = new Integer[]{1, 3, 5, 2, 4, 5, 6};
		Integer[] mergedArray = MergeSort.construct(null).merge(arrayToSort , 0, 2, 6);
		
		Assertions.assertThat(mergedArray).containsExactly(1,2,3,4,5,5,6);
	}
	
}
