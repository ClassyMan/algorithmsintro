package classyman.algorithmsintro.searching;

/**
 * 2.1-3 
 * 
 * Search for an element within an array using the shitty linear search algorithm
 * 
 * @author Aidan
 */
public class LinearSearch {

	private Integer[] input;

	public static LinearSearch construct() {
		return new LinearSearch();
	}

	/**
	 * Specify the input array
	 * 
	 * @param input the input to specify
	 * @return this, for method chaining
	 */
	public LinearSearch withInput(Integer[] input) {
		this.input = input;
		return this;
	}

	/**
	 * Find the element if it exists in the input array
	 * @param elementToFind the element that we want to find in the input array
	 * @return the {@link SearchResult} should one exist, null otherwise
	 */
	public SearchResult find(Integer elementToFind) {

		if(input == null) {
			throw new IllegalStateException("Input array is not allowed to be null when conducting a search");
		}
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] == elementToFind) {
				return new SearchResult(elementToFind, i);
			}
		}
		return null;
	}
}
