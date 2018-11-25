package classyman.algorithmsintro.searching;

/**
 * Implementation of binary searching
 * @author Aidan
 */
public class BinarySearch extends AbstractSearch {

	Integer[] previouslySearchedPositions = new Integer[]{0,0};

	public static BinarySearch construct() {
		return new BinarySearch();
	}

	int[] pastTwoMiddleIndexes = new int[2];

	@Override
  public SearchResult find(Integer elementToFind) {

      int rightIndex = input.length - 1;
      int leftIndex = 0;

      int middleIndex = rightIndex / 2;

      int targetIndex = searchIteration(input, elementToFind, leftIndex, middleIndex, rightIndex);

      SearchResult result = new SearchResult(elementToFind, targetIndex);

      if (targetIndex == -1) result.outsideRange();

      return result;
  }

  public int searchIteration(Integer[] nums, int target, int leftIndex, int middleIndex, int rightIndex) {
      if (pastTwoMiddleIndexes[0] == middleIndex || pastTwoMiddleIndexes[1] == middleIndex) {
        return -1; // not found
      } else {
        pastTwoMiddleIndexes[1] = pastTwoMiddleIndexes[0];
        pastTwoMiddleIndexes[0] = middleIndex;
      }
      if (nums[middleIndex] == target) {
          return middleIndex;
      } else if (target < nums[middleIndex]) {
          // go left shifting the scope of our search
          rightIndex = middleIndex;
          middleIndex = rightIndex / 2;
          return searchIteration(nums, target, leftIndex, middleIndex, rightIndex);
      } else { // basically this leaves us with (target > nums[middleIndex]) {
          // go to the right shifting the scope of our search
          leftIndex = middleIndex;
          middleIndex = middleIndex + (rightIndex - middleIndex)/2;
          return searchIteration(nums, target, leftIndex, middleIndex, rightIndex);
      }
  }
}
