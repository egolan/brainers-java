package org.eyal.brainers.java;

import java.util.Locale;

public class Palindrome {

	public boolean isPalindrome(String word) {
		if (word == null) {
			return false;
		}
		char[] lowerCaseChars = createLowerCaseChars(word);
		return checkPalindromeWord(lowerCaseChars, 0, lowerCaseChars.length-1);
	}

	private char[] createLowerCaseChars(String word) {
		String lowerCaseWord = word.toLowerCase(Locale.ENGLISH);
		return lowerCaseWord.toCharArray();
	}

	private boolean checkPalindromeWord(char[] chars, int fromStartIndex,
			int fromEndIndex) {
		fromStartIndex = setFromStartIndex(chars, fromStartIndex);
		fromEndIndex = setFromEndIndex(chars, fromEndIndex);

		if (fromStartIndex >= fromEndIndex) {
			return true;
		}
		if (charsAreNotTheSame(chars, fromStartIndex, fromEndIndex)) {
			return false;
		}
		return checkPalindromeWord(chars, ++fromStartIndex, --fromEndIndex);
	}

	int setFromStartIndex(char[] chars, int fromStartIndex) {
		while (fromStartIndex < chars.length && !Character.isLetterOrDigit(chars[fromStartIndex])) {
			fromStartIndex++;
		}
		return fromStartIndex;
	}

	int setFromEndIndex(char[] chars, int fromEndIndex) {
		while (fromEndIndex >=0 && !Character.isLetterOrDigit(chars[fromEndIndex])) {
			fromEndIndex--;
		}
		return fromEndIndex;
	}

	private boolean charsAreNotTheSame(char[] chars, int fromStartIndex,
			int fromEndIndex) {
		return chars[fromStartIndex] != chars[fromEndIndex];
	}

}
