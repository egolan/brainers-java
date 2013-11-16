package org.eyal.brainers.java.fibonacci;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.eyal.brainers.java.fibonacci.Fibonacci;
import org.eyal.brainers.java.fibonacci.IterativeFibonacci;
import org.eyal.brainers.java.fibonacci.RecursiveFibonacci;
import org.junit.Test;

public class FibonacciTest {
	private enum FibonacciImplementation {
		Recursive(new RecursiveFibonacci()), Iterative(new IterativeFibonacci());

		private final Fibonacci type;

		private FibonacciImplementation(Fibonacci type) {
			this.type = type;
		}

		private int calculate(int number) {
			return type.calculate(number);
		}

	}

	@Test
	public void zero_shouldBe_0() {
		for (FibonacciImplementation implementation : FibonacciImplementation.values()) {
			assertThat(implementation.name() + " wrong value for 0", implementation.calculate(0), is(0));
		}
	}

	@Test
	public void one_shouldBe_1() {
		for (FibonacciImplementation implementation : FibonacciImplementation.values()) {
			assertThat(implementation.name() + " wrong value for 1", implementation.calculate(1), is(1));
		}
	}

	@Test
	public void n_shouldBe_sum_of__precedence_numbers() {
		for (FibonacciImplementation implementation : FibonacciImplementation.values()) {
			int fibonacciOf5 = implementation.calculate(5);
			int fibonacciOf4 = implementation.calculate(4);
			int fibonacciOf3 = implementation.calculate(3);
			assertThat(implementation.name() + " fibonacci 5 is 0", fibonacciOf5, is(not(0)));
			assertThat(implementation.name() + " fibonacci 4 is 0", fibonacciOf4, is(not(0)));
			assertThat(implementation.name(), fibonacciOf5, is(fibonacciOf3 + fibonacciOf4));
		}
	}

	@Test
	public void justToVerifyFibonacciOfTwelve() {
		for (FibonacciImplementation implementation : FibonacciImplementation.values()) {
			assertThat(implementation.name(), implementation.calculate(12), is(144));
		}
	}

	@Test
	public void minusNumberShouldBeZero() {
		for (FibonacciImplementation implementation : FibonacciImplementation.values()) {
			assertThat(implementation.name(), implementation.calculate(-1), is(0));
		}
	}

}
