package session2.assignment2;

/**
 * 
 * @author Amit
 *
 */
public class Candidate {

	private int CANDIDATE_RANK;
	private String candidateName;
	private College collegeAlloted;
	
	// stores the preferences of the candidate chosen by the candidate
	private Queue<College> candidateQueueForCollege;
	
	public Candidate() {
		this.candidateQueueForCollege=new Queue<College>();
		this.collegeAlloted=null;
	}

	public int getCANDIDATE_RANK() {
		return CANDIDATE_RANK;
	}

	public void setCANDIDATE_RANK(int cANDIDATE_RANK) {
		CANDIDATE_RANK = cANDIDATE_RANK;
	}

	public College getCollegeAlloted() {
		return collegeAlloted;
	}

	public void setCollegeAlloted(College collegeAlloted) {
		this.collegeAlloted = collegeAlloted;
	}

	public Queue<College> getCandidateQueueForCollege() {
		return candidateQueueForCollege;
	}

	public void setCandidateQueueForCollege(Queue<College> candidateQueueForCollege) {
		this.candidateQueueForCollege = candidateQueueForCollege;
	}

	public String getName() {
		return candidateName;
	}

	public void setName(String name) {
		this.candidateName = name;
	}
	
}
