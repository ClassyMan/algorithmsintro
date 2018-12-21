package classyman.algorithmsintro.searching;

public class SquareRootSearchNewton extends AbstractSearch {

  public static SquareRootSearchNewton construct() {
    return new SquareRootSearchNewton();
  }

  @Override
  public SearchResult find(Integer targetToRoot) {

    int root = findSquareRoot(targetToRoot);

    SearchResult result = new SquareRootSearchResult(root, null);

    if (root == -1) result.outsideRange();

    return result;
  }

  /**
   * Find the square root by figuring out whether the value of mid exists in the window
   *
   * mid ^ 2 >= target AND (mid + 1) ^ 2 <= target
   *
   * If it's off to the left, search left
   * If it's off to the right, search right
   *
   * @param target the value to find the square root of
   * @return the square root to the nearest integer
   */
  public int findSquareRoot(int target) {
    long testValue = target;
    testValue = 0x5f3759df - (testValue >> 1);
    while (!(testValue*testValue <= target && (testValue+1)*(testValue+1) > target))
      testValue = (target/testValue + testValue)/2;
    return (int)testValue;
  }
}

