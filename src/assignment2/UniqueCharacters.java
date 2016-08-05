package session6.assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Amit
 * 
 */
public class UniqueCharacters {

	private Map<String, Integer> cache;

	public UniqueCharacters() {
		this.cache = new HashMap<String, Integer>();
	}

	/**
	 * determines the unique characters in the string
	 * 
	 * @param input
	 * @return
	 */
	public int uniqueCharacters(String input) {
		input = input.toLowerCase();

		// convert the input into a single word
		String[] spaceSeparatedValues = input.split(" ");
		input = "";
		for (String temp : spaceSeparatedValues) {
			input += temp.trim();
		}

		// check if the input is present in the cache
		int value = isPresentInCache(input);
		if (value != -1) {
			return value;
		} else {
			Map<Character, Integer> myMap = new HashMap<Character, Integer>();
			int totalChar = input.length();
			for (int index = 0; index < totalChar; index++) {
				myMap.put(input.charAt(index),
						myMap.get(input.charAt(index) + 1));
			}
			Set<Character> keySet = myMap.keySet();
			value = keySet.size();

			// add the character into the cache
			this.cache.put(input, value);
			return value;
		}
	}

	/**
	 * Checks if the input string is present in the cache
	 * 
	 * @param input
	 *            -the input string whose unique characters are to be determined
	 * @return true if there is a hit in the cache or returns false if there is
	 *         a miss
	 */
	public int isPresentInCache(String input) {
		if (this.cache.containsKey(input)) {
			return this.cache.get(input);
		} else {
			return -1;
		}
	}

}
