package chart;

import sorting.InsertionSort;
import sorting.MergeSort;

/**
 * @author Aidan
 */
public class Exercise1_2_1 {

	
	public void main(String[] args) {
		GraphDisplayer.generateFor(MergeSort.construct(null), InsertionSort.construct(null));
	}
	
}
