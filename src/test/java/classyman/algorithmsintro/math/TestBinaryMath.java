package classyman.algorithmsintro.math;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestBinaryMath {
	
	@DataProvider(name = "testAdd")
	public static Object[][] arrays(){
		return new Integer[][][]{{{1,1,1,0}, {1,1,0,0}, {1, 1, 0, 1, 0}}};
	}
		
	/**
	 * Tests the addition of two binary numbers
	 * 
	 * @param binaryNumber1 the first binary number
	 * @param binaryNumber2 the second binary number
	 * @param expectedResult the result
	 */
	@Test(dataProvider = "testAdd") 
	public void testAddition(Integer[] binaryNumber1, Integer[] binaryNumber2, Integer[] expectedResult) {
		
		assertThat(BinaryMath.add(binaryNumber1, binaryNumber2))
			.containsExactly(expectedResult);
	}
	
}
