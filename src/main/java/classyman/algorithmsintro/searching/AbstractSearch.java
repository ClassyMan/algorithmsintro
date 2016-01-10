package classyman.algorithmsintro.searching;

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
		return this;
	}
	
	public abstract SearchResult find(Integer elementToFind);

}
