package session1.assignment2;

public class Operators extends Keys {

	private static String[] validOperatorLabels;

	public Operators() {
		// TODO Auto-generated constructor stub
	}

	public Operators(String label) {
		super(label);
	}

	public static String[] getValidOperatorLabels() {
		return validOperatorLabels;
	}

	public static void setValidOperatorLabels(String[] validOperatorLabels) {
		Operators.validOperatorLabels = validOperatorLabels;
	}
	
	public Double perFormOperation(int operand1,int operand2,String operator)
	{
		return null;
		
	}
}
