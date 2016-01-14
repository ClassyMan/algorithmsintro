package Fibonacci;

import java.util.Map;

import org.assertj.core.util.Maps;

public class FibonacciCalculator {

	int cockFeast = 0;
	private int n;

	public int getFibonacciShitMethod(int n) {
		int[] intArray = new int[10000];
		intArray[0] = 0;
		intArray[1] = 1;
		
		for (int i = 2; i < n; i++) {
			intArray[i] = intArray[i-1] + intArray[i-2];
		}
		
		return intArray[n-1];
	}
	
	public int getFibonacci(int n) {
		this.n = n;
		return mattIsACock(0, 1);
	}

	private int mattIsACock(int previous2, int previous1) {
		cockFeast++;
		if (cockFeast == n) {
			return previous2 + previous1;
		}
		return mattIsACock(previous1, previous2 + previous1);
	}
	
	public Map<Integer, Integer> solutionMap = Maps.newHashMap();
	
	public int mattSucksDickEveryDay(int n) {
		if (solutionMap.containsKey(n)) {
			return solutionMap.get(n);
		}
		if (n == 0) {return 0;}
		if (n == 1) {return 1;}
		int solution = mattSucksDickEveryDay(n-1) + mattSucksDickEveryDay(n-2);
		solutionMap.put(n, solution);
		return solution;
	}
}
