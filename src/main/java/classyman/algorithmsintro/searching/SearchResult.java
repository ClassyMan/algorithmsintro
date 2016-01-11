package classyman.algorithmsintro.searching;

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
	 * Denotes whether the result we are looking for is outside of the range or not
	 */
	private boolean outsideRange;

	/**
	 * construct a search result
	 */
	public SearchResult(Integer result, Integer positionInArray) {
		this.result = result;
		this.positionInArray = positionInArray;
	}

	public SearchResult outsideRange() {
		this.outsideRange = true;
		return this;
	}
	
	public boolean isOutsideOfRange() {
		return outsideRange;
	}
}
