package algorithms.and.data.structures;

public class ExponentialSort extends AbstractSort {

	public ExponentialSort(Double constant) {
		super(constant);
	}
	
	public static ExponentialSort construct(double constant) {
		return new ExponentialSort(constant);
	}
	
	public Double calculateEfficiencyForCandN(int numberOfIterations) {
		return Math.pow(constant, numberOfIterations);
	}

	public Integer[] sort(Integer[] arrayToSort) {
		throw new UnsupportedOperationException("Yet to be implemented");
	}

}
