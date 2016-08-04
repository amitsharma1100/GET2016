package session5.assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Amit
 *
 */
public class MyMap {

	private Map<Character, List<Integer>> concordanceMap;

	public MyMap() {
		concordanceMap = new HashMap<Character, List<Integer>>();
	}

	public Map<Character, List<Integer>> getConcordanceMap() {
		return concordanceMap;
	}

	public void setConcordanceMap(Map<Character, List<Integer>> concordanceMap) {
		this.concordanceMap = concordanceMap;
	}

	/**
	 * Processes the input string and records the occurence 
	 * of characters at different indices
	 * @param input
	 */
	public void process(String input) {
		if (input.length() == 0) {
			System.out.println("Can't process empty string");
			return;
		} else {
			int totalChar = input.length();
			for (int index = 0; index < totalChar; index++) {
				char ch = input.charAt(index);
				List<Integer> indicesList = this.getConcordanceMap().get(ch);
				if (indicesList == null) {
					indicesList = new ArrayList<Integer>();
				}
				indicesList.add(index);
				this.getConcordanceMap().put(ch, indicesList);
			}
		}
	}

}
