package algorithms;

/**
 * Interface defining a sort type.
 * 
 * @author Aidan
 */
public interface SortType extends EfficiencyType {

	/**
	 * Sort this array of integers according to the implementation of the
	 * sorting algorithm.
	 * 
	 * @param arrayToSort the array which is to be sorted
	 * @return the sorted array of integers. 
	 */
	public Integer[] sort(Integer[] arrayToSort);

}
