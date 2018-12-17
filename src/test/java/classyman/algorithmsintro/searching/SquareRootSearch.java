package classyman.algorithmsintro.searching;

public class SquareRootSearch extends AbstractSearch {

  public static SquareRootSearch construct() {
    return new SquareRootSearch();
  }

  @Override
  public SearchResult find(Integer targetToRoot) {

    int root = search(0, targetToRoot, targetToRoot);

    SearchResult result = new SquareRootSearchResult(root, null);

    if (root == -1) result.outsideRange();

    return result;
  }

  public int search(int start, int end, int target) {

    if (target == 1)
      return 1;

    if (start > end)
      return -1;

    int mid = (start + end) /2;

    if (Math.abs(function(target, mid)) < 0.5)
      return mid;

    if (function(target, mid) < 0) {
      return search(mid, end, target);
    } else {
      return search(start, mid, target);
    }
  }

  private int function(int target, int mid) {
    return Math.abs(mid*mid) - target;
  }
}

