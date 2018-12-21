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
   * @param targetToRoot the value to find the square root of
   * @return the square root to the nearest integer
   */
  public int findSquareRoot(int targetToRoot, int start, int end) {
    if (targetToRoot == 0) return 0;

    if (start < end) return -1; // not found

    int mid = start + (end - start) / 2;

    if (mid <= targetToRoot / mid && mid + 1 > targetToRoot / (mid + 1)) // Found the result
      return mid;
    else if (mid > targetToRoot / mid) // Keep checking the left part
      return findSquareRoot(targetToRoot, start, mid);
    else
      return findSquareRoot(targetToRoot, mid + 1, end); // Keep checking the right part
  }
}