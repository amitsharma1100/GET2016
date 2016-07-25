package session2.assignment2;

import java.util.Arrays;

public class QuestionComparator {
	public static void main(String[] args) {

		Questions[] questionsArray = new Questions[4];
		questionsArray[0] = new Questions("Overall Rating", "Single Select", "1/2/3/4/5");
		questionsArray[1] = new Questions("Area of improvement", "Multi Select", "Service Quality/ Communication/ Delivery Process");
		questionsArray[2] = new Questions("Feedback", "Text", "");
		questionsArray[3] = new Questions("Strengths", "Text", "");
		Arrays.sort(questionsArray);
		System.out.println("Default Sorting :\n"
				+ Arrays.toString(questionsArray));
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		
		// sort employees array using Comparator by Name
		Arrays.sort(questionsArray, Questions.TextComparator);
		System.out
				.println("Questions list sorted by text:\n" + Arrays.toString(questionsArray));
	}

}
