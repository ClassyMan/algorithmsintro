package algorithms.and.data.structures;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import algorithms.and.data.structures.InsertionSort;

public class TestInsertionSort {

	/**
	 * Tests that the {@link InsertionSort} can actually sort an array correctly. 
	 */
	@Test
	public void test() {
		InsertionSort insertionSort = new InsertionSort(null);
		
		int[] arrayToSort = {1, 5, 4, 7, 3, 5, 7, 3, 5, 6};
		
		int[] sortedArray = insertionSort.sort(arrayToSort);
		
		assertThat(sortedArray).isSorted().containsExactly(1, 3, 3, 4, 5, 5, 5, 6, 7, 7);
	}

}
