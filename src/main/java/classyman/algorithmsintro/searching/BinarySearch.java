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
		if (searchPosition > input.length - 1) {
			return new SearchResult(null, input.length - 1).outsideRange();
		} else if (searchPosition < 0) {
			return new SearchResult(null, 0).outsideRange();
		} else if (previouslySearchedPositions[1] == searchPosition) { // we are looking for the element between two numbers where it does not exist
			int searchPositionTemp = searchPosition;
			if (elementToFind > input[searchPositionTemp]) {
				while(true) {
					if (elementToFind > input[searchPositionTemp]){
						searchPositionTemp++;
					} else if (elementToFind < input[searchPositionTemp]) {
						return new SearchResult(null, searchPositionTemp-1);
					}
				}
			} else if (elementToFind < input[searchPositionTemp]) {
				while(true) {
					if (elementToFind < input[searchPositionTemp]){
						searchPositionTemp--;
					} else if (elementToFind > input[searchPositionTemp]) {
						return new SearchResult(null, searchPositionTemp+1);
					}
				}
			}
			return new SearchResult(null, Math.min(previouslySearchedPositions[0], previouslySearchedPositions[1]));
		} else if (previouslySearchedPositions[0] == searchPosition) { // we are looking for the element outside of the range
			return new SearchResult(null, searchPosition).outsideRange();
	    } else {
	    	previouslySearchedPositions[1] = previouslySearchedPositions[0]; // Shift our search positions right
	    	previouslySearchedPositions[0] = searchPosition; // then add our most recent one. We only care about the last two. 
	    }
		
		Integer comparisonElement = input[searchPosition];
		int nextDistance = Math.floorDiv(Math.abs(previouslySearchedPositions[0] - previouslySearchedPositions[1]), 2);
		if(nextDistance == 0){
			nextDistance = 1;
		}
		
		if (elementToFind < comparisonElement) {
			return searchIteration(elementToFind, searchPosition - nextDistance);
		} else if (elementToFind > comparisonElement) {
			return searchIteration(elementToFind, searchPosition + nextDistance);
		} else {
			return new SearchResult(comparisonElement, searchPosition);
		}
	}
}
