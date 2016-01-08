package classyman.algorithmsintro.sorting;

import java.util.Arrays;

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
	
	public Integer[] merge(Integer[] arrayToSort, int r, int p, int q) {
		int n1 = q-p+1;
		int n2 = r-q;
		Integer[] leftSide = new Integer[n1];
		Integer[] rightside = new Integer[n2];
		
		for(int i = 0; i< n1; i++) {
			leftSide[i] = arrayToSort[p+i];
		}
		
		for(int j = 0; j < n2 -1; j++) {
			rightside[j] = arrayToSort[q+j];
		}
		
		return null;
	}

	/*
	 * @see algorithms.and.data.structures.AbstractSort#desc()
	 */
	public MergeSort desc() {
		this.decreasingOrder = true;
		return this;
	}
}
