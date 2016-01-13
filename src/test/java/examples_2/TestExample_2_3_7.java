package examples_2;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExample_2_3_7 {

	@DataProvider(name = "test")
	public static Object[][] notFound(){
		return new ExampleTestData_2_3_7[][]{{new ExampleTestData_2_3_7(new Integer[]{1, 5, 4, 7, 3, 5, 7, 3, 5, 6}, 13, 6, 7)},
			                                 {new ExampleTestData_2_3_7(new Integer[]{6,5,33,22,33,44,55,33,352,236,233,73,72,34,82,882}, 116, 34, 82)}, 
			                                 {new ExampleTestData_2_3_7(new Integer[]{1, 4, 3, 1, 7, 1}, 10, 3, 7)}, 
						                     {new ExampleTestData_2_3_7(new Integer[]{-31, 41, 59, 26, 41, 58}, 10, 41, -31)}, 
						                     {new ExampleTestData_2_3_7(new Integer[]{31, 41, 59, 26, 41, 58}, 100, 41, 59)},
						                     {new ExampleTestData_2_3_7(new Integer[]{11, 23, 59, 26, 44, 200, 300, 100, 214, 500, 400}, 523, 500, 23)}
						              
		};
	} 
	
	
	@Test(dataProvider = "test")
	public void testExample(ExampleTestData_2_3_7 testData) {
		Example_2_3_7 example = new Example_2_3_7();

		Map<Integer, Integer> answer = example.findSumOfTwoIntegersInArrayThatMakeTheTargetInteger(
				testData.getS(), testData.getTarget());

		Assertions.assertThat(answer).containsEntry(testData.getExpectedKey(), testData.getExpectedValue());
	}
}
