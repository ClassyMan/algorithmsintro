package algorithms.and.data.structures.searching;

/**
 * A class which contains information on a search result from a search
 * 
 * @author Aidan
 */
public class SearchResult {

	/**
	 * The result from the search
	 */
	public Integer result;

	/**
	 * The position in the array in which the search result was found
	 */
	public Integer positionInArray;

	/**
	 * construct a search result
	 */
	public SearchResult(Integer result, Integer positionInArray) {
		this.result = result;
		this.positionInArray = positionInArray;
	}
}
