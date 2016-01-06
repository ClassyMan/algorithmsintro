package Exercise1_2_1;

import algorithms.and.data.structures.GraphDisplayer;
import algorithms.and.data.structures.InsertionSort;
import algorithms.and.data.structures.MergeSort;

/**
 * @author Aidan
 */
public class Exercise1_2_1 {

	
	public void main(String[] args) {
		GraphDisplayer.generateFor(MergeSort.construct(null), InsertionSort.construct(null));
	}
	
}
