package session2.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Questions {

	int totalSingleSelectOptions;
	SingleSelect singleSelectObject;
	int[] indicesOfSingleSelectQuestion;
	List<String> questionNumber;
	List<String> questionLabel;
	List<String> questionType;
	List<String> options;
	
	public Questions() {
		this.questionNumber = new ArrayList<String>();
		this.questionLabel = new ArrayList<String>();
		this.questionType = new ArrayList<String>();
		this.options = new ArrayList<String>();
	}

	public List<String> getQuestionLabel() {
		return questionLabel;
	}

	public void setQuestionLabel(List<String> questionLabel) {
		this.questionLabel = questionLabel;
	}

	public List<String> getQuestionType() {
		return questionType;
	}

	public void setQuestionType(List<String> questionType) {
		this.questionType = questionType;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public List<String> getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(List<String> questionNumber) {
		this.questionNumber = questionNumber;
	}

	public int getTotalSingleSelectOptions() {
		return totalSingleSelectOptions;
	}

	public void setTotalSingleSelectOptions(Questions question) {
		int count = 0;
		int size = question.questionType.size();
		for (int index = 0; index < size; index++) {
			if (question.questionType.get(index).toString().equalsIgnoreCase("Single Select")) {
				this.singleSelectObject=new SingleSelect();
				singleSelectObject.setOptionsForSingleSelect(question.options.get(index));
				count++;
			}
			
		}
		this.indicesOfSingleSelectQuestion=new int[count];
		int indexForSingle=0;
		for (int index = 0; index < size; index++) {
			if (question.questionType.get(index).toString().equalsIgnoreCase("Single Select")) {
				indicesOfSingleSelectQuestion[indexForSingle++]=index;
			}
			
		}
		this.totalSingleSelectOptions = count;
	}

}