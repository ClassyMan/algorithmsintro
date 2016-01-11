package classyman.algorithmsintro.searching;

import java.util.Set;

import com.beust.jcommander.internal.Sets;

import classyman.algorithmsintro.sorting.MergeSort;

/**
 * Implementation of binary searching
 * @author Aidan
 */
public class BinarySearch extends AbstractSearch {

	Set<Integer> previouslySearchedPositions = Sets.newHashSet();

	public static BinarySearch construct() {
		return new BinarySearch();
	}
	
	/* 
	 * @see classyman.algorithmsintro.searching.AbstractSearch#find(java.lang.Integer)
	 */
	@Override
	public SearchResult find(Integer elementToFind) {
		input = MergeSort.construct().sort(input);
		return searchIteration(elementToFind, input.length/2);
	}
	
	/**
	 * Iteration of the binary search algorithm. Search for the element at the search position. 
	 * If it is not there and the comparison element is greater than the element to find then 
	 * we search left, otherwise we search to the right. 
	 */
	private SearchResult searchIteration(Integer elementToFind, Integer searchPosition) {
		if (searchPosition > input.length - 1) {
			return null;
		} else if (!previouslySearchedPositions.add(searchPosition)) {
			return null;
		}
		
		Integer comparisonElement = input[searchPosition];
		if (elementToFind < comparisonElement) {
			return searchIteration(elementToFind, Math.floorDiv(searchPosition,2));
		} else if (elementToFind > comparisonElement) {
			return searchIteration(elementToFind, searchPosition + Math.floorDiv((input.length-1 - searchPosition), 2));
		} else {
			return new SearchResult(comparisonElement, searchPosition);
		}
	}
}
