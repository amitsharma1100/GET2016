package session4.assignment2;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
	static List<String> outputList;

	public static void main(String[] args) {
		outputList = new ArrayList<String>();
		outputList=new StringPermutation().getPermutations("ABC",outputList);
		for (int index = 0; index < outputList.size(); index++) {
			System.out.println("from list    " + outputList.get(index));
		}
	}

	List<String> getPermutations(String input, List<String> outputList) {
		// if string already exist return null
		if (outputList.contains(input)) {
			return null;
		} else {
			outputList.add(input); // if new string get then add in the list
		}
		// operations on sub string
		String combination = "";
		int inputLength = input.length();
		String lastCharacter = "" + (input.charAt(inputLength - 1)); 
		// get possible combinations
		for (int index = inputLength - 2; index >= 0; index--) {
			String firstPart = input.substring(0, index);
			String lastPart = input.substring(index, inputLength - 1);
			combination = firstPart + lastCharacter + lastPart;
			new StringPermutation().getPermutations(combination, outputList);
		}

		// return list of all possible combinations
		return outputList;
	}
}
