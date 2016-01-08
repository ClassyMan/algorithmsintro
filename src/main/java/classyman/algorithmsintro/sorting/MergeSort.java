package classyman.algorithmsintro.sorting;

public class MergeSort extends AbstractSort {

	public MergeSort(Double constant) {
		super(constant);
	}

	public static MergeSort construct(Double constant) {
		return new MergeSort(constant);
	}

	public Double calculateEfficiencyForCandN(int numberOfIterations) {
		return constant * numberOfIterations * Math.log(numberOfIterations);
	}

	public Integer[] sort(Integer[] arrayToSort) {
		throw new UnsupportedOperationException("Yet to be implemented");
	}
	
	/**
	 * This method merges two sorted arrays into one sorted array. 
	 * 
	 * @param arrayToSort The array within which our two sorted arrays are.
	 * @param startOfArray1
	 * @param midPoint
	 * @param endOfArray2
	 * @return The array with the section we wanted to sort now as one contiguous sorted subsequence
	 */
	protected Integer[] merge(Integer[] arrayToSort, int startOfArray1, int midPoint, int endOfArray2) {
		int n1 = midPoint-startOfArray1+1;
		int n2 = endOfArray2-midPoint;
		Integer[] leftSide = new Integer[n1 + 1];
		Integer[] rightSide = new Integer[n2 + 1];
		
		for(int i = 0; i< n1; i++) {
			leftSide[i] = arrayToSort[startOfArray1+i];
		}
		
		for(int j = 0; j < n2; j++) {
			rightSide[j] = arrayToSort[midPoint+j+1];
		}
		
		// Yeah I know I should use infinity here but Integer doesn't have that option
		leftSide[n1] = Integer.MAX_VALUE; 
		rightSide[n2] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		
		for(int k = startOfArray1 ; k < endOfArray2; k++) {
			if (leftSide[i] <= rightSide[j]) {
				arrayToSort[k] = leftSide[i];
				i++;
			} else {
				arrayToSort[k] = rightSide[j];
				j++;
			}
		}
		
		return arrayToSort;
	}

	/*
	 * @see algorithms.and.data.structures.AbstractSort#desc()
	 */
	public MergeSort desc() {
		this.decreasingOrder = true;
		return this;
	}
}
