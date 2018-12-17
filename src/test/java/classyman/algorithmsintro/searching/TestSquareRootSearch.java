package classyman.algorithmsintro.searching;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests Binary searching using the {@link BinarySearch} testing algorithm
 * @author Aidan
 */
public class TestSquareRootSearch {

  @DataProvider(name = "testSearch")
  public static Object[][] arrays(){
    return new TestSquareRootSearchData[][]{{
      new TestSquareRootSearchData(1024, 32)}

    };
  }

  /**
   * Tests that for a given input we can find the value we desire
   */
  @Test(dataProvider = "testSearch")
  public void testSearch(TestSquareRootSearchData testSearchData) {
    SearchResult searchResult = SquareRootSearch.construct().find(testSearchData.getTarget());

    assertThat(searchResult).isNotNull();
    assertThat(searchResult.result).isEqualTo(testSearchData.getAnswer());
  }
}
