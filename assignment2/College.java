package session2.assignment2;

public class College {

	private int COLLEGE_RANK;
	private String collegeName;
	private int TOTAL_SEATS;

	public College() {
		this.COLLEGE_RANK = 0;
		this.TOTAL_SEATS = 0;

	}

	public int getRANK() {
		return COLLEGE_RANK;
	}

	public void setRANK(int COLLEGE_RANK) {
		this.COLLEGE_RANK = COLLEGE_RANK;
	}

	public int getTOTAL_SEATS() {
		return TOTAL_SEATS;
	}

	public void setTOTAL_SEATS(int tOTAL_SEATS) {
		TOTAL_SEATS = tOTAL_SEATS;
	}

	public int getCOLLEGE_RANK() {
		return COLLEGE_RANK;
	}

	public void setCOLLEGE_RANK(int cOLLEGE_RANK) {
		COLLEGE_RANK = cOLLEGE_RANK;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
