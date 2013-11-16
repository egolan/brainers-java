package org.eyal.brainers.java.fibonacci;

public class RecursiveFibonacci implements Fibonacci {
	public RecursiveFibonacci() {
	}

	@Override
	public int calculate(int number) {
		if (number <= 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}
		return (calculate(number - 2) + calculate(number - 1));
	}

}
