package classyman.algorithmsintro.searching;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests Binary searching using the {@link BinarySearch} testing algorithm
 * @author Aidan
 */
public class TestBinarySearch {

	@DataProvider(name = "testSearch")
	public static Object[][] arrays(){
		return new TestSearchData[][]{{new TestSearchData(new Integer[]{1, 5, 4, 7, 3, 5, 7, 3, 5, 6}, 3, 2)},
						              {new TestSearchData(new Integer[]{31, 41, 59, 26, 41, 58}, 26, 0)}};
	}
	
	@DataProvider(name = "testSearchNotFound")
	public static Object[][] notFound(){
		return new TestSearchData[][]{{new TestSearchData(new Integer[]{1, 5, 4, 7, 3, 5, 7, 3, 5, 6}, 3525, 2)},
						              {new TestSearchData(new Integer[]{31, 41, 59, 26, 41, 58}, 10, 0)}};
	}
	
	/**
	 * Tests that for a given input we can find the value we desire
	 */
	@Test(dataProvider = "testSearch")
	public void testSearch(TestSearchData testSearchData) {
		SearchResult searchResult = BinarySearch.construct().withInput(testSearchData.input).find(testSearchData.elementToFind);
		
		assertThat(searchResult).isNotNull();
		assertThat(searchResult.result).isEqualTo(testSearchData.elementToFind);
		assertThat(searchResult.positionInArray).isEqualTo(testSearchData.expectedPosition);
	}
	
	/**
	 * Tests what happens when the object is not found
	 */
	@Test(dataProvider = "testSearchNotFound")
	public void testNotFound(TestSearchData testSearchData) {
		SearchResult searchResult = BinarySearch.construct().withInput(testSearchData.input).find(testSearchData.elementToFind);
		assertThat(searchResult).isNull();
	}
}