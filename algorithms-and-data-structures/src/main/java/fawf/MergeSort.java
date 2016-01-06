package fawf;

public class MergeSort extends AbstractSort {
	
	private Double constant;

	public MergeSort(Double constant) {
		this.constant = constant;
	}
	
	public static MergeSort construct(Double constant) {
		return new MergeSort(constant);
	}

	public Double calculateEfficiencyForCandN(int numberOfIterations) {
		return constant * numberOfIterations * Math.log(numberOfIterations);
	}

	public int[] sort(int[] arrayToSort) {
		throw new UnsupportedOperationException("Yet to be implemented");
	}

}
