package org.eyal.brainers.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eyal.brainers.java.Anagram;
import org.junit.Test;

public class AnagramTest {

	@Test
	public void emptyListReturnsEmptyMapOfAnagrams() {
		List<String> words = new LinkedList<String>();
		Anagram anagram = new Anagram();
		Map<String,String> anagramsWords = anagram.findAnagrams(words);
		
		assertTrue("map of anagrams is not empty", anagramsWords.size()==0);
	}

	@Test
	public void twoWordsAreAnagrams() {
		//cat, abcd, tac, bdca
		List<String> words = new LinkedList<String>();
		words.add("cat");
		words.add("abcd");
		words.add("nope");
		words.add("tac");
		words.add("dcba");

		Anagram anagram = new Anagram();
		Map<String,String> anagramsWords = anagram.findAnagrams(words);
		
		Map<String,String> expected = new HashMap<String,String>();
		expected.put("cat","tac");
		expected.put("abcd","dcba");
		
		assertEquals(expected, anagramsWords);
	}
}
