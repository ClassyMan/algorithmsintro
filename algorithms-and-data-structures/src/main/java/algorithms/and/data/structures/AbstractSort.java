package algorithms.and.data.structures;

/**
 * Abstract sorting class. We always want to implement the {@link SortType} and
 * {@link EfficiencyType} interfaces and force developers to do so when
 * implementing a new sorting algorithm.
 * 
 * @author Aidan
 */
public abstract class AbstractSort implements SortType, EfficiencyType {

	protected Double constant;
	protected boolean decreasingOrder;

	public AbstractSort() {
		this.constant = 1d;
	}

	public AbstractSort(Double constant) {
		this.constant = constant;
	}
	
	public abstract AbstractSort desc();

	/**
	 * Get the comparator, will either compare so as to give an ascending order
	 * or will compare to give a descending order.
	 * 
	 * @param array
	 *            the array to sort
	 * @param key
	 *            the specific key used in the comparison
	 * @param i
	 *            the index of the element we are comparing against the key
	 * @return a boolean denoting whether or not the key is higher or lower than
	 *         the comparison elem,ent depending on whether or not we are
	 *         sorting in descending or ascending order.
	 */
	protected boolean getComparator(Integer[] array, int key, int i) {
		if (!decreasingOrder) {
			return array[i] > key;
		} else {
			return array[i] < key;
		}
	}
}
