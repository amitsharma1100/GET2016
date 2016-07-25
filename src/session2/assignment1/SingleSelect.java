package session2.assignment1;

public class SingleSelect  {

	int[] singleSelectOptions;
	
	int getTotalOptions()
	{
		return this.singleSelectOptions.length;
	}

	public SingleSelect() {
	}

	public void setOptionsForSingleSelect(String optionsList) {
		String[] slashSeparatedValues = optionsList.substring(1, optionsList.length()-2).split("[/]");
		int numberOfOptions=slashSeparatedValues.length;
		this.singleSelectOptions = new int[numberOfOptions];
		for (int optionsIndex = 0; optionsIndex < numberOfOptions; optionsIndex++) {
			this.singleSelectOptions[optionsIndex] = Integer.parseInt(slashSeparatedValues[optionsIndex].toString());
		}
	}

}