package classyman.algorithmsintro.searching;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests Binary searching using the {@link BinarySearch} testing algorithm
 * @author Aidan
 */
public class TestSquareRootSearchRecursive {

  @DataProvider(name = "testSearch")
  public static Object[][] arrays(){
    return new TestSquareRootSearchData[][]{
      {new TestSquareRootSearchData(1, 1)},
      {new TestSquareRootSearchData(4, 2)},
      {new TestSquareRootSearchData(9, 3)},
      {new TestSquareRootSearchData(16, 4)},
      {new TestSquareRootSearchData(25, 5)},
      {new TestSquareRootSearchData(36, 6)},
      {new TestSquareRootSearchData(49, 7)},
      {new TestSquareRootSearchData(64, 8)},
      {new TestSquareRootSearchData(81, 9)},
      {new TestSquareRootSearchData(100, 10)},
      {new TestSquareRootSearchData(111, 10)},
      {new TestSquareRootSearchData(121, 11)},
      {new TestSquareRootSearchData(1024, 32)}

    };
  }

  /**
   * Tests that for a given input we can find the value we desire
   */
  @Test(dataProvider = "testSearch")
  public void testSearch(TestSquareRootSearchData testSearchData) {
      SearchResult searchResult = SquareRootSearchRecursive.construct().find(testSearchData.getTarget());
      assertThat(searchResult).isNotNull();
      assertThat(searchResult.result).isEqualTo(testSearchData.getAnswer());
  }
}
