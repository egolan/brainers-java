package org.eyal.brainers.java.fibonacci;

public class IterativeFibonacci implements Fibonacci {

	public IterativeFibonacci() {
	}

	@Override
	public int calculate(int number) {
		if (number == 1) {
			return 1;
		}

		int nMinusOne = 1;
		int fN = 1;
		int temp = 0;
		for (int i = 3; i <= number; i++) {
			temp =  nMinusOne + fN;
			nMinusOne = fN;
			fN = temp;
		}
		return temp;
	}

}
