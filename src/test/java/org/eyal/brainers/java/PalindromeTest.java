package org.eyal.brainers.java;

import static org.junit.Assert.*;

import org.eyal.brainers.java.Palindrome;
import org.junit.Test;

public class PalindromeTest {
	private Palindrome palindrome = new Palindrome();

	@Test
	public void emptyWordIsPalindrome() {
		assertTrue("empty word is not palindrom", palindrome.isPalindrome(""));
	}

	@Test
	public void nullIsNotPalindrome() {
		assertFalse("null is palindrom", palindrome.isPalindrome(null));
	}

	@Test
	public void simpleWordIsPalindrome() {
		assertTrue("racecar is not palindrom", palindrome.isPalindrome("racecar"));
	}

	@Test
	public void spacesWordIsPalindrome() {
		assertTrue("'   ' is not palindrom", palindrome.isPalindrome("   "));
	}

	@Test
	public void simpleWordWithSpaceIsPalindrome() {
		assertTrue("' racecar' is not palindrom", palindrome.isPalindrome(" racecar"));
	}

	@Test
	public void simpleNonPalindromeIsNotPalindrome() {
		assertFalse("ball is palindrom", palindrome.isPalindrome("ball"));
	}

	@Test
	public void wordsWithBlanksIsPalindrome() {
		assertTrue("'A man, a plan, a canal, Panama.' is not palindrom", palindrome.isPalindrome("A man, a plan, a canal, Panama."));
	}

}
