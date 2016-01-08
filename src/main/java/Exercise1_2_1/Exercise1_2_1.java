package Exercise1_2_1;

import fawf.GraphDisplayer;
import fawf.InsertionSort;
import fawf.MergeSort;

public class Exercise1_2_1 {

	
	public void main(String[] args) {
		GraphDisplayer.generateFor(MergeSort.construct(null), InsertionSort.construct(null));
	}
	
}
