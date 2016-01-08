package classyman.algorithmsintro.searching;

/**
 * Class to hold expected test data for unit tests involving searches. Makes it
 * easier to work with parameterized testing in testNG
 * 
 * @author Aidan
 */
public class TestSearchData {
	public Integer[] input;
	public Integer elementToFind;
	public Integer expectedPosition;

	public TestSearchData(Integer[] input, Integer elementToFind, Integer expectedPosition) {
		this.input = input;
		this.elementToFind = elementToFind;
		this.expectedPosition = expectedPosition;
	}
}
