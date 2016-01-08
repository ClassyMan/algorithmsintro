package sorting;

/**
 * Note that the efficiency of this algorithm is inferior to
 * {@link InsertionSort} in the best case scenario as it always takes O(n^2)
 * even when array is already sorted
 * 
 * @author Aidan
 */
public class SelectionSort extends AbstractSort {

	public Integer[] sort(Integer[] arrayToSort) {
		int i, j, first, temp;
		for (i = 0; i < arrayToSort.length; i++) {
			first = arrayToSort.length - 1;
			for (j = arrayToSort.length - 1; j >= i; j--) 
			{

				if (getComparator(arrayToSort, first, arrayToSort[j]))
					first = j;
			}
			temp = arrayToSort[first]; // swap smallest found with element in
										// position i.
			arrayToSort[first] = arrayToSort[i];
			arrayToSort[i] = temp;
		}
		return arrayToSort;
	}

	public Double calculateEfficiencyForCandN(int numberOfIterations) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public AbstractSort desc() {
		this.decreasingOrder = true;
		return this;
	}

	public static SelectionSort construct() {
		return new SelectionSort();
	}

}
