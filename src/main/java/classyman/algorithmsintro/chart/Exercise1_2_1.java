package classyman.algorithmsintro.chart;

import classyman.algorithmsintro.sorting.InsertionSort;
import classyman.algorithmsintro.sorting.MergeSort;

/**
 * @author Aidan
 */
public class Exercise1_2_1 {

	
	public void main(String[] args) {
		GraphDisplayer.generateFor(MergeSort.construct(null), InsertionSort.construct(null));
	}
	
}
