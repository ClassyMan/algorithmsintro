package examples_2;

public class ExampleTestData_2_3_7 {

	public Integer[] getS() {
		return s;
	}

	public Integer getTarget() {
		return target;
	}

	public Integer getExpectedKey() {
		return expectedKey;
	}

	public Integer getExpectedValue() {
		return expectedValue;
	}

	private Integer[] s;
	private Integer target;
	private Integer expectedKey;
	private Integer expectedValue;

	public ExampleTestData_2_3_7(Integer[] s, Integer target, Integer expectedKey, Integer expectedValue) {
		this.s = s;
		this.target = target;
		this.expectedKey = expectedKey;
		this.expectedValue = expectedValue;
	}

}