package classyman.algorithmsintro.searching;

public class SquareRootSearchRecursive extends AbstractSearch {

  public static SquareRootSearchRecursive construct() {
    return new SquareRootSearchRecursive();
  }

  @Override
  public SearchResult find(Integer targetToRoot) {

    int root = findSquareRoot(targetToRoot, 1, targetToRoot);

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
  public int findSquareRoot(int x, int start, int end) {
    if (x == 0) return 0;

    if (start < end) return start;

    int mid = start + end / 2;

    if (mid <= x / mid && mid + 1 > x / (mid + 1)) // Found the result
      return mid;
    else if (mid > x / mid) // Keep checking the left part
      findSquareRoot(x, start, mid);
    else
      findSquareRoot(x, mid + 1, mid + 1); // Keep checking the right part

    return start;
  }
}