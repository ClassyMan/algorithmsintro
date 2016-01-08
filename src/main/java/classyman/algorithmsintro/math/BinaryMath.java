package classyman.algorithmsintro.math;

/**
 * Class for use with binary mathematics 
 * @author Aidan
 */
public class BinaryMath {

	
	/**
	 * adds two binary numbers. For the meanwhile we will assume that we only have 1's and 0's inside our arrays but this could well not be the case
	 * 
	 * TODO: make this class robust against non 1's and 0's, make it resilient to inputs of different sizes. 
	 * 
	 * @param binaryNumber1 the first binary number
	 * @param binaryNumber2 the second binary number
	 * @return the addition of those two binary numbers
	 */
	public static Integer[] add(Integer[] binaryNumber1, Integer[] binaryNumber2) {
		
		int[] result = new int[binaryNumber1.length + 1];

		for(int i = binaryNumber1.length - 1; i >= 0; i--){ // from right to left
			if (binaryNumber1[i] == 1 && binaryNumber2[i] == 1) { // in this situation we need to carry the 1 over to the next digit on the left
				result[i] = 1; // bear in mind that the result array is one longer
			} else if (binaryNumber1[i] == 1 && binaryNumber2[i] != 1 || binaryNumber1[i] != 1 && binaryNumber2[i] == 1) {
				result[i + 1] = 1;
			} 
		}
		return toBoxedPrimitives(result);
	}
	
	
	public static Integer[] toBoxedPrimitives(int[] intArray) {

		Integer[] result = new Integer[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			result[i] = Integer.valueOf(intArray[i]);
		}
		return result;
	}
}
