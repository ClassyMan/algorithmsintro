package algorithms.and.data.structures.searching;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import algorithms.and.data.structures.math.binary.BinaryMath;

public class TestBinaryMath {

	
	@DataProvider(name = "testAdd")
	public static Object[][] arrays(){
		return new Integer[][][]{{{1,1,1,0}, {1,1,0,0}, {1, 1, 0, 1, 0}}};
	}
		
	@Test(dataProvider = "testAdd")
	public void testAddition(Integer[] binaryNumber1, Integer[] binaryNumber2, Integer[] expectedResult) {
		
		assertThat(BinaryMath.add(binaryNumber1, binaryNumber2))
			.containsExactly(toPrimitive(expectedResult));
	}
	
	
	public static int[] toPrimitive(Integer[] IntegerArray) {

		int[] result = new int[IntegerArray.length];
		for (int i = 0; i < IntegerArray.length; i++) {
			result[i] = IntegerArray[i].intValue();
		}
		return result;
	}
}
