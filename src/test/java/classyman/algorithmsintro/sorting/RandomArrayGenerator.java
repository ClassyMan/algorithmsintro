package classyman.algorithmsintro.sorting;

import java.util.Random;

public class RandomArrayGenerator {

	public static Integer[] generateIntegerArray(int size){
		Random random = new Random();
		Integer[] outputArray = new Integer[size];
		
		for(int i = 0; i < size; i ++) {
			outputArray[i] = random.nextInt();
		}
		
		return outputArray;
	}
}
