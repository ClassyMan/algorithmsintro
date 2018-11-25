package classyman.algorithmsintro.searching;

/**
 * Implementation of binary searching
 * @author Aidan
 */
public class BinarySearch extends AbstractSearch {

	public static BinarySearch construct() {
		return new BinarySearch();
	}

	@Override
  public SearchResult find(Integer elementToFind) {

      int targetIndex = binarySearch(input, 0, input.length - 1, elementToFind);

      SearchResult result = new SearchResult(elementToFind, targetIndex);

      if (targetIndex == -1) result.outsideRange();

      return result;
  }

  public int binarySearch(Integer[] nums, int start, int end, int target) {

    if (start > end)
      return -1;

    int mid = (start + end) /2;

    if (nums[mid] == target)
      return mid;

    if (target < nums[mid]) {
      return binarySearch(nums, start, mid - 1, target);
    } else {
      return binarySearch(nums, mid + 1, end, target);
    }
  }
}
