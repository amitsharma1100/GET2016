package session2.assignment2;

import java.util.Comparator;

public class Questions implements Comparable<Questions>{
	private String question;
	private String typeOfQuestion;
	private String options;
	
	
	public Questions(String question, String typeOfQuestion, String options) {
		super();
		this.question = question;
		this.typeOfQuestion = typeOfQuestion;
		this.options = options;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getTypeOfQuestion() {
		return typeOfQuestion;
	}
	public void setTypeOfQuestion(String typeOfQuestion) {
		this.typeOfQuestion = typeOfQuestion;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}

	public static Comparator<Questions> TextComparator = new Comparator<Questions>() {

        @Override
        public int compare(Questions q1, Questions q2) {
            return q1.getQuestion().compareTo(q2.getQuestion());
        }
    };
	
	@Override
	public int compareTo(Questions o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[question-" + this.question + ", type=" + this.typeOfQuestion + ", options=" + this.options+ "]";
    }

}
