package session1.assignment2;

public class Digits extends Keys {

	private static int[] validDigitLabels;

	public static int[] getValidDigitLabels() {
		return validDigitLabels;
	}

	public static void setValidDigitLabels(int[] validDigitLabels) {
		Digits.validDigitLabels = validDigitLabels;
	}

	public Digits() {

	}

	public Digits(String label) {
		super(label);
	}

}
