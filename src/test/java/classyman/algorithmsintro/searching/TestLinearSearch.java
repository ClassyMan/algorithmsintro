package classyman.algorithmsintro.searching;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests linear searching using the {@link LinearSearch} testing algorithm
 * @author Aidan
 */
public class TestLinearSearch {

	@DataProvider(name = "testSearch")
	public static Object[][] arrays(){
		return new TestSearchData[][]{{new TestSearchData(new Integer[]{1, 5, 4, 7, 3, 5, 7, 3, 5, 6}, 3, 4)},
						              {new TestSearchData(new Integer[]{31, 41, 59, 26, 41, 58}, 26, 3)}};
	}
	
	/**
	 * Tests that for a given input we can find the value we desire
	 */
	@Test(dataProvider = "testSearch")
	public void testSearch(TestSearchData testSearchData) {
		SearchResult searchResult = LinearSearch.construct().withInput(testSearchData.input).find(testSearchData.elementToFind);
		
		assertThat(searchResult).isNotNull();
		assertThat(searchResult.result).isEqualTo(testSearchData.elementToFind);
		assertThat(searchResult.positionInArray).isEqualTo(testSearchData.expectedPosition);
	}
	
	/**
	 * Tests what happens when the object is not found
	 */
	@Test(dataProvider = "testSearch")
	public void testNotFound(TestSearchData testSearchData) {
		SearchResult searchResult = LinearSearch.construct().withInput(testSearchData.input).find(76542);
		assertThat(searchResult).isNull();
	}
}
