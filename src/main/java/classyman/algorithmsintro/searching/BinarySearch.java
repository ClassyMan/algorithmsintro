package classyman.algorithmsintro.searching;

import classyman.algorithmsintro.sorting.MergeSort;

/**
 * Implementation of binary searching
 * @author Aidan
 */
public class BinarySearch extends AbstractSearch {

	Integer[] previouslySearchedPositions = new Integer[]{0,0};

	public static BinarySearch construct() {
		return new BinarySearch();
	}

	/*
	 * @see classyman.algorithmsintro.searching.AbstractSearch#find(java.lang.Integer)
	 */
	@Override
	public SearchResult find(Integer elementToFind) {
		input = MergeSort.construct().sort(input);
		return searchIteration(elementToFind, Math.floorDiv(input.length,2));
	}

	/**
	 * Iteration of the binary search algorithm. Search for the element at the search position.
	 * If it is not there and the comparison element is greater than the element to find then
	 * we search left, otherwise we search to the right.
	 */
	private SearchResult searchIteration(Integer elementToFind, Integer searchPosition) {
		if (searchPosition > input.length - 1) { // Validate that the search position is not off the end of the array. (to the right)
			return new SearchResult(null, input.length - 1).outsideRange();
		} else if (searchPosition < 0) { // Valudate that the search position is not off the end of the array but to the left.
			return new SearchResult(null, 0).outsideRange();
		} else if (previouslySearchedPositions[1] == searchPosition) { // we are looking for the element between two numbers where it does not exist
			int searchPositionTemp = searchPosition;
			if (elementToFind > input[searchPositionTemp]) { // if our element to find is greater than the element at the search position
				while(true) {
					if (elementToFind > input[searchPositionTemp]){ // if the element to find is STILL greater than the element at the search position
						searchPositionTemp++; // Increment the search position
					} else if (elementToFind < input[searchPositionTemp]) { // Otherwise if the element to find is less than the search position
						return new SearchResult(null, searchPositionTemp-1); // Then return the search position minus 1
					}
				}
			} else if (elementToFind < input[searchPositionTemp]) { // Else if the element to find is less than the search position
				while(true) {
					if (elementToFind < input[searchPositionTemp]){ // And the element to find is STILL less than the search position
						searchPositionTemp--; // decrement the temporary search position
					} else if (elementToFind > input[searchPositionTemp]) { // Else if the element to find is greater than the search position
						return new SearchResult(null, searchPositionTemp+1); // return the search position + 1
					}
				}
			}
			return new SearchResult(null, Math.min(previouslySearchedPositions[0], previouslySearchedPositions[1])); // So if the result is between two numbers, just choose the lowest number
		} else if (previouslySearchedPositions[0] == searchPosition) { // we are looking for the element outside of the range
			return new SearchResult(null, searchPosition).outsideRange();
	    } else {
	    	previouslySearchedPositions[1] = previouslySearchedPositions[0]; // Shift our search positions right
	    	previouslySearchedPositions[0] = searchPosition; // then add our most recent one. We only care about the last two.
	    }

		Integer comparisonElement = input[searchPosition]; // Possible match?
		int nextDistance = Math.floorDiv(Math.abs(previouslySearchedPositions[0] - previouslySearchedPositions[1]), 2);
		if(nextDistance == 0){
			nextDistance = 1;
		}

		if (elementToFind < comparisonElement) { // If the element to find is a smaller number than the comparison element
			return searchIteration(elementToFind, searchPosition - nextDistance); // Then return a new search iteration to look in the area below, using a distance of half the last distance
		} else if (elementToFind > comparisonElement) { // Same here but where the amount is greater
			return searchIteration(elementToFind, searchPosition + nextDistance); // The return a new search iteration to look in the area above, using a distance of half the last distance
		} else {
			return new SearchResult(comparisonElement, searchPosition); // Otherwise, we found it.
		}
	}
}
