package org.eyal.brainers.java.factorial;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.eyal.brainers.java.factorial.Factorial;
import org.eyal.brainers.java.factorial.IterativeFactorial;
import org.eyal.brainers.java.factorial.RecursiveFactorial;
import org.junit.Test;

public class FactorialTest {
	private enum FactorialImplementation {
		Recursive(new RecursiveFactorial()), Iterative(new IterativeFactorial());

		private final Factorial type;

		private FactorialImplementation(Factorial type) {
			this.type = type;
		}
		
		private int factorial(int number) {
			return type.factorial(number);
		}

	}

	@Test
	public void zero_shouldBe_1() {
		for (FactorialImplementation implementation : FactorialImplementation.values()) {
			assertThat(implementation.factorial(0), is(1));
		}
	}

	@Test
	public void one_shouldBe_one() {
		for (FactorialImplementation implementation : FactorialImplementation.values()) {
			assertThat(implementation.factorial(1), is(1));
		}
	}

	@Test
	public void n_shouldBe_factorialOf_n_mult_minusOne() {
		int number = 5;
		for (FactorialImplementation implementation : FactorialImplementation.values()) {
			int factorialOf5 = implementation.factorial(number);
			assertThat(factorialOf5, is(not(0)));
			assertThat(factorialOf5, is(number * implementation.factorial(4)));
		}
	}

	@Test
	public void justToVerifyFactorialOfNine() {
		for (FactorialImplementation implementation : FactorialImplementation.values()) {
			assertThat(implementation.factorial(9), is(362880));
		}
	}
}
