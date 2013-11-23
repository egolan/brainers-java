package org.eyal.brainers.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Anagram {

	public Map<String, String> findAnagrams(List<String> words) {
		Map<String, String> tempAnagramsMap = new HashMap<String, String>();
		for (String word : words) {
			String reversedWord = reverse(word);
			if (tempAnagramsMap.containsKey(reversedWord)) {
				tempAnagramsMap.put(reversedWord, word);
			} else {
				tempAnagramsMap.put(word, null);
			}
		}
		return clearNonAnagrams(tempAnagramsMap);
	}

	private Map<String, String> clearNonAnagrams(
			Map<String, String> suspectedAnagrams) {
			Map<String, String> result = new HashMap<String,String>();
			for (Entry<String, String> suspectedEntryOfEnagrams : suspectedAnagrams.entrySet()) {
				if (suspectedEntryOfEnagrams.getValue() != null) {
					result.put(suspectedEntryOfEnagrams.getKey(), suspectedEntryOfEnagrams.getValue());
				}
			}
		return result;
	}

	private String reverse(String word) {
		if (word.length() == 1) {
			return word;
		}
		String newPrefix = word.substring(word.length() - 1, word.length());
		return newPrefix + reverse(word.substring(0, word.length() - 1));
	}
}
