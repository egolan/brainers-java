package org.eyal.brainers.java.factorial;

public class IterativeFactorial implements Factorial {

	public IterativeFactorial() {
	}

	@Override
	public int factorial(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		return result;
	}
}
