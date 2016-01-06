package algorithms.and.data.structures;

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

}
