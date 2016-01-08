package Exercise1_2_1;

import algorithms.and.data.structures.chart.GraphDisplayer;
import algorithms.and.data.structures.sorting.InsertionSort;
import algorithms.and.data.structures.sorting.MergeSort;

/**
 * @author Aidan
 */
public class Exercise1_2_1 {

	
	public void main(String[] args) {
		GraphDisplayer.generateFor(MergeSort.construct(null), InsertionSort.construct(null));
	}
	
}
