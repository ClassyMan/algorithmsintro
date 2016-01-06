package algorithms.and.data.structures;

import java.util.Comparator;

/**
 * A comparator for integers which need to be sorted in descending order. 
 * @author Aidan
 */
public final class DescendingComparator implements Comparator<Integer> {
	
	/**
	 * Static instantiator
	 */
	public static DescendingComparator newDescendingcomparator() {
		return new DescendingComparator();
	}
	
	/* 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}
