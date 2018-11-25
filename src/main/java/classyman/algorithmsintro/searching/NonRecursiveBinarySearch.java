package classyman.algorithmsintro.searching;

public class NonRecursiveBinarySearch extends AbstractSearch {


  public static NonRecursiveBinarySearch construct() {
    return new NonRecursiveBinarySearch();
  }

  @Override
  public SearchResult find(Integer elementToFind) {

      int targetIndex = binarySearch(input, elementToFind);

      SearchResult result = new SearchResult(elementToFind, targetIndex);

      if (targetIndex == -1) result.outsideRange();

      return result;
  }

  int binarySearch(Integer[] nums, int target){
    if(nums == null || nums.length == 0)
      return -1;

    int left = 0, right = nums.length - 1;
    while(left <= right){
      // Prevent (left + right) overflow
      int mid = left + (right - left) / 2;
      if(nums[mid] == target){ return mid; }
      else if(nums[mid] < target) { left = mid + 1; }
      else { right = mid - 1; }
    }

    // End Condition: left > right
    return -1;
  }
}

