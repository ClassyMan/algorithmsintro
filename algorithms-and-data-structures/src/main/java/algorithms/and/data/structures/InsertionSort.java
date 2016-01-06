package algorithms.and.data.structures;

/**
 * Implementation of insertions sort algorithm 
 * @author Aidan
 */
public class InsertionSort extends AbstractSort {

	private boolean decreasingOrder;

	public InsertionSort(Double constant) {
		super(constant);
	}

	public static InsertionSort construct(Double constant) {
		return new InsertionSort(constant);
	}

	public Double calculateEfficiencyForCandN(int numberOfIterations) {
		return constant * (numberOfIterations ^ 2);
	}

	public InsertionSort desc() {
		this.decreasingOrder = true;
		return this;
	}

	public Integer[] sort(Integer array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && getComparator(array, key, i) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        return array;
    }

	private boolean getComparator(Integer[] array, int key, int i) {
		if(!decreasingOrder) {			
			return array [i] > key;
		} else {
			return array [i] < key;
		}
	}
}