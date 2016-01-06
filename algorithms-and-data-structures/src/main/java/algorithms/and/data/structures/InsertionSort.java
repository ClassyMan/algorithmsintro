package algorithms.and.data.structures;

/**
 * Implementation of insertions sort algorithm 
 * @author Aidan
 */
public class InsertionSort extends AbstractSort {

	public InsertionSort(Double constant) {
		super(constant);
	}

	public static InsertionSort construct(Double constant) {
		return new InsertionSort(constant);
	}

	public Double calculateEfficiencyForCandN(int numberOfIterations) {
		return constant * (numberOfIterations ^ 2);
	}

	public Integer[] sort(Integer array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        return array;
    }
}