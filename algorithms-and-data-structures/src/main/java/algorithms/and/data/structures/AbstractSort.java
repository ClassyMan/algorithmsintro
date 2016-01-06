package algorithms.and.data.structures;

/**
 * Abstract sorting class. We always want to implement the {@link SortType} and
 * {@link EfficiencyType} interfaces and force developers to do so when
 * implementing a new sorting algorithm.
 * 
 * @author Aidan
 */
public abstract class AbstractSort implements SortType, EfficiencyType {
	
	public AbstractSort() {
		this.constant = 1d;
	}
	
	public AbstractSort(Double constant) {
		this.constant = constant;
	}
	
	protected Double constant;
	
}
