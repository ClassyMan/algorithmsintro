package classyman.algorithmsintro.searching;

public class SquareRootSearchNonRecursive extends AbstractSearch {

  public static SquareRootSearchNonRecursive construct() {
    return new SquareRootSearchNonRecursive();
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
   * mid ^ 2 >= x AND (mid + 1) ^ 2 <= x
   *
   * If it's off to the left, search left
   * If it's off to the right, search right
   *
   * @param x the value to find the square root of
   * @return the square root to the nearest integer
   */
  public int findSquareRoot(int x) {
    if (x == 0) return 0;
    int start = 1, end = x;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (mid <= x / mid && mid + 1 > x / (mid + 1))// Found the result
        return mid;
      else if (mid > x / mid)// Keep checking the left part
        end = mid;
      else
        start = mid + 1;// Keep checking the right part
    }
    return start;
  }
}

