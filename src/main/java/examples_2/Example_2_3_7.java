package examples_2;

import java.util.HashMap;
import java.util.Map;

public class Example_2_3_7 {

	/**
	 * Does what it says on the tin. Kind of rushing this one as I want to get
	 * on to the next bit. Might not be perfect.
	 */
	public Map<Integer, Integer> findSumOfTwoIntegersInArrayThatMakeTheTargetInteger(Integer[] s, Integer target) {
		HashMap<Integer, Integer> answer = new HashMap<Integer, Integer>();
		Map<Integer, Integer> solutionMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < s.length; i++) {
			solutionMap.put(s[i], target - s[i]);
		}

		for (Integer key : solutionMap.keySet()) {
			Integer value = solutionMap.get(key);
			if (solutionMap.containsKey(value)) {
				answer.put(key, value);
				return answer;
			}
		}
		return null;
	}
}
