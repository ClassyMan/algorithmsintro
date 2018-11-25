package classyman.algorithmsintro.searching;

import classyman.algorithmsintro.sorting.MergeSort;

/**
 * Abstract implementation of search class
 * @author Aidan
 */
public abstract class AbstractSearch {

	protected Integer[] input;

	/**
	 * Specify the input array
	 *
	 * @param input the input to specify
	 * @return this, for method chaining
	 */
	public AbstractSearch withInput(Integer[] input) {
		this.input = input;
		input = MergeSort.construct().sort(input);
		return this;
	}

	public abstract SearchResult find(Integer elementToFind);

}
